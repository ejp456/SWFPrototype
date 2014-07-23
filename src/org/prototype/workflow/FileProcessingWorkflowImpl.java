package org.prototype.workflow;



import org.prototype.importservice.ImportActivitiesClient;
import org.prototype.importservice.ImportActivitiesClientImpl;
import org.prototype.verifyservice.VerifyActivitiesClient;
import org.prototype.verifyservice.VerifyActivitiesClientImpl;
import org.prototype.qualifyservice.QualifyActivitiesClient;
import org.prototype.qualifyservice.QualifyActivitiesClientImpl;

import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

public class FileProcessingWorkflowImpl implements FileProcessingWorkflow{
	private String state = "Started";
	ImportActivitiesClient importer = new ImportActivitiesClientImpl(); 
	VerifyActivitiesClient verifier = new VerifyActivitiesClientImpl();
	QualifyActivitiesClient qualifier = new QualifyActivitiesClientImpl();
	Promise<Boolean> verified;
	Promise<Boolean> qualified;
	@Override
	public void processFile(String fileName) {
		new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
            	Promise<String> filename = importer.importFile(fileName);
            	verified = isVerified(filename);
            	qualified = isQualified(filename);
            		

            	

        		
            }
            @Override
            protected void doCatch(Throwable e) throws Throwable {
                state = "Failed: " + e.getMessage();
                System.out.println(state);
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (!state.startsWith("Failed:")) {
                	if(qualified.get() && verified.get()){
            			System.out.println("File has been validated");
            		}
                    state = "Completed";
                }
            }
        };
	}
	@Asynchronous
	public Promise<Boolean> isVerified(Promise<String> filename){
		return verifier.verifyFile(filename);
	}
	@Asynchronous
	public Promise<Boolean> isQualified(Promise<String> filename){
		return qualifier.qualifyFile(filename);
	}

}

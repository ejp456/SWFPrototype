package org.prototype.workflow;



import org.prototype.importservice.ImportActivitiesClient;
import org.prototype.importservice.ImportActivitiesClientImpl;
import org.prototype.verifyservice.VerifyActivitiesClient;
import org.prototype.verifyservice.VerifyActivitiesClientImpl;
import org.prototype.qualifyservice.QualifyActivitiesClient;
import org.prototype.qualifyservice.QualifyActivitiesClientImpl;

import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

public class FileProcessingWorkflowImpl implements FileProcessingWorkflow{
	private String state = "Started";
	ImportActivitiesClient importer = new ImportActivitiesClientImpl(); 
	VerifyActivitiesClient verifier = new VerifyActivitiesClientImpl();
	QualifyActivitiesClient qualifier = new QualifyActivitiesClientImpl();
	@Override
	public void processFile(String fileName) {
		
		new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
            	Promise<String> filename = importer.importFile(fileName);
            	isVerified(filename);
            	isQualified(filename);

        		
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                state = "Failed: " + e.getMessage();
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (!state.startsWith("Failed:")) {
                    state = "Completed";
                }
            }
        };
	}
	@Asynchronous
	public Promise<Boolean> isVerified(Promise<String> filename){
		return (verifier.verifyFile(filename));
	}
	@Asynchronous
	public Promise<Boolean> isQualified(Promise<String> filename){
		return(qualifier.qualifyFile(filename));
	}

}

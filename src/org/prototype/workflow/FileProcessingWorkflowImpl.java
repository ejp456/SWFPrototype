package org.prototype.workflow;



import java.io.IOException;
import java.util.List;
import org.prototype.processfile.ProcessFileActivities;

import org.prototype.processfile.ProcessFileActivitiesImpl;
import org.xml.sax.SAXException;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

public class FileProcessingWorkflowImpl implements FileProcessingWorkflow{
	private String state = "Started";
	ProcessFileActivities processor = new ProcessFileActivitiesImpl(); 
	
	@Override
	public void processFile(List<String> files) {
		new TryCatchFinally() {
            @Override
            protected void doTry() throws Throwable {
            	processor.processFiles(files);
            }
            @Override
            protected void doCatch(Throwable e) throws Throwable {
                state = "Failed: " + e.getMessage();
                if(e instanceof SAXException){
                	System.out.println("Invalid XML File");
                }else if(e instanceof IOException){
                	System.out.println("File could not be read");
                }else{
                	System.out.println(state);
                	throw e;
                }
            }
            @Override
            protected void doFinally() throws Throwable {
           
            }
        };
		
	}
	
	@Asynchronous
    private void retryOnFailure(@Wait Promise<Throwable> failureP,final List<String> files,final int index) {
	Throwable failure = failureP.get();
		if (failure != null) {
			System.out.println("Index is "+index);

		}
    }
	
	
}

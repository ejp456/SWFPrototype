package org.prototype;

import org.prototype.importservice.ImportActivitiesImpl;
import org.prototype.qualifyservice.QualifyActivitiesImpl;
import org.prototype.verifyservice.VerifyActivitiesImpl;
import org.prototype.workflow.FileProcessingWorkflowImpl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

public class Worker {
	public static void main(String[] args) throws Exception {
	     ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);
	     String swfAccessId = System.getenv("AccessId") ;
	     String swfSecretKey = System.getenv("SecretKey");
	     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

	     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
	     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

	     String domain = "prototype";
	     String taskListToPoll = "FileProcessingList";

	     ActivityWorker aw = new ActivityWorker(service, domain, taskListToPoll);
	     //Add Activities to definition
	     aw.addActivitiesImplementation(new ImportActivitiesImpl());
	     aw.addActivitiesImplementation(new VerifyActivitiesImpl());
	     aw.addActivitiesImplementation(new QualifyActivitiesImpl());
	     //Start polling for activities
	     aw.start();

	     WorkflowWorker wfw = new WorkflowWorker(service, domain, taskListToPoll);
	     wfw.addWorkflowImplementationType(FileProcessingWorkflowImpl.class);
	     //Start polling for workflow start
	     wfw.start();
	   }
}

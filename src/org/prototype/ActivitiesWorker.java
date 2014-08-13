package org.prototype;

import org.prototype.importservice.ImportActivitiesImpl;
import org.prototype.processfile.ProcessFileActivitiesImpl;
import org.prototype.qualifyservice.QualifyActivitiesImpl;
import org.prototype.validate.ValidateActivitiesImpl;
import org.prototype.verifyservice.VerifyActivitiesImpl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;

public class ActivitiesWorker {

	public static void main(String[] args) throws Exception{
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
	     aw.addActivitiesImplementation(new ValidateActivitiesImpl());
	     //Start polling for activities
	     aw.start();

	}

}

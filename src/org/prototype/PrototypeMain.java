package org.prototype;


import org.prototype.workflow.FileProcessingWorkflowClientExternal;
import org.prototype.workflow.FileProcessingWorkflowClientExternalFactory;
import org.prototype.workflow.FileProcessingWorkflowClientExternalFactoryImpl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;

public class PrototypeMain {
	public static void main(String[] args){
		ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);

	     String test = System.getenv("test");
	     String swfAccessId = "Insert Access ID" ;
	     String swfSecretKey = "Insert Secret Key";
	     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

	     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
	     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

	     String domain = "prototype";

	     FileProcessingWorkflowClientExternalFactory factory = new FileProcessingWorkflowClientExternalFactoryImpl(service, domain);
	     FileProcessingWorkflowClientExternal processor = factory.getClient("someID");
	     //Start workflow process
	     processor.processFile("131");
	     System.out.println("Here wtf");
	}
}

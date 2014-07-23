package org.prototype;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.prototype.workflow.FileProcessingWorkflowClientExternal;
import org.prototype.workflow.FileProcessingWorkflowClientExternalFactory;
import org.prototype.workflow.FileProcessingWorkflowClientExternalFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;

public class PrototypeMain {
	public static void main(String[] args){
		ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);

	     String test = System.getenv("test");
	     String swfAccessId = System.getenv("AccessId") ;
	     String swfSecretKey = System.getenv("SecretKey");
	     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

	     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
	     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

	     String domain = "prototype";

	     FileProcessingWorkflowClientExternalFactory factory = new FileProcessingWorkflowClientExternalFactoryImpl(service, domain);
	     FileProcessingWorkflowClientExternal processor = factory.getClient("someID");
	     //Start workflow process
	     processor.processFile("Test.xml");
	     processor.processFile("Invalid.xml");
	}
	
}


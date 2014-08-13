package org.prototype.importservice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ImportActivitiesImpl implements ImportActivities{

	@Override
	public String importFile(String filename){
		System.out.println("String: "+filename+" is being imported");
		Source xmlFile = new StreamSource(new File(filename));
		SchemaFactory schemaFactory = SchemaFactory
		    .newInstance("http://www.w3.org/2001/XMLSchema");
		Schema schema;
		try {
			schema = schemaFactory.newSchema(new File("Schema.xsd"));
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
			System.out.println(xmlFile.getSystemId() + " is valid");
		} catch (SAXException e) {
			System.out.println("Invalid File");
			filename = null;
		} catch (IOException e) {
			System.out.println("Cannot Read File");
			filename = null;
		}

		return filename;
	}



}
/*
 * 
 */
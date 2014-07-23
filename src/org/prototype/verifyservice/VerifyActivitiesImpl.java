package org.prototype.verifyservice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VerifyActivitiesImpl implements VerifyActivities {

	@Override
	public Boolean verifyFile(String fileName) throws ParserConfigurationException, SAXException, IOException {
		Boolean containsValidString = false;
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("word");
		for(int i=0;i<nList.getLength();i++){
			 if(FizzBuzz(nList.item(i).getTextContent())){
				 containsValidString=true;
				 break;
			 }
		 }
		return containsValidString;
		
	}
	public Boolean FizzBuzz(String word){
		Boolean isValid = true;
		if(word.length()%5==0 && word.length()%3==0){
			System.out.println("FizzBuzz");
		}else if(word.length()%5==0){
			System.out.println("Fizz");
		}else if(word.length()%3==0){
			System.out.println("Buzz");
		}else{
			System.out.println("Invalid String");
			isValid = false;
		}
		return isValid;
	}

}

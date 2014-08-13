package org.prototype.processfile;

import java.util.List;

import org.prototype.importservice.ImportActivitiesClient;
import org.prototype.importservice.ImportActivitiesClientImpl;
import org.prototype.qualifyservice.QualifyActivitiesClient;
import org.prototype.qualifyservice.QualifyActivitiesClientImpl;
import org.prototype.validate.ValidateActivitiesClient;
import org.prototype.validate.ValidateActivitiesClientImpl;
import org.prototype.verifyservice.VerifyActivitiesClient;
import org.prototype.verifyservice.VerifyActivitiesClientImpl;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class ProcessFileActivitiesImpl implements ProcessFileActivities{
	ImportActivitiesClient importer = new ImportActivitiesClientImpl(); 
	VerifyActivitiesClient verifier = new VerifyActivitiesClientImpl();
	QualifyActivitiesClient qualifier = new QualifyActivitiesClientImpl();
	ValidateActivitiesClient validater = new ValidateActivitiesClientImpl();
	@Override
	public void processFiles(List<String> files) {
		System.out.println("here");
		for(String filename : files){
			Promise<String> file = importFile(Promise.asPromise(filename));
			Promise<Boolean> isQualified = qualifyFile(file);
			Promise<Boolean> isVerified = verifyFile(file);
			isFileValidated(isVerified,isQualified,file);
		}
		
	}
	@Asynchronous
	public Promise<String> importFile(@Wait Promise<String> filename){
		return importer.importFile(filename);
	}
	@Asynchronous 
	public Promise<Boolean> verifyFile(@Wait Promise<String> filename){
		return verifier.verifyFile(filename);
	}
	@Asynchronous Promise<Boolean> qualifyFile(@Wait Promise<String> filename){
		return qualifier.qualifyFile(filename);
	}
	@Asynchronous
	private void isFileValidated(@Wait Promise<Boolean> isVerified, @Wait Promise<Boolean> isQualified, @Wait Promise<String> filename){
		validater.validateFile(isVerified, isQualified, filename);
	}

}

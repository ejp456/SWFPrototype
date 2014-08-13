package org.prototype.validate;

public class ValidateActivitiesImpl implements ValidateActivities {

	@Override
	public void validateFile(Boolean isVerified, Boolean isQualified, String filename) {
		String file = filename;
		if(isVerified && isQualified){
			System.out.println(file+" is validated");
		}
		
	}

}

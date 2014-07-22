package org.prototype.verifyservice;

public class VerifyActivitiesImpl implements VerifyActivities {

	@Override
	public Boolean verifyFile(String fileName) {
		Boolean isValid = true;
		if(fileName.length()%5==0 && fileName.length()%3==0){
			System.out.println("FizzBuzz");
		}else if(fileName.length()%5==0){
			System.out.println("Fizz");
		}else if(fileName.length()%3==0){
			System.out.println("Buzz");
		}else{
			System.out.println("Invalid String");
			isValid = false;
		}
		return isValid;
	}

}

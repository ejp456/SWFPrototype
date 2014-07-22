package org.prototype.qualifyservice;

public class QualifyActivitiesImpl implements QualifyActivities{

	@Override
	public Boolean qualifyFile(String filename) {
		// TODO Auto-generated method stub
		if(isPalindrome(filename)){
			System.out.println("is qualified");
			return true;
		}else{
			return false;
		}
		
	}
	public Boolean isPalindrome(String word){
		Boolean isPal = true;
		int j = word.length()-1;
		char[] wordArray = word.toCharArray();
		for(int i=0;i<word.length()/2;i++){
			if(wordArray[i]!=wordArray[j]){
				isPal=false;
				break;
			}
		}
		return isPal;
	}

}

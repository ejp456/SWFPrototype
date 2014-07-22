package org.prototype.importservice;

public class ImportActivitiesImpl implements ImportActivities{

	@Override
	public String importFile(String filename) {
		System.out.println("String: "+filename+" is being imported");
		return filename;
	}

}

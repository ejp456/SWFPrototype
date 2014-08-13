package org.prototype.processfile;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;


public interface ProcessFileActivities {
	public void processFiles(List<String> files);
}

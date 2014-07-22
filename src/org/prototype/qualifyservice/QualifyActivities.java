package org.prototype.qualifyservice;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@Activities(version="3.0")
@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 60, defaultTaskStartToCloseTimeoutSeconds = 60)
public interface QualifyActivities {
	public Boolean qualifyFile(String filename);
	public Boolean isPalindrome(String word);
}

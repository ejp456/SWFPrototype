package org.prototype.workflow;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;
//Register multiple workflow classes?
@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 300, defaultTaskStartToCloseTimeoutSeconds = 10)
public interface FileProcessingWorkflow {
	@Execute(name = "ProcessFile", version = "5.0")
	public void processFile(List<String> files);
}

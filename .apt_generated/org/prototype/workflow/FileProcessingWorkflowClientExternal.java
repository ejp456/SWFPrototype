/**
 * This code was generated from {@link org.prototype.workflow.FileProcessingWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.workflow;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

public interface FileProcessingWorkflowClientExternal extends WorkflowClientExternal
{
    void processFile(java.lang.String fileName);
    void processFile(java.lang.String fileName, StartWorkflowOptions optionsOverride);
}
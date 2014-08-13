/**
 * This code was generated from {@link org.prototype.workflow.FileProcessingWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.workflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

public interface FileProcessingWorkflowClient extends WorkflowClient
{
    Promise<Void> processFile(java.util.List<java.lang.String> files);
    Promise<Void> processFile(java.util.List<java.lang.String> files, Promise<?>... waitFor);
    Promise<Void> processFile(java.util.List<java.lang.String> files, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
    Promise<Void> processFile(Promise<java.util.List<java.lang.String>> files);
    Promise<Void> processFile(Promise<java.util.List<java.lang.String>> files, Promise<?>... waitFor);
    Promise<Void> processFile(Promise<java.util.List<java.lang.String>> files, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}
/**
 * This code was generated from {@link org.prototype.workflow.FileProcessingWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientBase;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class FileProcessingWorkflowClientImpl extends WorkflowClientBase implements FileProcessingWorkflowClient {

    public FileProcessingWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,  
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }
    
    @Override
    public final Promise<Void> processFile(java.lang.String fileName) { 
        return processFile(Promise.asPromise(fileName), (StartWorkflowOptions)null);
    }
    
    @Override
    public final Promise<Void> processFile(java.lang.String fileName, Promise<?>... waitFor) {
        return processFile(Promise.asPromise(fileName), (StartWorkflowOptions)null, waitFor);
    }
    
    
    @Override
    
    public final Promise<Void> processFile(java.lang.String fileName, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        return processFile(Promise.asPromise(fileName), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> processFile(Promise<java.lang.String> fileName) {
        return processFile(fileName, (StartWorkflowOptions)null);
    }

    @Override
    public final Promise<Void> processFile(Promise<java.lang.String> fileName, Promise<?>... waitFor) {
        return processFile(fileName, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final Promise<Void> processFile(Promise<java.lang.String> fileName, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        Promise[] _input_ = new Promise[1];
        _input_[0] = fileName;
        return (Promise) startWorkflowExecution(_input_, optionsOverride, Void.class, waitFor);
    }
    	

}
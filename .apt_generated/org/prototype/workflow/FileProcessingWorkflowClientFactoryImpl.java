/**
 * This code was generated from {@link org.prototype.workflow.FileProcessingWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class FileProcessingWorkflowClientFactoryImpl extends WorkflowClientFactoryBase<FileProcessingWorkflowClient> implements FileProcessingWorkflowClientFactory {
    
    public FileProcessingWorkflowClientFactoryImpl() {
        this(null, null, null);
    }

    public FileProcessingWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public FileProcessingWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public FileProcessingWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        super(startWorkflowOptions, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), genericClient);
    }
    
    @Override
    protected FileProcessingWorkflowClient createClientInstance(WorkflowExecution execution,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType.setName("ProcessFile");
        workflowType.setVersion("5.0");
        return new FileProcessingWorkflowClientImpl(execution, workflowType, options, dataConverter, genericClient);
    }
   
}
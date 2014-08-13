/**
 * This code was generated from {@link org.prototype.workflow.FileProcessingWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.workflow;

import com.amazonaws.services.simpleworkflow.flow.core.AndPromise;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClientBase;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;

public class FileProcessingWorkflowSelfClientImpl extends WorkflowSelfClientBase implements FileProcessingWorkflowSelfClient {

    public FileProcessingWorkflowSelfClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public FileProcessingWorkflowSelfClientImpl(GenericWorkflowClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public FileProcessingWorkflowSelfClientImpl(GenericWorkflowClient genericClient, 
            DataConverter dataConverter, StartWorkflowOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }

    @Override
    public final void processFile(java.util.List<java.lang.String> files) { 
        processFileImpl(Promise.asPromise(files), (StartWorkflowOptions)null);
    }

    @Override
    public final void processFile(java.util.List<java.lang.String> files, Promise<?>... waitFor) { 
        processFileImpl(Promise.asPromise(files), (StartWorkflowOptions)null, waitFor);
    }
    
    @Override
    public final void processFile(java.util.List<java.lang.String> files, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        processFileImpl(Promise.asPromise(files), optionsOverride, waitFor);
    }
    
    @Override
    public final void processFile(Promise<java.util.List<java.lang.String>> files) {
        processFileImpl(files, (StartWorkflowOptions)null);
    }

    @Override
    public final void processFile(Promise<java.util.List<java.lang.String>> files, Promise<?>... waitFor) {
        processFileImpl(files, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    public final void processFile(Promise<java.util.List<java.lang.String>> files, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        processFileImpl(files, optionsOverride, waitFor);
    }
    
    protected void processFileImpl(final Promise<java.util.List<java.lang.String>> files, final StartWorkflowOptions schedulingOptionsOverride, Promise<?>... waitFor) {
        new Task(new Promise[] { files, new AndPromise(waitFor) }) {
    		@Override
			protected void doExecute() throws Throwable {
                ContinueAsNewWorkflowExecutionParameters _parameters_ = new ContinueAsNewWorkflowExecutionParameters();
                Object[] _input_ = new Object[1];
                _input_[0] = files.get();
                String _stringInput_ = dataConverter.toData(_input_);
				_parameters_.setInput(_stringInput_);
				_parameters_ = _parameters_.createContinueAsNewParametersFromOptions(schedulingOptions, schedulingOptionsOverride);
                
                if (genericClient == null) {
                    genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
                }
                genericClient.continueAsNewOnCompletion(_parameters_);
			}
		};
    }
}
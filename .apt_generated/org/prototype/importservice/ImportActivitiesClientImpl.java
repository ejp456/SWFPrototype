/**
 * This code was generated from {@link org.prototype.importservice.ImportActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.importservice;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class ImportActivitiesClientImpl extends ActivitiesClientBase implements ImportActivitiesClient {

	public ImportActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public ImportActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public ImportActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<java.lang.String> importFile(java.lang.String filename) {
        return importFileImpl(Promise.asPromise(filename), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.String> importFile(java.lang.String filename, Promise<?>... waitFor) {
        return importFileImpl(Promise.asPromise(filename), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.String> importFile(java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return importFileImpl(Promise.asPromise(filename), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.String> importFile(Promise<java.lang.String> filename) {
        return importFileImpl(filename, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.String> importFile(Promise<java.lang.String> filename, Promise<?>... waitFor) {
        return importFileImpl(filename, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.String> importFile(Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return importFileImpl(filename, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.String> importFileImpl(final Promise<java.lang.String> filename, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("ImportActivities.importFile");
		activityType.setVersion("5.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = filename;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.String.class, waitFor);
    }

}
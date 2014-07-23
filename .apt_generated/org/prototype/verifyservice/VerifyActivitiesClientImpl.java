/**
 * This code was generated from {@link org.prototype.verifyservice.VerifyActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.verifyservice;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class VerifyActivitiesClientImpl extends ActivitiesClientBase implements VerifyActivitiesClient {

	public VerifyActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public VerifyActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public VerifyActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<java.lang.Boolean> verifyFile(java.lang.String fileName) {
        return verifyFileImpl(Promise.asPromise(fileName), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> verifyFile(java.lang.String fileName, Promise<?>... waitFor) {
        return verifyFileImpl(Promise.asPromise(fileName), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> verifyFile(java.lang.String fileName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return verifyFileImpl(Promise.asPromise(fileName), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName) {
        return verifyFileImpl(fileName, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName, Promise<?>... waitFor) {
        return verifyFileImpl(fileName, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return verifyFileImpl(fileName, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.Boolean> verifyFileImpl(final Promise<java.lang.String> fileName, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("VerifyActivities.verifyFile");
		activityType.setVersion("4.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = fileName;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.Boolean.class, waitFor);
    }

}
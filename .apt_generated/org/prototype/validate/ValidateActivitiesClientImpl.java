/**
 * This code was generated from {@link org.prototype.validate.ValidateActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.validate;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class ValidateActivitiesClientImpl extends ActivitiesClientBase implements ValidateActivitiesClient {

	public ValidateActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public ValidateActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public ValidateActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename) {
        return validateFileImpl(Promise.asPromise(isVerified), Promise.asPromise(isQualified), Promise.asPromise(filename), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename, Promise<?>... waitFor) {
        return validateFileImpl(Promise.asPromise(isVerified), Promise.asPromise(isQualified), Promise.asPromise(filename), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return validateFileImpl(Promise.asPromise(isVerified), Promise.asPromise(isQualified), Promise.asPromise(filename), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename) {
        return validateFileImpl(isVerified, isQualified, filename, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename, Promise<?>... waitFor) {
        return validateFileImpl(isVerified, isQualified, filename, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return validateFileImpl(isVerified, isQualified, filename, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Void> validateFileImpl(final Promise<java.lang.Boolean> isVerified, final Promise<java.lang.Boolean> isQualified, final Promise<java.lang.String> filename, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("ValidateActivities.validateFile");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[3];
        _input_[0] = isVerified;
        _input_[1] = isQualified;
        _input_[2] = filename;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Void.class, waitFor);
    }

}
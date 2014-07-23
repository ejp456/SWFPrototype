/**
 * This code was generated from {@link org.prototype.qualifyservice.QualifyActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.qualifyservice;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class QualifyActivitiesClientImpl extends ActivitiesClientBase implements QualifyActivitiesClient {

	public QualifyActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public QualifyActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public QualifyActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<java.lang.Boolean> qualifyFile(java.lang.String filename) {
        return qualifyFileImpl(Promise.asPromise(filename), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> qualifyFile(java.lang.String filename, Promise<?>... waitFor) {
        return qualifyFileImpl(Promise.asPromise(filename), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> qualifyFile(java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return qualifyFileImpl(Promise.asPromise(filename), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename) {
        return qualifyFileImpl(filename, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename, Promise<?>... waitFor) {
        return qualifyFileImpl(filename, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return qualifyFileImpl(filename, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.Boolean> qualifyFileImpl(final Promise<java.lang.String> filename, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("QualifyActivities.qualifyFile");
		activityType.setVersion("4.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = filename;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.Boolean.class, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(java.lang.String word) {
        return isPalindromeImpl(Promise.asPromise(word), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(java.lang.String word, Promise<?>... waitFor) {
        return isPalindromeImpl(Promise.asPromise(word), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(java.lang.String word, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return isPalindromeImpl(Promise.asPromise(word), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word) {
        return isPalindromeImpl(word, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word, Promise<?>... waitFor) {
        return isPalindromeImpl(word, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return isPalindromeImpl(word, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.Boolean> isPalindromeImpl(final Promise<java.lang.String> word, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("QualifyActivities.isPalindrome");
		activityType.setVersion("4.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = word;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.Boolean.class, waitFor);
    }

}
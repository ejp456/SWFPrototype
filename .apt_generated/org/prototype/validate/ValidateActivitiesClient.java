/**
 * This code was generated from {@link org.prototype.validate.ValidateActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.validate;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface ValidateActivitiesClient extends ActivitiesClient
{
    Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename);
    Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename, Promise<?>... waitFor);
    Promise<Void> validateFile(java.lang.Boolean isVerified, java.lang.Boolean isQualified, java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename);
    Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename, Promise<?>... waitFor);
    Promise<Void> validateFile(Promise<java.lang.Boolean> isVerified, Promise<java.lang.Boolean> isQualified, Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}
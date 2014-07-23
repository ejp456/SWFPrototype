/**
 * This code was generated from {@link org.prototype.verifyservice.VerifyActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.verifyservice;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface VerifyActivitiesClient extends ActivitiesClient
{
    Promise<java.lang.Boolean> verifyFile(java.lang.String fileName);
    Promise<java.lang.Boolean> verifyFile(java.lang.String fileName, Promise<?>... waitFor);
    Promise<java.lang.Boolean> verifyFile(java.lang.String fileName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName);
    Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName, Promise<?>... waitFor);
    Promise<java.lang.Boolean> verifyFile(Promise<java.lang.String> fileName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}
/**
 * This code was generated from {@link org.prototype.importservice.ImportActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.importservice;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface ImportActivitiesClient extends ActivitiesClient
{
    Promise<java.lang.String> importFile(java.lang.String filename);
    Promise<java.lang.String> importFile(java.lang.String filename, Promise<?>... waitFor);
    Promise<java.lang.String> importFile(java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.String> importFile(Promise<java.lang.String> filename);
    Promise<java.lang.String> importFile(Promise<java.lang.String> filename, Promise<?>... waitFor);
    Promise<java.lang.String> importFile(Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}
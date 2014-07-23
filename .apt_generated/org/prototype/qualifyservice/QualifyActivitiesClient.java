/**
 * This code was generated from {@link org.prototype.qualifyservice.QualifyActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package org.prototype.qualifyservice;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface QualifyActivitiesClient extends ActivitiesClient
{
    Promise<java.lang.Boolean> qualifyFile(java.lang.String filename);
    Promise<java.lang.Boolean> qualifyFile(java.lang.String filename, Promise<?>... waitFor);
    Promise<java.lang.Boolean> qualifyFile(java.lang.String filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename);
    Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename, Promise<?>... waitFor);
    Promise<java.lang.Boolean> qualifyFile(Promise<java.lang.String> filename, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.Boolean> isPalindrome(java.lang.String word);
    Promise<java.lang.Boolean> isPalindrome(java.lang.String word, Promise<?>... waitFor);
    Promise<java.lang.Boolean> isPalindrome(java.lang.String word, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word);
    Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word, Promise<?>... waitFor);
    Promise<java.lang.Boolean> isPalindrome(Promise<java.lang.String> word, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}
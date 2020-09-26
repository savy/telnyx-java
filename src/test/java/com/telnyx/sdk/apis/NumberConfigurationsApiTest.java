/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListMessagingSettingsResponse;
import com.telnyx.sdk.models.ListPhoneNumbersResponse;
import com.telnyx.sdk.models.ListPhoneNumbersWithVoiceSettingsResponse;
import com.telnyx.sdk.models.PhoneNumberEnableEmergency;
import com.telnyx.sdk.models.PhoneNumberEnableEmergencyRequest;
import com.telnyx.sdk.models.PhoneNumberResponse;
import com.telnyx.sdk.models.RetrieveMessagingSettingsResponse;
import com.telnyx.sdk.models.RetrievePhoneNumberVoiceResponse;
import com.telnyx.sdk.models.UpdatePhoneNumberMessagingSettingsRequest;
import com.telnyx.sdk.models.UpdatePhoneNumberRequest;
import com.telnyx.sdk.models.UpdatePhoneNumberVoiceSettingsRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NumberConfigurationsApi
 */
@Ignore
public class NumberConfigurationsApiTest {

    private final NumberConfigurationsApi api = new NumberConfigurationsApi();

    /**
     * Delete a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePhoneNumberTest() throws ApiException {
        String id = null;
        PhoneNumberResponse response = api.deletePhoneNumber(id);

        // TODO: test validations
    }
    /**
     * Enable emergency for a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableEmergencyPhoneNumberTest() throws ApiException {
        PhoneNumberEnableEmergencyRequest body = null;
        String id = null;
        PhoneNumberEnableEmergency response = api.enableEmergencyPhoneNumber(body, id);

        // TODO: test validations
    }
    /**
     * List phone numbers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        String filterTag = null;
        String filterPhoneNumber = null;
        String filterStatus = null;
        String filterVoiceConnectionNameContains = null;
        String filterVoiceConnectionNameStartsWith = null;
        String filterVoiceConnectionNameEndsWith = null;
        String filterVoiceConnectionNameEq = null;
        String filterUsagePaymentMethod = null;
        String filterBillingGroupId = null;
        String sort = null;
        ListPhoneNumbersResponse response = api.listPhoneNumbers(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, sort);

        // TODO: test validations
    }
    /**
     * List phone numbers with messaging settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersWithMessagingSettingsTest() throws ApiException {
        ListMessagingSettingsResponse response = api.listPhoneNumbersWithMessagingSettings();

        // TODO: test validations
    }
    /**
     * List phone numbers with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersWithVoiceSettingsTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        String filterPhoneNumber = null;
        String filterConnectionNameContains = null;
        String filterUsagePaymentMethod = null;
        String sort = null;
        ListPhoneNumbersWithVoiceSettingsResponse response = api.listPhoneNumbersWithVoiceSettings(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);

        // TODO: test validations
    }
    /**
     * Retrieve a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumberTest() throws ApiException {
        String id = null;
        PhoneNumberResponse response = api.retrievePhoneNumber(id);

        // TODO: test validations
    }
    /**
     * Retrieve a phone number with messaging settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumberWithMessagingSettingsTest() throws ApiException {
        String id = null;
        RetrieveMessagingSettingsResponse response = api.retrievePhoneNumberWithMessagingSettings(id);

        // TODO: test validations
    }
    /**
     * Retrieve a phone number with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumberWithVoiceSettingsTest() throws ApiException {
        String id = null;
        RetrievePhoneNumberVoiceResponse response = api.retrievePhoneNumberWithVoiceSettings(id);

        // TODO: test validations
    }
    /**
     * Update a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePhoneNumberTest() throws ApiException {
        UpdatePhoneNumberRequest body = null;
        String id = null;
        PhoneNumberResponse response = api.updatePhoneNumber(body, id);

        // TODO: test validations
    }
    /**
     * Update a phone number with messaging settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePhoneNumberWithMessagingSettingsTest() throws ApiException {
        UpdatePhoneNumberMessagingSettingsRequest body = null;
        String id = null;
        RetrieveMessagingSettingsResponse response = api.updatePhoneNumberWithMessagingSettings(body, id);

        // TODO: test validations
    }
    /**
     * Update a phone number with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePhoneNumberWithVoiceSettingsTest() throws ApiException {
        UpdatePhoneNumberVoiceSettingsRequest body = null;
        String id = null;
        RetrievePhoneNumberVoiceResponse response = api.updatePhoneNumberWithVoiceSettings(body, id);

        // TODO: test validations
    }
}
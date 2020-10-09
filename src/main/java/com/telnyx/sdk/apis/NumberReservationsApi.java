/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiCallback;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.ProgressRequestBody;
import com.telnyx.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.telnyx.sdk.models.CreateNumberReservationRequest;
import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListNumberReservationsResponse;
import com.telnyx.sdk.models.NumberReservationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberReservationsApi {
    private ApiClient localVarApiClient;

    public NumberReservationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NumberReservationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createNumberReservation
     * @param createNumberReservationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNumberReservationCall(CreateNumberReservationRequest createNumberReservationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createNumberReservationRequest;

        // create path and map variables
        String localVarPath = "/number_reservations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNumberReservationValidateBeforeCall(CreateNumberReservationRequest createNumberReservationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createNumberReservationRequest' is set
        if (createNumberReservationRequest == null) {
            throw new ApiException("Missing the required parameter 'createNumberReservationRequest' when calling createNumberReservation(Async)");
        }
        

        okhttp3.Call localVarCall = createNumberReservationCall(createNumberReservationRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a number reservation
     * Creates a Phone Number Reservation for multiple numbers.
     * @param createNumberReservationRequest  (required)
     * @return NumberReservationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public NumberReservationResponse createNumberReservation(CreateNumberReservationRequest createNumberReservationRequest) throws ApiException {
        ApiResponse<NumberReservationResponse> localVarResp = createNumberReservationWithHttpInfo(createNumberReservationRequest);
        return localVarResp.getData();
    }

    /**
     * Create a number reservation
     * Creates a Phone Number Reservation for multiple numbers.
     * @param createNumberReservationRequest  (required)
     * @return ApiResponse&lt;NumberReservationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NumberReservationResponse> createNumberReservationWithHttpInfo(CreateNumberReservationRequest createNumberReservationRequest) throws ApiException {
        okhttp3.Call localVarCall = createNumberReservationValidateBeforeCall(createNumberReservationRequest, null);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a number reservation (asynchronously)
     * Creates a Phone Number Reservation for multiple numbers.
     * @param createNumberReservationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNumberReservationAsync(CreateNumberReservationRequest createNumberReservationRequest, final ApiCallback<NumberReservationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNumberReservationValidateBeforeCall(createNumberReservationRequest, _callback);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for extendNumberReservationExpiryTime
     * @param numberReservationId The number reservation ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call extendNumberReservationExpiryTimeCall(String numberReservationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/number_reservations/{number_reservation_id}/actions/extend"
            .replaceAll("\\{" + "number_reservation_id" + "\\}", localVarApiClient.escapeString(numberReservationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call extendNumberReservationExpiryTimeValidateBeforeCall(String numberReservationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'numberReservationId' is set
        if (numberReservationId == null) {
            throw new ApiException("Missing the required parameter 'numberReservationId' when calling extendNumberReservationExpiryTime(Async)");
        }
        

        okhttp3.Call localVarCall = extendNumberReservationExpiryTimeCall(numberReservationId, _callback);
        return localVarCall;

    }

    /**
     * Extend a number reservation
     * Extends reservation expiry time on all phone numbers.
     * @param numberReservationId The number reservation ID. (required)
     * @return NumberReservationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public NumberReservationResponse extendNumberReservationExpiryTime(String numberReservationId) throws ApiException {
        ApiResponse<NumberReservationResponse> localVarResp = extendNumberReservationExpiryTimeWithHttpInfo(numberReservationId);
        return localVarResp.getData();
    }

    /**
     * Extend a number reservation
     * Extends reservation expiry time on all phone numbers.
     * @param numberReservationId The number reservation ID. (required)
     * @return ApiResponse&lt;NumberReservationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NumberReservationResponse> extendNumberReservationExpiryTimeWithHttpInfo(String numberReservationId) throws ApiException {
        okhttp3.Call localVarCall = extendNumberReservationExpiryTimeValidateBeforeCall(numberReservationId, null);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Extend a number reservation (asynchronously)
     * Extends reservation expiry time on all phone numbers.
     * @param numberReservationId The number reservation ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call extendNumberReservationExpiryTimeAsync(String numberReservationId, final ApiCallback<NumberReservationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = extendNumberReservationExpiryTimeValidateBeforeCall(numberReservationId, _callback);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listNumberReservations
     * @param filterStatus Filter number reservations by status. (optional)
     * @param filterCreatedAtGt Filter number reservations later than this value. (optional)
     * @param filterCreatedAtLt Filter number reservations earlier than this value. (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number reservations having these phone numbers. (optional)
     * @param filterCustomerReference Filter number reservations via the customer reference set. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listNumberReservationsCall(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/number_reservations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[status]", filterStatus));
        }

        if (filterCreatedAtGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[created_at][gt]", filterCreatedAtGt));
        }

        if (filterCreatedAtLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[created_at][lt]", filterCreatedAtLt));
        }

        if (filterPhoneNumbersPhoneNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[phone_numbers.phone_number]", filterPhoneNumbersPhoneNumber));
        }

        if (filterCustomerReference != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[customer_reference]", filterCustomerReference));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listNumberReservationsValidateBeforeCall(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listNumberReservationsCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, _callback);
        return localVarCall;

    }

    /**
     * List number reservations
     * Gets a paginated list of phone number reservations.
     * @param filterStatus Filter number reservations by status. (optional)
     * @param filterCreatedAtGt Filter number reservations later than this value. (optional)
     * @param filterCreatedAtLt Filter number reservations earlier than this value. (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number reservations having these phone numbers. (optional)
     * @param filterCustomerReference Filter number reservations via the customer reference set. (optional)
     * @return ListNumberReservationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ListNumberReservationsResponse listNumberReservations(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference) throws ApiException {
        ApiResponse<ListNumberReservationsResponse> localVarResp = listNumberReservationsWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference);
        return localVarResp.getData();
    }

    /**
     * List number reservations
     * Gets a paginated list of phone number reservations.
     * @param filterStatus Filter number reservations by status. (optional)
     * @param filterCreatedAtGt Filter number reservations later than this value. (optional)
     * @param filterCreatedAtLt Filter number reservations earlier than this value. (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number reservations having these phone numbers. (optional)
     * @param filterCustomerReference Filter number reservations via the customer reference set. (optional)
     * @return ApiResponse&lt;ListNumberReservationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListNumberReservationsResponse> listNumberReservationsWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference) throws ApiException {
        okhttp3.Call localVarCall = listNumberReservationsValidateBeforeCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, null);
        Type localVarReturnType = new TypeToken<ListNumberReservationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List number reservations (asynchronously)
     * Gets a paginated list of phone number reservations.
     * @param filterStatus Filter number reservations by status. (optional)
     * @param filterCreatedAtGt Filter number reservations later than this value. (optional)
     * @param filterCreatedAtLt Filter number reservations earlier than this value. (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number reservations having these phone numbers. (optional)
     * @param filterCustomerReference Filter number reservations via the customer reference set. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listNumberReservationsAsync(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, final ApiCallback<ListNumberReservationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNumberReservationsValidateBeforeCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, _callback);
        Type localVarReturnType = new TypeToken<ListNumberReservationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveNumberReservation
     * @param numberReservationId The number reservation ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveNumberReservationCall(String numberReservationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/number_reservations/{number_reservation_id}"
            .replaceAll("\\{" + "number_reservation_id" + "\\}", localVarApiClient.escapeString(numberReservationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveNumberReservationValidateBeforeCall(String numberReservationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'numberReservationId' is set
        if (numberReservationId == null) {
            throw new ApiException("Missing the required parameter 'numberReservationId' when calling retrieveNumberReservation(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveNumberReservationCall(numberReservationId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a number reservation
     * Gets a single phone number reservation.
     * @param numberReservationId The number reservation ID. (required)
     * @return NumberReservationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public NumberReservationResponse retrieveNumberReservation(String numberReservationId) throws ApiException {
        ApiResponse<NumberReservationResponse> localVarResp = retrieveNumberReservationWithHttpInfo(numberReservationId);
        return localVarResp.getData();
    }

    /**
     * Retrieve a number reservation
     * Gets a single phone number reservation.
     * @param numberReservationId The number reservation ID. (required)
     * @return ApiResponse&lt;NumberReservationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NumberReservationResponse> retrieveNumberReservationWithHttpInfo(String numberReservationId) throws ApiException {
        okhttp3.Call localVarCall = retrieveNumberReservationValidateBeforeCall(numberReservationId, null);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a number reservation (asynchronously)
     * Gets a single phone number reservation.
     * @param numberReservationId The number reservation ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveNumberReservationAsync(String numberReservationId, final ApiCallback<NumberReservationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveNumberReservationValidateBeforeCall(numberReservationId, _callback);
        Type localVarReturnType = new TypeToken<NumberReservationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

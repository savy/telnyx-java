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


import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListNumberOrderRegulatoryRequirementsResponse;
import com.telnyx.sdk.models.ListPhoneNumberRegulatoryRequirementsResponse;
import com.telnyx.sdk.models.NumberOrderRegulatoryRequirementResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOrderRegulatoryRequirementsApi {
    private ApiClient apiClient;

    public NumberOrderRegulatoryRequirementsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NumberOrderRegulatoryRequirementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listNumberOrderRegulatoryRequirements
     * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
     * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
     * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listNumberOrderRegulatoryRequirementsCall(String filterRequirementId, String filterFieldType, String filterRequirementType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/regulatory_requirements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterRequirementId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[requirement_id]", filterRequirementId));
        if (filterFieldType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[field_type]", filterFieldType));
        if (filterRequirementType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[requirement_type]", filterRequirementType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listNumberOrderRegulatoryRequirementsValidateBeforeCall(String filterRequirementId, String filterFieldType, String filterRequirementType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listNumberOrderRegulatoryRequirementsCall(filterRequirementId, filterFieldType, filterRequirementType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List number order regulatory requirements
     * Gets a paginated list of number order regulatory requirements.
     * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
     * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
     * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
     * @return ListNumberOrderRegulatoryRequirementsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListNumberOrderRegulatoryRequirementsResponse listNumberOrderRegulatoryRequirements(String filterRequirementId, String filterFieldType, String filterRequirementType) throws ApiException {
        ApiResponse<ListNumberOrderRegulatoryRequirementsResponse> resp = listNumberOrderRegulatoryRequirementsWithHttpInfo(filterRequirementId, filterFieldType, filterRequirementType);
        return resp.getData();
    }

    /**
     * List number order regulatory requirements
     * Gets a paginated list of number order regulatory requirements.
     * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
     * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
     * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
     * @return ApiResponse&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListNumberOrderRegulatoryRequirementsResponse> listNumberOrderRegulatoryRequirementsWithHttpInfo(String filterRequirementId, String filterFieldType, String filterRequirementType) throws ApiException {
        com.squareup.okhttp.Call call = listNumberOrderRegulatoryRequirementsValidateBeforeCall(filterRequirementId, filterFieldType, filterRequirementType, null, null);
        Type localVarReturnType = new TypeToken<ListNumberOrderRegulatoryRequirementsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List number order regulatory requirements (asynchronously)
     * Gets a paginated list of number order regulatory requirements.
     * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
     * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
     * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listNumberOrderRegulatoryRequirementsAsync(String filterRequirementId, String filterFieldType, String filterRequirementType, final ApiCallback<ListNumberOrderRegulatoryRequirementsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listNumberOrderRegulatoryRequirementsValidateBeforeCall(filterRequirementId, filterFieldType, filterRequirementType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListNumberOrderRegulatoryRequirementsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listPhoneNumberRegulatoryRequirements
     * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listPhoneNumberRegulatoryRequirementsCall(List<String> filterPhoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/phone_number_regulatory_requirements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterPhoneNumber != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number]", filterPhoneNumber));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listPhoneNumberRegulatoryRequirementsValidateBeforeCall(List<String> filterPhoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listPhoneNumberRegulatoryRequirementsCall(filterPhoneNumber, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List regulatory requirements per number
     * Gets a paginated list of phone number regulatory requirements.
     * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional)
     * @return ListPhoneNumberRegulatoryRequirementsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListPhoneNumberRegulatoryRequirementsResponse listPhoneNumberRegulatoryRequirements(List<String> filterPhoneNumber) throws ApiException {
        ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse> resp = listPhoneNumberRegulatoryRequirementsWithHttpInfo(filterPhoneNumber);
        return resp.getData();
    }

    /**
     * List regulatory requirements per number
     * Gets a paginated list of phone number regulatory requirements.
     * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional)
     * @return ApiResponse&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse> listPhoneNumberRegulatoryRequirementsWithHttpInfo(List<String> filterPhoneNumber) throws ApiException {
        com.squareup.okhttp.Call call = listPhoneNumberRegulatoryRequirementsValidateBeforeCall(filterPhoneNumber, null, null);
        Type localVarReturnType = new TypeToken<ListPhoneNumberRegulatoryRequirementsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List regulatory requirements per number (asynchronously)
     * Gets a paginated list of phone number regulatory requirements.
     * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listPhoneNumberRegulatoryRequirementsAsync(List<String> filterPhoneNumber, final ApiCallback<ListPhoneNumberRegulatoryRequirementsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listPhoneNumberRegulatoryRequirementsValidateBeforeCall(filterPhoneNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListPhoneNumberRegulatoryRequirementsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveNumberOrderRegulatoryRequirement
     * @param requirementId The number order regulatory requirement ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveNumberOrderRegulatoryRequirementCall(String requirementId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/regulatory_requirements/{requirement_id}"
            .replaceAll("\\{" + "requirement_id" + "\\}", apiClient.escapeString(requirementId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveNumberOrderRegulatoryRequirementValidateBeforeCall(String requirementId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'requirementId' is set
        if (requirementId == null) {
            throw new ApiException("Missing the required parameter 'requirementId' when calling retrieveNumberOrderRegulatoryRequirement(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveNumberOrderRegulatoryRequirementCall(requirementId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a number order regulatory requirement
     * Gets a single number order regulatory requirement.
     * @param requirementId The number order regulatory requirement ID. (required)
     * @return NumberOrderRegulatoryRequirementResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NumberOrderRegulatoryRequirementResponse retrieveNumberOrderRegulatoryRequirement(String requirementId) throws ApiException {
        ApiResponse<NumberOrderRegulatoryRequirementResponse> resp = retrieveNumberOrderRegulatoryRequirementWithHttpInfo(requirementId);
        return resp.getData();
    }

    /**
     * Retrieve a number order regulatory requirement
     * Gets a single number order regulatory requirement.
     * @param requirementId The number order regulatory requirement ID. (required)
     * @return ApiResponse&lt;NumberOrderRegulatoryRequirementResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NumberOrderRegulatoryRequirementResponse> retrieveNumberOrderRegulatoryRequirementWithHttpInfo(String requirementId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveNumberOrderRegulatoryRequirementValidateBeforeCall(requirementId, null, null);
        Type localVarReturnType = new TypeToken<NumberOrderRegulatoryRequirementResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a number order regulatory requirement (asynchronously)
     * Gets a single number order regulatory requirement.
     * @param requirementId The number order regulatory requirement ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveNumberOrderRegulatoryRequirementAsync(String requirementId, final ApiCallback<NumberOrderRegulatoryRequirementResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveNumberOrderRegulatoryRequirementValidateBeforeCall(requirementId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NumberOrderRegulatoryRequirementResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
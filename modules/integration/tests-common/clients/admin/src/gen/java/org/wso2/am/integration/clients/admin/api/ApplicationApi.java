/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api;

import org.wso2.am.integration.clients.admin.ApiCallback;
import org.wso2.am.integration.clients.admin.ApiClient;
import org.wso2.am.integration.clients.admin.ApiException;
import org.wso2.am.integration.clients.admin.ApiResponse;
import org.wso2.am.integration.clients.admin.Configuration;
import org.wso2.am.integration.clients.admin.Pair;
import org.wso2.am.integration.clients.admin.ProgressRequestBody;
import org.wso2.am.integration.clients.admin.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.admin.api.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationApi {
    private ApiClient apiClient;

    public ApplicationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for applicationsApplicationIdChangeOwnerPost
     * @param owner  (required)
     * @param applicationId Application UUID  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applicationsApplicationIdChangeOwnerPostCall(String owner, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/applications/{applicationId}/change-owner"
            .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (owner != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applicationsApplicationIdChangeOwnerPostValidateBeforeCall(String owner, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling applicationsApplicationIdChangeOwnerPost(Async)");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling applicationsApplicationIdChangeOwnerPost(Async)");
        }
        

        com.squareup.okhttp.Call call = applicationsApplicationIdChangeOwnerPostCall(owner, applicationId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Change Application Owner
     * This operation is used to change the owner of an Application. In order to change the owner of an application, we need to pass the new application owner as a query parameter 
     * @param owner  (required)
     * @param applicationId Application UUID  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void applicationsApplicationIdChangeOwnerPost(String owner, String applicationId) throws ApiException {
        applicationsApplicationIdChangeOwnerPostWithHttpInfo(owner, applicationId);
    }

    /**
     * Change Application Owner
     * This operation is used to change the owner of an Application. In order to change the owner of an application, we need to pass the new application owner as a query parameter 
     * @param owner  (required)
     * @param applicationId Application UUID  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> applicationsApplicationIdChangeOwnerPostWithHttpInfo(String owner, String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = applicationsApplicationIdChangeOwnerPostValidateBeforeCall(owner, applicationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Change Application Owner (asynchronously)
     * This operation is used to change the owner of an Application. In order to change the owner of an application, we need to pass the new application owner as a query parameter 
     * @param owner  (required)
     * @param applicationId Application UUID  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call applicationsApplicationIdChangeOwnerPostAsync(String owner, String applicationId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = applicationsApplicationIdChangeOwnerPostValidateBeforeCall(owner, applicationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

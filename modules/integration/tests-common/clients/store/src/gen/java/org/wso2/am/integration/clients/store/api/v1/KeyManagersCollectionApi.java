/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1;

import org.wso2.am.integration.clients.store.api.ApiCallback;
import org.wso2.am.integration.clients.store.api.ApiClient;
import org.wso2.am.integration.clients.store.api.ApiException;
import org.wso2.am.integration.clients.store.api.ApiResponse;
import org.wso2.am.integration.clients.store.api.Configuration;
import org.wso2.am.integration.clients.store.api.Pair;
import org.wso2.am.integration.clients.store.api.ProgressRequestBody;
import org.wso2.am.integration.clients.store.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.store.api.v1.dto.KeyManagerListDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyManagersCollectionApi {
    private ApiClient apiClient;

    public KeyManagersCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyManagersCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for keyManagersGet
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keyManagersGetCall(String xWSO2Tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/key-managers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xWSO2Tenant != null)
        localVarHeaderParams.put("X-WSO2-Tenant", apiClient.parameterToString(xWSO2Tenant));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call keyManagersGetValidateBeforeCall(String xWSO2Tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = keyManagersGetCall(xWSO2Tenant, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all Key Managers
     * Get all Key managers 
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @return KeyManagerListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeyManagerListDTO keyManagersGet(String xWSO2Tenant) throws ApiException {
        ApiResponse<KeyManagerListDTO> resp = keyManagersGetWithHttpInfo(xWSO2Tenant);
        return resp.getData();
    }

    /**
     * Get all Key Managers
     * Get all Key managers 
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @return ApiResponse&lt;KeyManagerListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeyManagerListDTO> keyManagersGetWithHttpInfo(String xWSO2Tenant) throws ApiException {
        com.squareup.okhttp.Call call = keyManagersGetValidateBeforeCall(xWSO2Tenant, null, null);
        Type localVarReturnType = new TypeToken<KeyManagerListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Key Managers (asynchronously)
     * Get all Key managers 
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keyManagersGetAsync(String xWSO2Tenant, final ApiCallback<KeyManagerListDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keyManagersGetValidateBeforeCall(xWSO2Tenant, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeyManagerListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

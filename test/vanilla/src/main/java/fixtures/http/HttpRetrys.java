/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.http.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpRetrys.
 */
public interface HttpRetrys {
    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head408();

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head408Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> head408WithRestResponseAsync();

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head408Async();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put500();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put500Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> put500WithRestResponseAsync();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable put500Async();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put500(Boolean booleanValue);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put500Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> put500WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable put500Async(Boolean booleanValue);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch500();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch500Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> patch500WithRestResponseAsync();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch500Async();

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch500(Boolean booleanValue);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch500Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> patch500WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch500Async(Boolean booleanValue);

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void get502();

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> get502Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> get502WithRestResponseAsync();

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable get502Async();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post503();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post503Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> post503WithRestResponseAsync();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable post503Async();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post503(Boolean booleanValue);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post503Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> post503WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable post503Async(Boolean booleanValue);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete503();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> delete503Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> delete503WithRestResponseAsync();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable delete503Async();

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete503(Boolean booleanValue);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> delete503Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> delete503WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable delete503Async(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put504();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put504Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> put504WithRestResponseAsync();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable put504Async();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put504(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put504Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> put504WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable put504Async(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch504();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch504Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> patch504WithRestResponseAsync();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch504Async();

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch504(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch504Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> patch504WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch504Async(Boolean booleanValue);
}

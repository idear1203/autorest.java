/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import org.joda.time.DateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Datetimerfc1123s.
 */
public interface Datetimerfc1123s {
    /**
     * Get null datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getNull();

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getNullAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getNullWithRestResponseAsync();

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getNullAsync();

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getInvalid();

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getInvalidAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getInvalidAsync();

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getOverflow();

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getOverflowAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getOverflowWithRestResponseAsync();

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getOverflowAsync();

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUnderflow();

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getUnderflowAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getUnderflowWithRestResponseAsync();

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getUnderflowAsync();

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMaxDateTime(@NonNull DateTime datetimeBody);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMaxDateTimeAsync(@NonNull DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putUtcMaxDateTimeWithRestResponseAsync(@NonNull DateTime datetimeBody);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMaxDateTimeAsync(@NonNull DateTime datetimeBody);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcLowercaseMaxDateTime();

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getUtcLowercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getUtcLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcUppercaseMaxDateTime();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getUtcUppercaseMaxDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getUtcUppercaseMaxDateTimeAsync();

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMinDateTime(@NonNull DateTime datetimeBody);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMinDateTimeAsync(@NonNull DateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putUtcMinDateTimeWithRestResponseAsync(@NonNull DateTime datetimeBody);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMinDateTimeAsync(@NonNull DateTime datetimeBody);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    DateTime getUtcMinDateTime();

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateTime> getUtcMinDateTimeAsync(ServiceCallback<DateTime> serviceCallback);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, DateTime>> getUtcMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateTime> getUtcMinDateTimeAsync();
}

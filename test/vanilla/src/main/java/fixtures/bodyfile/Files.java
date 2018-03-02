/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyfile.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.nio.ByteBuffer;

/**
 * An instance of this class provides access to all the operations defined in
 * Files.
 */
public interface Files {
    /**
     * Get file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> getFile();

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Flowable<ByteBuffer>> getFileAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Get file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Flowable<ByteBuffer>>> getFileWithRestResponseAsync();

    /**
     * Get file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Flowable<ByteBuffer>> getFileAsync();

    /**
     * Get a large file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> getFileLarge();

    /**
     * Get a large file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Flowable<ByteBuffer>> getFileLargeAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Get a large file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Flowable<ByteBuffer>>> getFileLargeWithRestResponseAsync();

    /**
     * Get a large file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Flowable<ByteBuffer>> getFileLargeAsync();

    /**
     * Get empty file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    Flowable<ByteBuffer> getEmptyFile();

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Flowable<ByteBuffer>> getEmptyFileAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback);

    /**
     * Get empty file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Flowable<ByteBuffer>>> getEmptyFileWithRestResponseAsync();

    /**
     * Get empty file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Flowable<ByteBuffer>> getEmptyFileAsync();
}

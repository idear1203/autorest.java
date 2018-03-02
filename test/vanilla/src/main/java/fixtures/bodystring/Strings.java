/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodystring.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public interface Strings {
    /**
     * Get null string value value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String getNull();

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<String> getNullAsync(ServiceCallback<String> serviceCallback);

    /**
     * Get null string value value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, String>> getNullWithRestResponseAsync();

    /**
     * Get null string value value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<String> getNullAsync();

    /**
     * Set string value null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putNull();

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putNullAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Set string value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putNullWithRestResponseAsync();

    /**
     * Set string value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable putNullAsync();

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putNull(String stringBody);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putNullAsync(String stringBody, ServiceCallback<Void> serviceCallback);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putNullWithRestResponseAsync(String stringBody);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putNullAsync(String stringBody);

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String getEmpty();

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<String> getEmptyAsync(ServiceCallback<String> serviceCallback);

    /**
     * Get empty string value value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, String>> getEmptyWithRestResponseAsync();

    /**
     * Get empty string value value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<String> getEmptyAsync();

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putEmpty(@NonNull String stringBody);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putEmptyAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(@NonNull String stringBody);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putEmptyAsync(@NonNull String stringBody);

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String getMbcs();

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<String> getMbcsAsync(ServiceCallback<String> serviceCallback);

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, String>> getMbcsWithRestResponseAsync();

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<String> getMbcsAsync();

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putMbcs(@NonNull String stringBody);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putMbcsAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putMbcsWithRestResponseAsync(@NonNull String stringBody);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putMbcsAsync(@NonNull String stringBody);

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String getWhitespace();

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<String> getWhitespaceAsync(ServiceCallback<String> serviceCallback);

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, String>> getWhitespaceWithRestResponseAsync();

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<String> getWhitespaceAsync();

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putWhitespace(@NonNull String stringBody);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putWhitespaceAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putWhitespaceWithRestResponseAsync(@NonNull String stringBody);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putWhitespaceAsync(@NonNull String stringBody);

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String getNotProvided();

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<String> getNotProvidedAsync(ServiceCallback<String> serviceCallback);

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, String>> getNotProvidedWithRestResponseAsync();

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<String> getNotProvidedAsync();

    /**
     * Get value that is base64 encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getBase64Encoded();

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<byte[]> getBase64EncodedAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get value that is base64 encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, byte[]>> getBase64EncodedWithRestResponseAsync();

    /**
     * Get value that is base64 encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<byte[]> getBase64EncodedAsync();

    /**
     * Get value that is base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getBase64UrlEncoded();

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<byte[]> getBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get value that is base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, byte[]>> getBase64UrlEncodedWithRestResponseAsync();

    /**
     * Get value that is base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<byte[]> getBase64UrlEncodedAsync();

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putBase64UrlEncoded(@NonNull byte[] stringBody);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putBase64UrlEncodedAsync(@NonNull byte[] stringBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, Void>> putBase64UrlEncodedWithRestResponseAsync(@NonNull byte[] stringBody);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putBase64UrlEncodedAsync(@NonNull byte[] stringBody);

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getNullBase64UrlEncoded();

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<RestResponse<Void, byte[]>> getNullBase64UrlEncodedWithRestResponseAsync();

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<byte[]> getNullBase64UrlEncodedAsync();
}

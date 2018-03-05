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

import com.microsoft.rest.RestClient;

/**
 * The interface for AutoRestHttpInfrastructureTestService class.
 */
public interface AutoRestHttpInfrastructureTestService {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost:3000";

    /**
     * Gets the HttpFailures object to access its operations.
     * @return the HttpFailures object.
     */
    HttpFailures httpFailures();

    /**
     * Gets the HttpSuccess object to access its operations.
     * @return the HttpSuccess object.
     */
    HttpSuccess httpSuccess();

    /**
     * Gets the HttpRedirects object to access its operations.
     * @return the HttpRedirects object.
     */
    HttpRedirects httpRedirects();

    /**
     * Gets the HttpClientFailures object to access its operations.
     * @return the HttpClientFailures object.
     */
    HttpClientFailures httpClientFailures();

    /**
     * Gets the HttpServerFailures object to access its operations.
     * @return the HttpServerFailures object.
     */
    HttpServerFailures httpServerFailures();

    /**
     * Gets the HttpRetrys object to access its operations.
     * @return the HttpRetrys object.
     */
    HttpRetrys httpRetrys();

    /**
     * Gets the MultipleResponses object to access its operations.
     * @return the MultipleResponses object.
     */
    MultipleResponses multipleResponses();

}

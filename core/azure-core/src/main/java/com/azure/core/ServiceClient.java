// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core;

import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.serializer.SerializerAdapter;

/**
 * The base class for REST service clients.
 */
public abstract class ServiceClient {
    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * The lazily-created serializer for this ServiceClient.
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Creates ServiceClient.
     *
     * @param httpPipeline The HTTP pipeline to send requests through
     */
    protected ServiceClient(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
    }

    /**
     * @return the HTTP pipeline to send requests through.
     */
    public HttpPipeline httpPipeline() {
        return this.httpPipeline;
    }

    /**
     * @return the serializer for this ServiceClient.
     */
    public SerializerAdapter serializerAdapter() {
        if (this.serializerAdapter == null) {
            this.serializerAdapter = createSerializerAdapter();
        }
        return this.serializerAdapter;
    }

    /**
     * @return the default serializer of RestProxy.
     */
    protected SerializerAdapter createSerializerAdapter() {
        return RestProxy.createDefaultSerializer();
    }
}

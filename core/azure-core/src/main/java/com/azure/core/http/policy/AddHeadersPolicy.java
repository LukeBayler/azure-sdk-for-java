// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import reactor.core.publisher.Mono;

/**
 * The Pipeline policy that adds a particular set of headers to HTTP requests.
 */
public class AddHeadersPolicy implements HttpPipelinePolicy {
    private final HttpHeaders headers;

    /**
     * Creates a AddHeadersPolicy.
     *
     * @param headers The headers to add to outgoing requests.
     */
    public AddHeadersPolicy(HttpHeaders headers) {
        this.headers = headers;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        for (HttpHeader header : headers) {
            context.httpRequest().withHeader(header.name(), header.value());
        }
        return next.process();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.http.policy;

import com.client.core.http.HttpHeader;
import com.client.core.http.HttpHeaderName;
import com.client.core.http.HttpHeaders;
import com.client.core.http.HttpPipelineCallContext;
import com.client.core.http.HttpPipelineNextPolicy;
import com.client.core.http.HttpPipelineNextSyncPolicy;
import com.client.core.http.HttpRequest;
import com.client.core.http.HttpResponse;
import com.client.core.util.CoreUtils;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * The pipeline policy that puts a UUID in the request header. Client uses the request id as
 * the unique identifier for the request.
 *
 * <p>The default {@link HttpHeader} name can be overwritten as shown below
 * <p><strong>Code sample</strong></p>
 * <!-- src_embed com.client.core.http.policy.RequestIdPolicy.constructor.overrideRequestIdHeaderName -->
 * <pre>
 * new RequestIdPolicy&#40;&quot;x-ms-my-custom-request-id&quot;&#41;;
 * </pre>
 * <!-- end com.client.core.http.policy.RequestIdPolicy.constructor.overrideRequestIdHeaderName -->
 */
public class RequestIdPolicy implements HttpPipelinePolicy {

    private static final HttpHeaderName REQUEST_ID_HEADER = HttpHeaderName.fromString("x-ms-client-request-id");
    private final HttpHeaderName requestIdHeaderName;

    /**
     * Creates  {@link RequestIdPolicy} with provided {@code requestIdHeaderName}.
     * @param requestIdHeaderName to be used to set in {@link HttpRequest}.
     */
    public RequestIdPolicy(String requestIdHeaderName) {
        this.requestIdHeaderName = HttpHeaderName.fromString(Objects.requireNonNull(requestIdHeaderName,
            "requestIdHeaderName can not be null."));
    }

    /**
     * Creates default {@link RequestIdPolicy} with default header name 'x-ms-client-request-id'.
     */
    public RequestIdPolicy() {
        this.requestIdHeaderName = REQUEST_ID_HEADER;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        setRequestIdHeader(context.getHttpRequest(), requestIdHeaderName);
        return next.process();
    }
    @Override
    public HttpResponse processSync(HttpPipelineCallContext context, HttpPipelineNextSyncPolicy next) {
        setRequestIdHeader(context.getHttpRequest(), requestIdHeaderName);
        return next.processSync();
    }

    private static void setRequestIdHeader(HttpRequest request, HttpHeaderName requestIdHeaderName) {
        HttpHeaders headers = request.getHeaders();
        String requestId = headers.getValue(requestIdHeaderName);
        if (requestId == null) {
            headers.set(requestIdHeaderName, CoreUtils.randomUuid().toString());
        }
    }
}

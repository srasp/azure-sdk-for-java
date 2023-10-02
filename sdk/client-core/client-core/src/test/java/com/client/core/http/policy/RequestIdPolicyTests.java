// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.http.policy;

import com.client.core.SyncAsyncExtension;
import com.client.core.SyncAsyncTest;
import com.client.core.http.HttpHeaderName;
import com.client.core.http.HttpHeaders;
import com.client.core.http.HttpMethod;
import com.client.core.http.HttpPipeline;
import com.client.core.http.HttpPipelineBuilder;
import com.client.core.http.HttpRequest;
import com.client.core.http.HttpResponse;
import com.client.core.http.clients.NoOpHttpClient;
import com.client.core.util.Context;
import org.junit.jupiter.api.Assertions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.client.core.CoreTestUtils.createUrl;

public class RequestIdPolicyTests {

    private final HttpResponse mockResponse = new HttpResponse(null) {
        @Override
        public int getStatusCode() {
            return 500;
        }

        @Override
        @Deprecated
        public String getHeaderValue(String name) {
            return null;
        }

        @Override
        public HttpHeaders getHeaders() {
            return new HttpHeaders();
        }

        @Override
        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.empty();
        }

        @Override
        public Flux<ByteBuffer> getBody() {
            return Flux.empty();
        }

        @Override
        public Mono<String> getBodyAsString() {
            return Mono.empty();
        }

        @Override
        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.empty();
        }
    };

    @SyncAsyncTest
    public void newRequestIdForEachCall() throws Exception {
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                String firstRequestId = null;
                @Override
                public Mono<HttpResponse> send(HttpRequest request) {
                    if (firstRequestId != null) {
                        String newRequestId = request.getHeaders().getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
                        Assertions.assertNotNull(newRequestId);
                        Assertions.assertNotEquals(newRequestId, firstRequestId);
                    }

                    firstRequestId = request.getHeaders().getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
                    if (firstRequestId == null) {
                        Assertions.fail();
                    }
                    return Mono.just(mockResponse);
                }
            })
            .policies(new RequestIdPolicy())
            .build();

        SyncAsyncExtension.execute(
            () -> pipeline.sendSync(createHttpRequest("https://www.bing.com"), Context.NONE),
            () -> pipeline.send(createHttpRequest("https://www.bing.com"))
        );
    }

    @SyncAsyncTest
    public void sameRequestIdForRetry() throws Exception {
        final HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                String firstRequestId = null;

                @Override
                public Mono<HttpResponse> send(HttpRequest request) {
                    if (firstRequestId != null) {
                        String newRequestId = request.getHeaders().getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
                        Assertions.assertNotNull(newRequestId);
                        Assertions.assertEquals(newRequestId, firstRequestId);
                    }
                    firstRequestId = request.getHeaders().getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
                    if (firstRequestId == null) {
                        Assertions.fail();
                    }
                    return Mono.just(mockResponse);
                }
            })
            .policies(new RequestIdPolicy(), new RetryPolicy(new FixedDelay(1, Duration.of(0, ChronoUnit.SECONDS))))
            .build();

        SyncAsyncExtension.execute(
            () -> pipeline.sendSync(createHttpRequest("https://www.bing.com"), Context.NONE),
            () -> pipeline.send(createHttpRequest("https://www.bing.com"))
        );
    }

    private static HttpRequest createHttpRequest(String url) throws MalformedURLException {
        return new HttpRequest(HttpMethod.GET, createUrl(url));
    }
}
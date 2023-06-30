// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.ChatTranscriptDetails;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ChatTranscriptsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"messages\":[{\"communicationDirection\":\"inbound\",\"sender\":\"hpxlktwkuziycs\",\"body\":\"evufuztck\",\"createdDate\":\"2021-01-31T17:17:06Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"dcgzul\",\"body\":\"mmrqz\",\"createdDate\":\"2021-09-18T16:35:05Z\"},{\"communicationDirection\":\"inbound\",\"sender\":\"ydzgkrvqeevtoe\",\"body\":\"r\",\"createdDate\":\"2021-09-19T16:29:02Z\"}],\"startTime\":\"2021-08-29T21:00:59Z\"},\"id\":\"tpzdmovzvfvaawzq\",\"name\":\"dflgzuri\",\"type\":\"laecxndticok\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SupportManager manager =
            SupportManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ChatTranscriptDetails response =
            manager
                .chatTranscripts()
                .getWithResponse("kdmflvestmjlx", "ril", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("hpxlktwkuziycs", response.messages().get(0).sender());
        Assertions.assertEquals("evufuztck", response.messages().get(0).body());
    }
}
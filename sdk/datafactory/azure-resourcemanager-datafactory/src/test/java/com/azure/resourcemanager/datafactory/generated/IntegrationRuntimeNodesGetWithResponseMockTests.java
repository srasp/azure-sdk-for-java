// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"nodeName\":\"fppjunkh\",\"machineName\":\"hkqny\",\"hostServiceUri\":\"fvzrq\",\"status\":\"InitializeFailed\",\"capabilities\":{\"ia\":\"ceheeqqetasi\",\"gpmvl\":\"qwomkzcmwqfd\",\"d\":\"mvqumjmpsxzxbafs\"},\"versionStatus\":\"zporjhubzkzjazf\",\"version\":\"wvxq\",\"registerTime\":\"2021-10-16T11:38:02Z\",\"lastConnectTime\":\"2021-11-05T02:39:54Z\",\"expiryTime\":\"2021-11-03T20:33:22Z\",\"lastStartTime\":\"2021-12-08T01:27:04Z\",\"lastStopTime\":\"2021-10-08T15:53:52Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-08-29T07:09:05Z\",\"lastEndUpdateTime\":\"2021-01-29T07:26:19Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":2104441921,\"maxConcurrentJobs\":680887094,\"\":{\"prgpm\":\"datafcsvipwahehuc\",\"fzcsklvtceaoi\":\"datatjvuhcw\",\"bjfhpaywwesa\":\"dataurqlcdh\"}}";

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

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response =
            manager
                .integrationRuntimeNodes()
                .getWithResponse(
                    "fmsaedglubqtf", "up", "mwtemirujiqmks", "fjhtlbrkgh", com.azure.core.util.Context.NONE)
                .getValue();
    }
}
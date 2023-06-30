// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalStorageInstance;
import com.azure.resourcemanager.baremetalinfrastructure.models.ProvisioningState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AzureBareMetalStorageInstancesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"azureBareMetalStorageInstanceUniqueIdentifier\":\"unmmq\",\"storageProperties\":{\"provisioningState\":\"Creating\",\"offeringType\":\"konocu\",\"storageType\":\"klyaxuconu\",\"generation\":\"zf\",\"hardwareType\":\"eyp\",\"workloadType\":\"rmjmwvvjektc\",\"storageBillingProperties\":{\"billingMode\":\"nhwlrsffrzpwvl\",\"azureBareMetalStorageInstanceSize\":\"q\"}}},\"location\":\"iqylihkaetck\",\"tags\":{\"jf\":\"civfsnkymuctq\",\"fuwutttxf\":\"ebrjcxe\",\"hfnljkyq\":\"jrbirphxepcyv\"},\"id\":\"j\",\"name\":\"uujqgidokgjljyo\",\"type\":\"gvcl\"}";

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

        BareMetalInfrastructureManager manager =
            BareMetalInfrastructureManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AzureBareMetalStorageInstance response =
            manager
                .azureBareMetalStorageInstances()
                .getByResourceGroupWithResponse("qnwvlrya", "w", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("iqylihkaetck", response.location());
        Assertions.assertEquals("civfsnkymuctq", response.tags().get("jf"));
        Assertions.assertEquals("unmmq", response.azureBareMetalStorageInstanceUniqueIdentifier());
        Assertions.assertEquals(ProvisioningState.CREATING, response.storageProperties().provisioningState());
        Assertions.assertEquals("konocu", response.storageProperties().offeringType());
        Assertions.assertEquals("klyaxuconu", response.storageProperties().storageType());
        Assertions.assertEquals("zf", response.storageProperties().generation());
        Assertions.assertEquals("eyp", response.storageProperties().hardwareType());
        Assertions.assertEquals("rmjmwvvjektc", response.storageProperties().workloadType());
        Assertions
            .assertEquals("nhwlrsffrzpwvl", response.storageProperties().storageBillingProperties().billingMode());
        Assertions
            .assertEquals(
                "q", response.storageProperties().storageBillingProperties().azureBareMetalStorageInstanceSize());
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIdentityCredentialResourceInner;
import com.azure.resourcemanager.datafactory.models.CredentialListResponse;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredential;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CredentialListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CredentialListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"qhnlbqnbld\"},\"description\":\"aclgschorimk\",\"annotations\":[\"datarmoucsofl\"],\"\":{\"mxuq\":\"dataviyfcaabeolhbhlv\",\"owlkjxnqpv\":\"databsxtkcudfbsfarfs\",\"tmhqykiz\":\"datagf\"}},\"name\":\"ksaoafcluqvox\",\"type\":\"cjimryvwgcwwpbmz\",\"etag\":\"esyds\",\"id\":\"efoh\"},{\"properties\":{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"vopwndyqleallk\"},\"description\":\"tkhlowkxxpvbr\",\"annotations\":[\"datamzsyzfhotl\",\"dataikcyyc\"],\"\":{\"uic\":\"datasjlpjrtwszhv\",\"ubhvj\":\"datahvtrrmhwrbfdpyf\",\"memhooclutnpq\":\"datalrocuyzlwh\"}},\"name\":\"mczjkm\",\"type\":\"kyujxsglhsrrr\",\"etag\":\"jylmbkzudnigr\",\"id\":\"hotj\"},{\"properties\":{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"pxuzzjg\"},\"description\":\"efqyhqotoihiqaky\",\"annotations\":[\"datafb\"],\"\":{\"qaxsipietgbebjf\":\"datapzdqtvhcspod\",\"pnfpubntnbat\":\"datalbmoichd\",\"uhplrvkmjcwmjv\":\"dataviqsowsaaelcattc\"}},\"name\":\"fggc\",\"type\":\"yylizrz\",\"etag\":\"psfxsf\",\"id\":\"tl\"},{\"properties\":{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"vagbwidqlvhukove\"},\"description\":\"i\",\"annotations\":[\"datajfnmjmvlwyz\"],\"\":{\"jpu\":\"datalkujrllfojui\",\"vtzejetjklnti\":\"datayjucejikzoeo\",\"zolxrzvhqjwtr\":\"datayjuzkdb\",\"rrkolawjmjs\":\"datatgvgzp\"}},\"name\":\"rokcdxfzzzwyjaf\",\"type\":\"lhguyn\",\"etag\":\"hlgmltxdwhmoz\",\"id\":\"gzvlnsnn\"}],\"nextLink\":\"fpafolpymwamxq\"}")
                .toObject(CredentialListResponse.class);
        Assertions.assertEquals("efoh", model.value().get(0).id());
        Assertions.assertEquals("aclgschorimk", model.value().get(0).properties().description());
        Assertions.assertEquals("qhnlbqnbld", model.value().get(0).properties().resourceId());
        Assertions.assertEquals("fpafolpymwamxq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CredentialListResponse model =
            new CredentialListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedIdentityCredentialResourceInner()
                                .withId("efoh")
                                .withProperties(
                                    new ManagedIdentityCredential()
                                        .withDescription("aclgschorimk")
                                        .withAnnotations(Arrays.asList("datarmoucsofl"))
                                        .withResourceId("qhnlbqnbld")),
                            new ManagedIdentityCredentialResourceInner()
                                .withId("hotj")
                                .withProperties(
                                    new ManagedIdentityCredential()
                                        .withDescription("tkhlowkxxpvbr")
                                        .withAnnotations(Arrays.asList("datamzsyzfhotl", "dataikcyyc"))
                                        .withResourceId("vopwndyqleallk")),
                            new ManagedIdentityCredentialResourceInner()
                                .withId("tl")
                                .withProperties(
                                    new ManagedIdentityCredential()
                                        .withDescription("efqyhqotoihiqaky")
                                        .withAnnotations(Arrays.asList("datafb"))
                                        .withResourceId("pxuzzjg")),
                            new ManagedIdentityCredentialResourceInner()
                                .withId("gzvlnsnn")
                                .withProperties(
                                    new ManagedIdentityCredential()
                                        .withDescription("i")
                                        .withAnnotations(Arrays.asList("datajfnmjmvlwyz"))
                                        .withResourceId("vagbwidqlvhukove"))))
                .withNextLink("fpafolpymwamxq");
        model = BinaryData.fromObject(model).toObject(CredentialListResponse.class);
        Assertions.assertEquals("efoh", model.value().get(0).id());
        Assertions.assertEquals("aclgschorimk", model.value().get(0).properties().description());
        Assertions.assertEquals("qhnlbqnbld", model.value().get(0).properties().resourceId());
        Assertions.assertEquals("fpafolpymwamxq", model.nextLink());
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalStorageInstanceProperties;
import com.azure.resourcemanager.baremetalinfrastructure.models.ProvisioningState;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageBillingProperties;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageProperties;
import org.junit.jupiter.api.Assertions;

public final class AzureBareMetalStorageInstancePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBareMetalStorageInstanceProperties model =
            BinaryData
                .fromString(
                    "{\"azureBareMetalStorageInstanceUniqueIdentifier\":\"c\",\"storageProperties\":{\"provisioningState\":\"Deleting\",\"offeringType\":\"hhbcsglummajtjao\",\"storageType\":\"obnbdxkqpxokaj\",\"generation\":\"npime\",\"hardwareType\":\"stxgc\",\"workloadType\":\"dg\",\"storageBillingProperties\":{\"billingMode\":\"jrmvdjwzrlo\",\"azureBareMetalStorageInstanceSize\":\"clwhijcoejctbz\"}}}")
                .toObject(AzureBareMetalStorageInstanceProperties.class);
        Assertions.assertEquals("c", model.azureBareMetalStorageInstanceUniqueIdentifier());
        Assertions.assertEquals(ProvisioningState.DELETING, model.storageProperties().provisioningState());
        Assertions.assertEquals("hhbcsglummajtjao", model.storageProperties().offeringType());
        Assertions.assertEquals("obnbdxkqpxokaj", model.storageProperties().storageType());
        Assertions.assertEquals("npime", model.storageProperties().generation());
        Assertions.assertEquals("stxgc", model.storageProperties().hardwareType());
        Assertions.assertEquals("dg", model.storageProperties().workloadType());
        Assertions.assertEquals("jrmvdjwzrlo", model.storageProperties().storageBillingProperties().billingMode());
        Assertions
            .assertEquals(
                "clwhijcoejctbz",
                model.storageProperties().storageBillingProperties().azureBareMetalStorageInstanceSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBareMetalStorageInstanceProperties model =
            new AzureBareMetalStorageInstanceProperties()
                .withAzureBareMetalStorageInstanceUniqueIdentifier("c")
                .withStorageProperties(
                    new StorageProperties()
                        .withProvisioningState(ProvisioningState.DELETING)
                        .withOfferingType("hhbcsglummajtjao")
                        .withStorageType("obnbdxkqpxokaj")
                        .withGeneration("npime")
                        .withHardwareType("stxgc")
                        .withWorkloadType("dg")
                        .withStorageBillingProperties(
                            new StorageBillingProperties()
                                .withBillingMode("jrmvdjwzrlo")
                                .withAzureBareMetalStorageInstanceSize("clwhijcoejctbz")));
        model = BinaryData.fromObject(model).toObject(AzureBareMetalStorageInstanceProperties.class);
        Assertions.assertEquals("c", model.azureBareMetalStorageInstanceUniqueIdentifier());
        Assertions.assertEquals(ProvisioningState.DELETING, model.storageProperties().provisioningState());
        Assertions.assertEquals("hhbcsglummajtjao", model.storageProperties().offeringType());
        Assertions.assertEquals("obnbdxkqpxokaj", model.storageProperties().storageType());
        Assertions.assertEquals("npime", model.storageProperties().generation());
        Assertions.assertEquals("stxgc", model.storageProperties().hardwareType());
        Assertions.assertEquals("dg", model.storageProperties().workloadType());
        Assertions.assertEquals("jrmvdjwzrlo", model.storageProperties().storageBillingProperties().billingMode());
        Assertions
            .assertEquals(
                "clwhijcoejctbz",
                model.storageProperties().storageBillingProperties().azureBareMetalStorageInstanceSize());
    }
}
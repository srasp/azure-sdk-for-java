// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.models.StorageBillingProperties;
import org.junit.jupiter.api.Assertions;

public final class StorageBillingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageBillingProperties model =
            BinaryData
                .fromString("{\"billingMode\":\"twnpzaoqvuhrhcf\",\"azureBareMetalStorageInstanceSize\":\"yd\"}")
                .toObject(StorageBillingProperties.class);
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.billingMode());
        Assertions.assertEquals("yd", model.azureBareMetalStorageInstanceSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageBillingProperties model =
            new StorageBillingProperties()
                .withBillingMode("twnpzaoqvuhrhcf")
                .withAzureBareMetalStorageInstanceSize("yd");
        model = BinaryData.fromObject(model).toObject(StorageBillingProperties.class);
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.billingMode());
        Assertions.assertEquals("yd", model.azureBareMetalStorageInstanceSize());
    }
}
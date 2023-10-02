// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SecureString;
import org.junit.jupiter.api.Assertions;

public final class SecureStringTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureString model =
            BinaryData.fromString("{\"type\":\"SecureString\",\"value\":\"pylx\"}").toObject(SecureString.class);
        Assertions.assertEquals("pylx", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureString model = new SecureString().withValue("pylx");
        model = BinaryData.fromObject(model).toObject(SecureString.class);
        Assertions.assertEquals("pylx", model.value());
    }
}
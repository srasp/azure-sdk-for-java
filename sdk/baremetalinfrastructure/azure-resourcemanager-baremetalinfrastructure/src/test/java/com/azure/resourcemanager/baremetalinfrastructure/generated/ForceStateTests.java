// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalInstanceForcePowerState;
import com.azure.resourcemanager.baremetalinfrastructure.models.ForceState;
import org.junit.jupiter.api.Assertions;

public final class ForceStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForceState model = BinaryData.fromString("{\"forceState\":\"inactive\"}").toObject(ForceState.class);
        Assertions.assertEquals(AzureBareMetalInstanceForcePowerState.INACTIVE, model.forceState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForceState model = new ForceState().withForceState(AzureBareMetalInstanceForcePowerState.INACTIVE);
        model = BinaryData.fromObject(model).toObject(ForceState.class);
        Assertions.assertEquals(AzureBareMetalInstanceForcePowerState.INACTIVE, model.forceState());
    }
}
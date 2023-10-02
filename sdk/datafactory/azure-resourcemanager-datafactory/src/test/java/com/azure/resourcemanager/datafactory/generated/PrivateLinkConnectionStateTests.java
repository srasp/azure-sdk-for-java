// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"fypiv\",\"description\":\"bbjpmcubkmif\",\"actionsRequired\":\"xkubvphavpmhbrbq\"}")
                .toObject(PrivateLinkConnectionState.class);
        Assertions.assertEquals("fypiv", model.status());
        Assertions.assertEquals("bbjpmcubkmif", model.description());
        Assertions.assertEquals("xkubvphavpmhbrbq", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkConnectionState model =
            new PrivateLinkConnectionState()
                .withStatus("fypiv")
                .withDescription("bbjpmcubkmif")
                .withActionsRequired("xkubvphavpmhbrbq");
        model = BinaryData.fromObject(model).toObject(PrivateLinkConnectionState.class);
        Assertions.assertEquals("fypiv", model.status());
        Assertions.assertEquals("bbjpmcubkmif", model.description());
        Assertions.assertEquals("xkubvphavpmhbrbq", model.actionsRequired());
    }
}
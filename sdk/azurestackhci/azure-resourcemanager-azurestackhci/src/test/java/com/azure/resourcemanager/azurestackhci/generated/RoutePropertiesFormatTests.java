// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.fluent.models.RoutePropertiesFormat;
import org.junit.jupiter.api.Assertions;

public final class RoutePropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutePropertiesFormat model =
            BinaryData
                .fromString("{\"addressPrefix\":\"mngnzscxaqw\",\"nextHopIpAddress\":\"chcbonqvpkvlrxnj\"}")
                .toObject(RoutePropertiesFormat.class);
        Assertions.assertEquals("mngnzscxaqw", model.addressPrefix());
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.nextHopIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutePropertiesFormat model =
            new RoutePropertiesFormat().withAddressPrefix("mngnzscxaqw").withNextHopIpAddress("chcbonqvpkvlrxnj");
        model = BinaryData.fromObject(model).toObject(RoutePropertiesFormat.class);
        Assertions.assertEquals("mngnzscxaqw", model.addressPrefix());
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.nextHopIpAddress());
    }
}
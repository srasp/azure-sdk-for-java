// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.LogicalNetworkPropertiesDhcpOptions;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogicalNetworkPropertiesDhcpOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogicalNetworkPropertiesDhcpOptions model =
            BinaryData
                .fromString("{\"dnsServers\":[\"tnwu\",\"zga\",\"x\",\"fizuckyf\"]}")
                .toObject(LogicalNetworkPropertiesDhcpOptions.class);
        Assertions.assertEquals("tnwu", model.dnsServers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogicalNetworkPropertiesDhcpOptions model =
            new LogicalNetworkPropertiesDhcpOptions().withDnsServers(Arrays.asList("tnwu", "zga", "x", "fizuckyf"));
        model = BinaryData.fromObject(model).toObject(LogicalNetworkPropertiesDhcpOptions.class);
        Assertions.assertEquals("tnwu", model.dnsServers().get(0));
    }
}
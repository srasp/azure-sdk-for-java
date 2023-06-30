// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.MessageProperties;
import org.junit.jupiter.api.Assertions;

public final class MessagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MessageProperties model =
            BinaryData
                .fromString(
                    "{\"communicationDirection\":\"inbound\",\"sender\":\"zbn\",\"body\":\"blylpstdbh\",\"createdDate\":\"2021-04-19T05:31:11Z\"}")
                .toObject(MessageProperties.class);
        Assertions.assertEquals("zbn", model.sender());
        Assertions.assertEquals("blylpstdbh", model.body());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MessageProperties model = new MessageProperties().withSender("zbn").withBody("blylpstdbh");
        model = BinaryData.fromObject(model).toObject(MessageProperties.class);
        Assertions.assertEquals("zbn", model.sender());
        Assertions.assertEquals("blylpstdbh", model.body());
    }
}
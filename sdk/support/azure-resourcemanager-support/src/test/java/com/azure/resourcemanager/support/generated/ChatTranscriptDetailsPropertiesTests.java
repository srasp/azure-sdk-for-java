// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsProperties;
import com.azure.resourcemanager.support.models.MessageProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChatTranscriptDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChatTranscriptDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"messages\":[{\"communicationDirection\":\"outbound\",\"sender\":\"rvnaenqpeh\",\"body\":\"ndoygmifthnzdnd\",\"createdDate\":\"2021-07-04T07:51:31Z\"},{\"communicationDirection\":\"inbound\",\"sender\":\"igynduhavhqlk\",\"body\":\"humaqolbgyc\",\"createdDate\":\"2021-09-15T15:38:14Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"ccymvaolpsslql\",\"body\":\"mmdnbbglzps\",\"createdDate\":\"2021-11-30T08:30:44Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"yhz\",\"body\":\"xssadbzmnvdf\",\"createdDate\":\"2021-12-08T00:49:45Z\"}],\"startTime\":\"2021-04-20T15:16:33Z\"}")
                .toObject(ChatTranscriptDetailsProperties.class);
        Assertions.assertEquals("rvnaenqpeh", model.messages().get(0).sender());
        Assertions.assertEquals("ndoygmifthnzdnd", model.messages().get(0).body());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChatTranscriptDetailsProperties model =
            new ChatTranscriptDetailsProperties()
                .withMessages(
                    Arrays
                        .asList(
                            new MessageProperties().withSender("rvnaenqpeh").withBody("ndoygmifthnzdnd"),
                            new MessageProperties().withSender("igynduhavhqlk").withBody("humaqolbgyc"),
                            new MessageProperties().withSender("ccymvaolpsslql").withBody("mmdnbbglzps"),
                            new MessageProperties().withSender("yhz").withBody("xssadbzmnvdf")));
        model = BinaryData.fromObject(model).toObject(ChatTranscriptDetailsProperties.class);
        Assertions.assertEquals("rvnaenqpeh", model.messages().get(0).sender());
        Assertions.assertEquals("ndoygmifthnzdnd", model.messages().get(0).body());
    }
}
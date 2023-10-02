// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ChainingTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChainingTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChainingTriggerTypeProperties model =
            BinaryData
                .fromString(
                    "{\"dependsOn\":[{\"referenceName\":\"fjno\",\"name\":\"ibcez\"},{\"referenceName\":\"tfyarlwl\",\"name\":\"jerqlbz\"},{\"referenceName\":\"sff\",\"name\":\"u\"}],\"runDimension\":\"ybteyht\"}")
                .toObject(ChainingTriggerTypeProperties.class);
        Assertions.assertEquals("fjno", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("ibcez", model.dependsOn().get(0).name());
        Assertions.assertEquals("ybteyht", model.runDimension());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChainingTriggerTypeProperties model =
            new ChainingTriggerTypeProperties()
                .withDependsOn(
                    Arrays
                        .asList(
                            new PipelineReference().withReferenceName("fjno").withName("ibcez"),
                            new PipelineReference().withReferenceName("tfyarlwl").withName("jerqlbz"),
                            new PipelineReference().withReferenceName("sff").withName("u")))
                .withRunDimension("ybteyht");
        model = BinaryData.fromObject(model).toObject(ChainingTriggerTypeProperties.class);
        Assertions.assertEquals("fjno", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("ibcez", model.dependsOn().get(0).name());
        Assertions.assertEquals("ybteyht", model.runDimension());
    }
}
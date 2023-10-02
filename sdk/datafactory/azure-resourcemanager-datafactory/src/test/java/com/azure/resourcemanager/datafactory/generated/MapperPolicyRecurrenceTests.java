// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FrequencyType;
import com.azure.resourcemanager.datafactory.models.MapperPolicyRecurrence;
import org.junit.jupiter.api.Assertions;

public final class MapperPolicyRecurrenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperPolicyRecurrence model =
            BinaryData
                .fromString("{\"frequency\":\"Hour\",\"interval\":1799145797}")
                .toObject(MapperPolicyRecurrence.class);
        Assertions.assertEquals(FrequencyType.HOUR, model.frequency());
        Assertions.assertEquals(1799145797, model.interval());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperPolicyRecurrence model =
            new MapperPolicyRecurrence().withFrequency(FrequencyType.HOUR).withInterval(1799145797);
        model = BinaryData.fromObject(model).toObject(MapperPolicyRecurrence.class);
        Assertions.assertEquals(FrequencyType.HOUR, model.frequency());
        Assertions.assertEquals(1799145797, model.interval());
    }
}
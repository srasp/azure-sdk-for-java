// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecurrenceScheduleOccurrenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecurrenceScheduleOccurrence model =
            BinaryData
                .fromString("{\"day\":\"Monday\",\"occurrence\":30318410,\"\":{\"dumhpbcixday\":\"datakvsnfnkfsfga\"}}")
                .toObject(RecurrenceScheduleOccurrence.class);
        Assertions.assertEquals(DayOfWeek.MONDAY, model.day());
        Assertions.assertEquals(30318410, model.occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecurrenceScheduleOccurrence model =
            new RecurrenceScheduleOccurrence()
                .withDay(DayOfWeek.MONDAY)
                .withOccurrence(30318410)
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(RecurrenceScheduleOccurrence.class);
        Assertions.assertEquals(DayOfWeek.MONDAY, model.day());
        Assertions.assertEquals(30318410, model.occurrence());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
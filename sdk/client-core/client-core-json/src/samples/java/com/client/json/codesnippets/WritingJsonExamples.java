// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.json.codesnippets;

import com.client.json.JsonProviders;
import com.client.json.JsonWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class WritingJsonExamples {
    public void writeJsonOutputStream() throws IOException {
        // BEGIN: com.client.json.JsonWriter.writeJsonOutputStream
        Map<String, Object> additionalVmProperties = new LinkedHashMap<>();
        additionalVmProperties.put("CloudProvider", "Client");
        additionalVmProperties.put("Available", true);

        VmStatistics vmStatistics = new VmStatistics("large",
            new ComputerProcessor(8, 16, "Processor Corp", 4000000000D, OffsetDateTime.parse("2023-01-01")),
            new ComputerMemory()
                .setMemoryInBytes(10000000000L)
                .setClockSpeedInHertz(4800000000D)
                .setManufacturer("Memory Corp")
                .setErrorCorrecting(true),
            true)
            .setAdditionalProperties(additionalVmProperties);

        ByteArrayOutputStream json = new ByteArrayOutputStream();
        try (JsonWriter jsonWriter = JsonProviders.createWriter(json)) {
            // JsonWriter automatically flushes on close.
            vmStatistics.toJson(jsonWriter);
        }

        // {"VMSize":"large","Processor":{"cores":8,"threads":16,"manufacturer":"Processor Corp",
        //   "clockSpeedInHertz":4000000000.0,"releaseDate":"2023-01-01"},"Memory":{"memoryInBytes":10000000000,
        //   "clockSpeedInHertz":4800000000.0,"manufacturer":"Memory Corp","errorCorrecting":true},
        //   "AcceleratedNetwork":true,"CloudProvider":"Client","Available":true}
        System.out.println(json);
        // END: com.client.json.JsonWriter.writeJsonOutputStream
    }

    public void writeJsonWriter() throws IOException {
        // BEGIN: com.client.json.JsonWriter.writeJsonWriter
        Map<String, Object> additionalVmProperties = new LinkedHashMap<>();
        additionalVmProperties.put("CloudProvider", "Client");
        additionalVmProperties.put("Available", true);

        VmStatistics vmStatistics = new VmStatistics("large",
            new ComputerProcessor(8, 16, "Processor Corp", 4000000000D, OffsetDateTime.parse("2023-01-01")),
            new ComputerMemory()
                .setMemoryInBytes(10000000000L)
                .setClockSpeedInHertz(4800000000D)
                .setManufacturer("Memory Corp")
                .setErrorCorrecting(true),
            true)
            .setAdditionalProperties(additionalVmProperties);

        Writer json = new StringWriter();
        try (JsonWriter jsonWriter = JsonProviders.createWriter(json)) {
            // JsonWriter automatically flushes on close.
            vmStatistics.toJson(jsonWriter);
        }

        // {"VMSize":"large","Processor":{"cores":8,"threads":16,"manufacturer":"Processor Corp",
        //   "clockSpeedInHertz":4000000000.0,"releaseDate":"2023-01-01"},"Memory":{"memoryInBytes":10000000000,
        //   "clockSpeedInHertz":4800000000.0,"manufacturer":"Memory Corp","errorCorrecting":true},
        //   "AcceleratedNetwork":true,"CloudProvider":"Client","Available":true}
        System.out.println(json);
        // END: com.client.json.JsonWriter.writeJsonWriter
    }
}
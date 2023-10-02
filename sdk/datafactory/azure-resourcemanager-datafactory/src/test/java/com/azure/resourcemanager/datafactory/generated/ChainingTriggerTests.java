// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ChainingTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChainingTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChainingTrigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"ChainingTrigger\",\"pipeline\":{\"pipelineReference\":{\"referenceName\":\"imcfmdh\",\"name\":\"lliscyxcluvjppuj\"},\"parameters\":{\"obltoargc\":\"datathshcjg\",\"gvfs\":\"datatgqyqwmzzcg\",\"ybxmuehfkbhymd\":\"dataabuurtuqw\"}},\"typeProperties\":{\"dependsOn\":[{\"referenceName\":\"s\",\"name\":\"j\"},{\"referenceName\":\"chhrnfa\",\"name\":\"e\"}],\"runDimension\":\"iww\"},\"description\":\"kxz\",\"runtimeState\":\"Started\",\"annotations\":[\"datalhmvc\",\"databiagwu\"],\"\":{\"ywtaufm\":\"datayi\"}}")
                .toObject(ChainingTrigger.class);
        Assertions.assertEquals("kxz", model.description());
        Assertions.assertEquals("imcfmdh", model.pipeline().pipelineReference().referenceName());
        Assertions.assertEquals("lliscyxcluvjppuj", model.pipeline().pipelineReference().name());
        Assertions.assertEquals("s", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("j", model.dependsOn().get(0).name());
        Assertions.assertEquals("iww", model.runDimension());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChainingTrigger model =
            new ChainingTrigger()
                .withDescription("kxz")
                .withAnnotations(Arrays.asList("datalhmvc", "databiagwu"))
                .withPipeline(
                    new TriggerPipelineReference()
                        .withPipelineReference(
                            new PipelineReference().withReferenceName("imcfmdh").withName("lliscyxcluvjppuj"))
                        .withParameters(
                            mapOf(
                                "obltoargc",
                                "datathshcjg",
                                "gvfs",
                                "datatgqyqwmzzcg",
                                "ybxmuehfkbhymd",
                                "dataabuurtuqw")))
                .withDependsOn(
                    Arrays
                        .asList(
                            new PipelineReference().withReferenceName("s").withName("j"),
                            new PipelineReference().withReferenceName("chhrnfa").withName("e")))
                .withRunDimension("iww");
        model = BinaryData.fromObject(model).toObject(ChainingTrigger.class);
        Assertions.assertEquals("kxz", model.description());
        Assertions.assertEquals("imcfmdh", model.pipeline().pipelineReference().referenceName());
        Assertions.assertEquals("lliscyxcluvjppuj", model.pipeline().pipelineReference().name());
        Assertions.assertEquals("s", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("j", model.dependsOn().get(0).name());
        Assertions.assertEquals("iww", model.runDimension());
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
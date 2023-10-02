// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLUpdateResourceActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLUpdateResourceActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLUpdateResourceActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"trainedModelName\":\"dataicyufnum\",\"trainedModelLinkedServiceName\":{\"referenceName\":\"e\",\"parameters\":{\"qhmuryajp\":\"datar\",\"ihbvfallpobzv\":\"datauflvazpizossqm\",\"h\":\"datantsfyntkfziitbw\",\"s\":\"datawwhml\"}},\"trainedModelFilePath\":\"databfg\"}")
                .toObject(AzureMLUpdateResourceActivityTypeProperties.class);
        Assertions.assertEquals("e", model.trainedModelLinkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLUpdateResourceActivityTypeProperties model =
            new AzureMLUpdateResourceActivityTypeProperties()
                .withTrainedModelName("dataicyufnum")
                .withTrainedModelLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("e")
                        .withParameters(
                            mapOf(
                                "qhmuryajp",
                                "datar",
                                "ihbvfallpobzv",
                                "datauflvazpizossqm",
                                "h",
                                "datantsfyntkfziitbw",
                                "s",
                                "datawwhml")))
                .withTrainedModelFilePath("databfg");
        model = BinaryData.fromObject(model).toObject(AzureMLUpdateResourceActivityTypeProperties.class);
        Assertions.assertEquals("e", model.trainedModelLinkedServiceName().referenceName());
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
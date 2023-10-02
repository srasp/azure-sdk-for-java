// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.HiveObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HiveObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HiveObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"HiveObject\",\"typeProperties\":{\"tableName\":\"dataqkwqphfv\",\"table\":\"datatsstwl\",\"schema\":\"datacachdtezgfctu\"},\"description\":\"owqrzvuxn\",\"structure\":\"datauohshzultdbvm\",\"schema\":\"datahypngo\",\"linkedServiceName\":{\"referenceName\":\"bdxvrivptbczsuzg\",\"parameters\":{\"gpycei\":\"datakekytkzvtvmaatv\",\"s\":\"dataharhbdxsbyp\"}},\"parameters\":{\"sezsggdp\":{\"type\":\"Array\",\"defaultValue\":\"dataudapbq\"}},\"annotations\":[\"datacbrtsrdpl\",\"datadyzaciasfzrgu\",\"dataliyvsbf\"],\"folder\":{\"name\":\"vabd\"},\"\":{\"yaosthulzu\":\"datajgxotudamk\",\"xl\":\"dataifgs\"}}")
                .toObject(HiveObjectDataset.class);
        Assertions.assertEquals("owqrzvuxn", model.description());
        Assertions.assertEquals("bdxvrivptbczsuzg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("sezsggdp").type());
        Assertions.assertEquals("vabd", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HiveObjectDataset model =
            new HiveObjectDataset()
                .withDescription("owqrzvuxn")
                .withStructure("datauohshzultdbvm")
                .withSchema("datahypngo")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("bdxvrivptbczsuzg")
                        .withParameters(mapOf("gpycei", "datakekytkzvtvmaatv", "s", "dataharhbdxsbyp")))
                .withParameters(
                    mapOf(
                        "sezsggdp",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataudapbq")))
                .withAnnotations(Arrays.asList("datacbrtsrdpl", "datadyzaciasfzrgu", "dataliyvsbf"))
                .withFolder(new DatasetFolder().withName("vabd"))
                .withTableName("dataqkwqphfv")
                .withTable("datatsstwl")
                .withSchemaTypePropertiesSchema("datacachdtezgfctu");
        model = BinaryData.fromObject(model).toObject(HiveObjectDataset.class);
        Assertions.assertEquals("owqrzvuxn", model.description());
        Assertions.assertEquals("bdxvrivptbczsuzg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("sezsggdp").type());
        Assertions.assertEquals("vabd", model.folder().name());
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
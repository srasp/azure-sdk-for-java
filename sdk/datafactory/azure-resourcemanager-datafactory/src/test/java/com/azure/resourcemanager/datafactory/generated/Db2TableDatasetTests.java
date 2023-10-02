// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.Db2TableDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class Db2TableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Db2TableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Db2Table\",\"typeProperties\":{\"tableName\":\"dataefeclflxcj\",\"schema\":\"datazwncvdefxonz\",\"table\":\"datacjptnn\"},\"description\":\"rcjqpzj\",\"structure\":\"datapjrrhpgsjbioag\",\"schema\":\"datai\",\"linkedServiceName\":{\"referenceName\":\"ehmdqvaolidxd\",\"parameters\":{\"rsvxphtjnhptj\":\"datavkjcim\",\"yzhimm\":\"datarkd\",\"izuzjd\":\"datadtdtft\",\"kqoyimxpggk\":\"datargyzcslazp\"}},\"parameters\":{\"deylpbyb\":{\"type\":\"Bool\",\"defaultValue\":\"databgacnqpjuytv\"},\"ifm\":{\"type\":\"Int\",\"defaultValue\":\"datab\"},\"au\":{\"type\":\"Array\",\"defaultValue\":\"datapwdj\"},\"aaaxx\":{\"type\":\"Int\",\"defaultValue\":\"datahznurttu\"}},\"annotations\":[\"datajmdkqtxfrm\",\"dataecxstowa\",\"dataehxuihwes\"],\"folder\":{\"name\":\"aqgblkkncyp\"},\"\":{\"piobnhrfbrjokjwq\":\"datavspsaneyvae\",\"zwfwlrfdjwlzseod\":\"datamraqnilppqcaig\",\"zy\":\"dataqfdrs\"}}")
                .toObject(Db2TableDataset.class);
        Assertions.assertEquals("rcjqpzj", model.description());
        Assertions.assertEquals("ehmdqvaolidxd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("deylpbyb").type());
        Assertions.assertEquals("aqgblkkncyp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Db2TableDataset model =
            new Db2TableDataset()
                .withDescription("rcjqpzj")
                .withStructure("datapjrrhpgsjbioag")
                .withSchema("datai")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("ehmdqvaolidxd")
                        .withParameters(
                            mapOf(
                                "rsvxphtjnhptj",
                                "datavkjcim",
                                "yzhimm",
                                "datarkd",
                                "izuzjd",
                                "datadtdtft",
                                "kqoyimxpggk",
                                "datargyzcslazp")))
                .withParameters(
                    mapOf(
                        "deylpbyb",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("databgacnqpjuytv"),
                        "ifm",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datab"),
                        "au",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datapwdj"),
                        "aaaxx",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datahznurttu")))
                .withAnnotations(Arrays.asList("datajmdkqtxfrm", "dataecxstowa", "dataehxuihwes"))
                .withFolder(new DatasetFolder().withName("aqgblkkncyp"))
                .withTableName("dataefeclflxcj")
                .withSchemaTypePropertiesSchema("datazwncvdefxonz")
                .withTable("datacjptnn");
        model = BinaryData.fromObject(model).toObject(Db2TableDataset.class);
        Assertions.assertEquals("rcjqpzj", model.description());
        Assertions.assertEquals("ehmdqvaolidxd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("deylpbyb").type());
        Assertions.assertEquals("aqgblkkncyp", model.folder().name());
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
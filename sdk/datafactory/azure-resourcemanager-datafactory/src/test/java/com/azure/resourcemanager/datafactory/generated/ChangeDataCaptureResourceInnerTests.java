// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ChangeDataCaptureResourceInner;
import com.azure.resourcemanager.datafactory.models.ChangeDataCaptureFolder;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.DataMapperMapping;
import com.azure.resourcemanager.datafactory.models.FrequencyType;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MapperAttributeMappings;
import com.azure.resourcemanager.datafactory.models.MapperConnection;
import com.azure.resourcemanager.datafactory.models.MapperConnectionReference;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperPolicy;
import com.azure.resourcemanager.datafactory.models.MapperPolicyRecurrence;
import com.azure.resourcemanager.datafactory.models.MapperSourceConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTargetConnectionsInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChangeDataCaptureResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangeDataCaptureResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"folder\":{\"name\":\"ehbhb\"},\"description\":\"sziryrandoyp\",\"sourceConnectionsInfo\":[{\"sourceEntities\":[{\"name\":\"ormkfqlwxldyk\",\"properties\":{}}],\"connection\":{\"linkedService\":{\"referenceName\":\"g\",\"parameters\":{\"sibjgs\":\"datanjpnnbmj\",\"yqegx\":\"datajxxahmrnad\",\"inbmh\":\"dataiv\",\"bkezn\":\"databjijkgqxnh\"}},\"linkedServiceType\":\"ujvaannggi\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{},{}]}}],\"targetConnectionsInfo\":[{\"targetEntities\":[{\"name\":\"wfekaumrrqmb\",\"properties\":{}},{\"name\":\"kratbnxwbj\",\"properties\":{}},{\"name\":\"birkfpksokdg\",\"properties\":{}}],\"connection\":{\"linkedService\":{\"referenceName\":\"ijymrhbguzozky\",\"parameters\":{\"zhhh\":\"dataf\",\"mffjkutycyarn\":\"datao\"}},\"linkedServiceType\":\"ohguabz\",\"type\":\"linkedservicetype\",\"isInlineDataset\":true,\"commonDslConnectorProperties\":[{}]},\"dataMapperMappings\":[{\"targetEntityName\":\"z\",\"sourceEntityName\":\"oeocnhzqrott\",\"sourceConnectionReference\":{},\"attributeMappingInfo\":{},\"sourceDenormalizeInfo\":\"datayjzp\"},{\"targetEntityName\":\"rl\",\"sourceEntityName\":\"apqinf\",\"sourceConnectionReference\":{},\"attributeMappingInfo\":{},\"sourceDenormalizeInfo\":\"dataglqdhm\"}],\"relationships\":[\"dataralcxpjbyypsj\",\"dataqcjenkyhf\",\"datazv\",\"dataqxfx\"]},{\"targetEntities\":[{\"name\":\"cmpzqjhhhqx\",\"properties\":{}}],\"connection\":{\"linkedService\":{\"referenceName\":\"cacoyvivbsiz\",\"parameters\":{\"lzijiufehgmvflnw\":\"dataszlbscm\",\"kxrerlniylylyfwx\":\"datav\"}},\"linkedServiceType\":\"tgqztwhghmup\",\"type\":\"linkedservicetype\",\"isInlineDataset\":true,\"commonDslConnectorProperties\":[{}]},\"dataMapperMappings\":[{\"targetEntityName\":\"bb\",\"sourceEntityName\":\"ftabenbbklqp\",\"sourceConnectionReference\":{},\"attributeMappingInfo\":{},\"sourceDenormalizeInfo\":\"dataafeddwwnlza\"}],\"relationships\":[\"datau\"]},{\"targetEntities\":[{\"name\":\"gookrtalvnb\",\"properties\":{}},{\"name\":\"bemeluclvd\",\"properties\":{}},{\"name\":\"kyrdnqodx\",\"properties\":{}},{\"name\":\"xhqf\",\"properties\":{}}],\"connection\":{\"linkedService\":{\"referenceName\":\"zoqgyipemchga\",\"parameters\":{\"xptlghwzho\":\"datazuejd\",\"s\":\"dataewj\",\"vodrrslblxydkxr\":\"dataliuhqawmoaiancz\"}},\"linkedServiceType\":\"vbxiwkgfbqlj\",\"type\":\"linkedservicetype\",\"isInlineDataset\":true,\"commonDslConnectorProperties\":[{},{},{}]},\"dataMapperMappings\":[{\"targetEntityName\":\"okulehurqlrqf\",\"sourceEntityName\":\"weyurkphyjd\",\"sourceConnectionReference\":{},\"attributeMappingInfo\":{},\"sourceDenormalizeInfo\":\"datajuqdbrx\"},{\"targetEntityName\":\"gchbapxkiy\",\"sourceEntityName\":\"j\",\"sourceConnectionReference\":{},\"attributeMappingInfo\":{},\"sourceDenormalizeInfo\":\"databuscgduus\"}],\"relationships\":[\"datacblevpmc\",\"dataujyxkyxlzgsj\",\"datakzzltafhbzf\"]}],\"policy\":{\"mode\":\"vwmbjlzqsczpg\",\"recurrence\":{\"frequency\":\"Hour\",\"interval\":1263601640}},\"allowVNetOverride\":false,\"status\":\"wow\"},\"name\":\"ptnuwjtkschgc\",\"type\":\"y\",\"etag\":\"eseyqr\",\"\":{\"kwiswskukjtas\":\"dataeldotjv\"},\"id\":\"wispkxk\"}")
                .toObject(ChangeDataCaptureResourceInner.class);
        Assertions.assertEquals("wispkxk", model.id());
        Assertions.assertEquals("ehbhb", model.folder().name());
        Assertions.assertEquals("sziryrandoyp", model.description());
        Assertions.assertEquals("ormkfqlwxldyk", model.sourceConnectionsInfo().get(0).sourceEntities().get(0).name());
        Assertions.assertEquals("g", model.sourceConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("ujvaannggi", model.sourceConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions
            .assertEquals(ConnectionType.LINKEDSERVICETYPE, model.sourceConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.sourceConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("wfekaumrrqmb", model.targetConnectionsInfo().get(0).targetEntities().get(0).name());
        Assertions
            .assertEquals(
                "ijymrhbguzozky", model.targetConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("ohguabz", model.targetConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions
            .assertEquals(ConnectionType.LINKEDSERVICETYPE, model.targetConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(true, model.targetConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions
            .assertEquals("z", model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).targetEntityName());
        Assertions
            .assertEquals(
                "oeocnhzqrott", model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceEntityName());
        Assertions.assertEquals("vwmbjlzqsczpg", model.policy().mode());
        Assertions.assertEquals(FrequencyType.HOUR, model.policy().recurrence().frequency());
        Assertions.assertEquals(1263601640, model.policy().recurrence().interval());
        Assertions.assertEquals(false, model.allowVNetOverride());
        Assertions.assertEquals("wow", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangeDataCaptureResourceInner model =
            new ChangeDataCaptureResourceInner()
                .withId("wispkxk")
                .withFolder(new ChangeDataCaptureFolder().withName("ehbhb"))
                .withDescription("sziryrandoyp")
                .withSourceConnectionsInfo(
                    Arrays
                        .asList(
                            new MapperSourceConnectionsInfo()
                                .withSourceEntities(Arrays.asList(new MapperTable().withName("ormkfqlwxldyk")))
                                .withConnection(
                                    new MapperConnection()
                                        .withLinkedService(
                                            new LinkedServiceReference()
                                                .withReferenceName("g")
                                                .withParameters(
                                                    mapOf(
                                                        "sibjgs",
                                                        "datanjpnnbmj",
                                                        "yqegx",
                                                        "datajxxahmrnad",
                                                        "inbmh",
                                                        "dataiv",
                                                        "bkezn",
                                                        "databjijkgqxnh")))
                                        .withLinkedServiceType("ujvaannggi")
                                        .withType(ConnectionType.LINKEDSERVICETYPE)
                                        .withIsInlineDataset(false)
                                        .withCommonDslConnectorProperties(
                                            Arrays
                                                .asList(
                                                    new MapperDslConnectorProperties(),
                                                    new MapperDslConnectorProperties())))))
                .withTargetConnectionsInfo(
                    Arrays
                        .asList(
                            new MapperTargetConnectionsInfo()
                                .withTargetEntities(
                                    Arrays
                                        .asList(
                                            new MapperTable().withName("wfekaumrrqmb"),
                                            new MapperTable().withName("kratbnxwbj"),
                                            new MapperTable().withName("birkfpksokdg")))
                                .withConnection(
                                    new MapperConnection()
                                        .withLinkedService(
                                            new LinkedServiceReference()
                                                .withReferenceName("ijymrhbguzozky")
                                                .withParameters(mapOf("zhhh", "dataf", "mffjkutycyarn", "datao")))
                                        .withLinkedServiceType("ohguabz")
                                        .withType(ConnectionType.LINKEDSERVICETYPE)
                                        .withIsInlineDataset(true)
                                        .withCommonDslConnectorProperties(
                                            Arrays.asList(new MapperDslConnectorProperties())))
                                .withDataMapperMappings(
                                    Arrays
                                        .asList(
                                            new DataMapperMapping()
                                                .withTargetEntityName("z")
                                                .withSourceEntityName("oeocnhzqrott")
                                                .withSourceConnectionReference(new MapperConnectionReference())
                                                .withAttributeMappingInfo(new MapperAttributeMappings())
                                                .withSourceDenormalizeInfo("datayjzp"),
                                            new DataMapperMapping()
                                                .withTargetEntityName("rl")
                                                .withSourceEntityName("apqinf")
                                                .withSourceConnectionReference(new MapperConnectionReference())
                                                .withAttributeMappingInfo(new MapperAttributeMappings())
                                                .withSourceDenormalizeInfo("dataglqdhm")))
                                .withRelationships(
                                    Arrays.asList("dataralcxpjbyypsj", "dataqcjenkyhf", "datazv", "dataqxfx")),
                            new MapperTargetConnectionsInfo()
                                .withTargetEntities(Arrays.asList(new MapperTable().withName("cmpzqjhhhqx")))
                                .withConnection(
                                    new MapperConnection()
                                        .withLinkedService(
                                            new LinkedServiceReference()
                                                .withReferenceName("cacoyvivbsiz")
                                                .withParameters(
                                                    mapOf(
                                                        "lzijiufehgmvflnw",
                                                        "dataszlbscm",
                                                        "kxrerlniylylyfwx",
                                                        "datav")))
                                        .withLinkedServiceType("tgqztwhghmup")
                                        .withType(ConnectionType.LINKEDSERVICETYPE)
                                        .withIsInlineDataset(true)
                                        .withCommonDslConnectorProperties(
                                            Arrays.asList(new MapperDslConnectorProperties())))
                                .withDataMapperMappings(
                                    Arrays
                                        .asList(
                                            new DataMapperMapping()
                                                .withTargetEntityName("bb")
                                                .withSourceEntityName("ftabenbbklqp")
                                                .withSourceConnectionReference(new MapperConnectionReference())
                                                .withAttributeMappingInfo(new MapperAttributeMappings())
                                                .withSourceDenormalizeInfo("dataafeddwwnlza")))
                                .withRelationships(Arrays.asList("datau")),
                            new MapperTargetConnectionsInfo()
                                .withTargetEntities(
                                    Arrays
                                        .asList(
                                            new MapperTable().withName("gookrtalvnb"),
                                            new MapperTable().withName("bemeluclvd"),
                                            new MapperTable().withName("kyrdnqodx"),
                                            new MapperTable().withName("xhqf")))
                                .withConnection(
                                    new MapperConnection()
                                        .withLinkedService(
                                            new LinkedServiceReference()
                                                .withReferenceName("zoqgyipemchga")
                                                .withParameters(
                                                    mapOf(
                                                        "xptlghwzho",
                                                        "datazuejd",
                                                        "s",
                                                        "dataewj",
                                                        "vodrrslblxydkxr",
                                                        "dataliuhqawmoaiancz")))
                                        .withLinkedServiceType("vbxiwkgfbqlj")
                                        .withType(ConnectionType.LINKEDSERVICETYPE)
                                        .withIsInlineDataset(true)
                                        .withCommonDslConnectorProperties(
                                            Arrays
                                                .asList(
                                                    new MapperDslConnectorProperties(),
                                                    new MapperDslConnectorProperties(),
                                                    new MapperDslConnectorProperties())))
                                .withDataMapperMappings(
                                    Arrays
                                        .asList(
                                            new DataMapperMapping()
                                                .withTargetEntityName("okulehurqlrqf")
                                                .withSourceEntityName("weyurkphyjd")
                                                .withSourceConnectionReference(new MapperConnectionReference())
                                                .withAttributeMappingInfo(new MapperAttributeMappings())
                                                .withSourceDenormalizeInfo("datajuqdbrx"),
                                            new DataMapperMapping()
                                                .withTargetEntityName("gchbapxkiy")
                                                .withSourceEntityName("j")
                                                .withSourceConnectionReference(new MapperConnectionReference())
                                                .withAttributeMappingInfo(new MapperAttributeMappings())
                                                .withSourceDenormalizeInfo("databuscgduus")))
                                .withRelationships(
                                    Arrays.asList("datacblevpmc", "dataujyxkyxlzgsj", "datakzzltafhbzf"))))
                .withPolicy(
                    new MapperPolicy()
                        .withMode("vwmbjlzqsczpg")
                        .withRecurrence(
                            new MapperPolicyRecurrence().withFrequency(FrequencyType.HOUR).withInterval(1263601640)))
                .withAllowVNetOverride(false)
                .withStatus("wow")
                .withAdditionalProperties(mapOf("name", "ptnuwjtkschgc", "etag", "eseyqr", "type", "y"));
        model = BinaryData.fromObject(model).toObject(ChangeDataCaptureResourceInner.class);
        Assertions.assertEquals("wispkxk", model.id());
        Assertions.assertEquals("ehbhb", model.folder().name());
        Assertions.assertEquals("sziryrandoyp", model.description());
        Assertions.assertEquals("ormkfqlwxldyk", model.sourceConnectionsInfo().get(0).sourceEntities().get(0).name());
        Assertions.assertEquals("g", model.sourceConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("ujvaannggi", model.sourceConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions
            .assertEquals(ConnectionType.LINKEDSERVICETYPE, model.sourceConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false, model.sourceConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("wfekaumrrqmb", model.targetConnectionsInfo().get(0).targetEntities().get(0).name());
        Assertions
            .assertEquals(
                "ijymrhbguzozky", model.targetConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("ohguabz", model.targetConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions
            .assertEquals(ConnectionType.LINKEDSERVICETYPE, model.targetConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(true, model.targetConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions
            .assertEquals("z", model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).targetEntityName());
        Assertions
            .assertEquals(
                "oeocnhzqrott", model.targetConnectionsInfo().get(0).dataMapperMappings().get(0).sourceEntityName());
        Assertions.assertEquals("vwmbjlzqsczpg", model.policy().mode());
        Assertions.assertEquals(FrequencyType.HOUR, model.policy().recurrence().frequency());
        Assertions.assertEquals(1263601640, model.policy().recurrence().interval());
        Assertions.assertEquals(false, model.allowVNetOverride());
        Assertions.assertEquals("wow", model.status());
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
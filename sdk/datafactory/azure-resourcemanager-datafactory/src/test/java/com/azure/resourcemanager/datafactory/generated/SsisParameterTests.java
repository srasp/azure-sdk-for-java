// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import org.junit.jupiter.api.Assertions;

public final class SsisParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisParameter model =
            BinaryData
                .fromString(
                    "{\"id\":3549610144167513440,\"name\":\"vnfjng\",\"description\":\"mrdvhbgtuhwhx\",\"dataType\":\"we\",\"required\":false,\"sensitive\":false,\"designDefaultValue\":\"nuzgzrxxduseb\",\"defaultValue\":\"fetxpuntermasuiq\",\"sensitiveDefaultValue\":\"n\",\"valueType\":\"tubqwxv\",\"valueSet\":false,\"variable\":\"iyzjlgrwjbsyc\"}")
                .toObject(SsisParameter.class);
        Assertions.assertEquals(3549610144167513440L, model.id());
        Assertions.assertEquals("vnfjng", model.name());
        Assertions.assertEquals("mrdvhbgtuhwhx", model.description());
        Assertions.assertEquals("we", model.dataType());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("nuzgzrxxduseb", model.designDefaultValue());
        Assertions.assertEquals("fetxpuntermasuiq", model.defaultValue());
        Assertions.assertEquals("n", model.sensitiveDefaultValue());
        Assertions.assertEquals("tubqwxv", model.valueType());
        Assertions.assertEquals(false, model.valueSet());
        Assertions.assertEquals("iyzjlgrwjbsyc", model.variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisParameter model =
            new SsisParameter()
                .withId(3549610144167513440L)
                .withName("vnfjng")
                .withDescription("mrdvhbgtuhwhx")
                .withDataType("we")
                .withRequired(false)
                .withSensitive(false)
                .withDesignDefaultValue("nuzgzrxxduseb")
                .withDefaultValue("fetxpuntermasuiq")
                .withSensitiveDefaultValue("n")
                .withValueType("tubqwxv")
                .withValueSet(false)
                .withVariable("iyzjlgrwjbsyc");
        model = BinaryData.fromObject(model).toObject(SsisParameter.class);
        Assertions.assertEquals(3549610144167513440L, model.id());
        Assertions.assertEquals("vnfjng", model.name());
        Assertions.assertEquals("mrdvhbgtuhwhx", model.description());
        Assertions.assertEquals("we", model.dataType());
        Assertions.assertEquals(false, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("nuzgzrxxduseb", model.designDefaultValue());
        Assertions.assertEquals("fetxpuntermasuiq", model.defaultValue());
        Assertions.assertEquals("n", model.sensitiveDefaultValue());
        Assertions.assertEquals("tubqwxv", model.valueType());
        Assertions.assertEquals(false, model.valueSet());
        Assertions.assertEquals("iyzjlgrwjbsyc", model.variable());
    }
}
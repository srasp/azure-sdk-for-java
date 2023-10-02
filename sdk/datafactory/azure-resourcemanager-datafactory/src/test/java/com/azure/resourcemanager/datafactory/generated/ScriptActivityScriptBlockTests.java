// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameter;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterDirection;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterType;
import com.azure.resourcemanager.datafactory.models.ScriptActivityScriptBlock;
import com.azure.resourcemanager.datafactory.models.ScriptType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScriptActivityScriptBlockTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActivityScriptBlock model =
            BinaryData
                .fromString(
                    "{\"text\":\"datanvjhoshinljquq\",\"type\":\"NonQuery\",\"parameters\":[{\"name\":\"datagvco\",\"type\":\"Int32\",\"value\":\"datapvursmeumyxpsov\",\"direction\":\"Input\",\"size\":1077659067},{\"name\":\"dataskkgsfmgypqm\",\"type\":\"DateTimeOffset\",\"value\":\"dataqzmixw\",\"direction\":\"Input\",\"size\":343668067},{\"name\":\"datasehtzjbuzl\",\"type\":\"Single\",\"value\":\"datakzbsbcddhl\",\"direction\":\"Output\",\"size\":1461764775},{\"name\":\"dataqnyjjfjqgs\",\"type\":\"Double\",\"value\":\"datanxexafql\",\"direction\":\"Input\",\"size\":1093869610}]}")
                .toObject(ScriptActivityScriptBlock.class);
        Assertions.assertEquals(ScriptType.NON_QUERY, model.type());
        Assertions.assertEquals(ScriptActivityParameterType.INT32, model.parameters().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterDirection.INPUT, model.parameters().get(0).direction());
        Assertions.assertEquals(1077659067, model.parameters().get(0).size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActivityScriptBlock model =
            new ScriptActivityScriptBlock()
                .withText("datanvjhoshinljquq")
                .withType(ScriptType.NON_QUERY)
                .withParameters(
                    Arrays
                        .asList(
                            new ScriptActivityParameter()
                                .withName("datagvco")
                                .withType(ScriptActivityParameterType.INT32)
                                .withValue("datapvursmeumyxpsov")
                                .withDirection(ScriptActivityParameterDirection.INPUT)
                                .withSize(1077659067),
                            new ScriptActivityParameter()
                                .withName("dataskkgsfmgypqm")
                                .withType(ScriptActivityParameterType.DATE_TIME_OFFSET)
                                .withValue("dataqzmixw")
                                .withDirection(ScriptActivityParameterDirection.INPUT)
                                .withSize(343668067),
                            new ScriptActivityParameter()
                                .withName("datasehtzjbuzl")
                                .withType(ScriptActivityParameterType.SINGLE)
                                .withValue("datakzbsbcddhl")
                                .withDirection(ScriptActivityParameterDirection.OUTPUT)
                                .withSize(1461764775),
                            new ScriptActivityParameter()
                                .withName("dataqnyjjfjqgs")
                                .withType(ScriptActivityParameterType.DOUBLE)
                                .withValue("datanxexafql")
                                .withDirection(ScriptActivityParameterDirection.INPUT)
                                .withSize(1093869610)));
        model = BinaryData.fromObject(model).toObject(ScriptActivityScriptBlock.class);
        Assertions.assertEquals(ScriptType.NON_QUERY, model.type());
        Assertions.assertEquals(ScriptActivityParameterType.INT32, model.parameters().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterDirection.INPUT, model.parameters().get(0).direction());
        Assertions.assertEquals(1077659067, model.parameters().get(0).size());
    }
}
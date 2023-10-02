// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import org.junit.jupiter.api.Assertions;

public final class NotebookParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotebookParameter model =
            BinaryData.fromString("{\"value\":\"datauhnwcqvel\",\"type\":\"float\"}").toObject(NotebookParameter.class);
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotebookParameter model =
            new NotebookParameter().withValue("datauhnwcqvel").withType(NotebookParameterType.FLOAT);
        model = BinaryData.fromObject(model).toObject(NotebookParameter.class);
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.type());
    }
}
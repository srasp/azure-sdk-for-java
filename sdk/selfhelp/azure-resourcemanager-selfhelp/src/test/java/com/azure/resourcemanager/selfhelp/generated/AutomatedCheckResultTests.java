// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.AutomatedCheckResult;
import com.azure.resourcemanager.selfhelp.models.AutomatedCheckResultType;
import org.junit.jupiter.api.Assertions;

public final class AutomatedCheckResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomatedCheckResult model =
            BinaryData.fromString("{\"result\":\"fluszdtm\",\"type\":\"Error\"}").toObject(AutomatedCheckResult.class);
        Assertions.assertEquals("fluszdtm", model.result());
        Assertions.assertEquals(AutomatedCheckResultType.ERROR, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomatedCheckResult model =
            new AutomatedCheckResult().withResult("fluszdtm").withType(AutomatedCheckResultType.ERROR);
        model = BinaryData.fromObject(model).toObject(AutomatedCheckResult.class);
        Assertions.assertEquals("fluszdtm", model.result());
        Assertions.assertEquals(AutomatedCheckResultType.ERROR, model.type());
    }
}
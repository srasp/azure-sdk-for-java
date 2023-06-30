// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.QuestionType;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterResponse;
import org.junit.jupiter.api.Assertions;

public final class TroubleshooterResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TroubleshooterResponse model =
            BinaryData
                .fromString("{\"questionId\":\"tkcnqxwb\",\"questionType\":\"TextInput\",\"response\":\"lpiujwaa\"}")
                .toObject(TroubleshooterResponse.class);
        Assertions.assertEquals("tkcnqxwb", model.questionId());
        Assertions.assertEquals(QuestionType.TEXT_INPUT, model.questionType());
        Assertions.assertEquals("lpiujwaa", model.response());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TroubleshooterResponse model =
            new TroubleshooterResponse()
                .withQuestionId("tkcnqxwb")
                .withQuestionType(QuestionType.TEXT_INPUT)
                .withResponse("lpiujwaa");
        model = BinaryData.fromObject(model).toObject(TroubleshooterResponse.class);
        Assertions.assertEquals("tkcnqxwb", model.questionId());
        Assertions.assertEquals(QuestionType.TEXT_INPUT, model.questionType());
        Assertions.assertEquals("lpiujwaa", model.response());
    }
}
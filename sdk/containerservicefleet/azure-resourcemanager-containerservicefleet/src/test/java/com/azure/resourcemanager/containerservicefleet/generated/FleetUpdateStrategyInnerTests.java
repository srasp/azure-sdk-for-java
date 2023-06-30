// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetUpdateStrategyInner;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FleetUpdateStrategyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetUpdateStrategyInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Canceled\",\"strategy\":{\"stages\":[{\"name\":\"dbpgnxytxhp\",\"groups\":[{\"name\":\"zpfzabglc\"},{\"name\":\"hxw\"}],\"afterStageWaitInSeconds\":767485321}]}},\"eTag\":\"qik\",\"id\":\"bovpl\",\"name\":\"zbhvgyuguosv\",\"type\":\"kfssxqukkf\"}")
                .toObject(FleetUpdateStrategyInner.class);
        Assertions.assertEquals("dbpgnxytxhp", model.strategy().stages().get(0).name());
        Assertions.assertEquals("zpfzabglc", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(767485321, model.strategy().stages().get(0).afterStageWaitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetUpdateStrategyInner model =
            new FleetUpdateStrategyInner()
                .withStrategy(
                    new UpdateRunStrategy()
                        .withStages(
                            Arrays
                                .asList(
                                    new UpdateStage()
                                        .withName("dbpgnxytxhp")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("zpfzabglc"),
                                                    new UpdateGroup().withName("hxw")))
                                        .withAfterStageWaitInSeconds(767485321))));
        model = BinaryData.fromObject(model).toObject(FleetUpdateStrategyInner.class);
        Assertions.assertEquals("dbpgnxytxhp", model.strategy().stages().get(0).name());
        Assertions.assertEquals("zpfzabglc", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(767485321, model.strategy().stages().get(0).afterStageWaitInSeconds());
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.SyncStats;

public final class SyncStatsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SyncStats model =
            BinaryData
                .fromString(
                    "{\"added\":1290040732,\"updated\":1874212634,\"unchanged\":130298647,\"removed\":450468139,\"validationErrors\":509090660,\"synchronizationErrors\":545322213}")
                .toObject(SyncStats.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SyncStats model = new SyncStats();
        model = BinaryData.fromObject(model).toObject(SyncStats.class);
    }
}
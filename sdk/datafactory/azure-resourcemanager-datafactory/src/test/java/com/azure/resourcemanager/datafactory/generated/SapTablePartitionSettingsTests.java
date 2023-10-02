// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapTablePartitionSettings;

public final class SapTablePartitionSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapTablePartitionSettings model =
            BinaryData
                .fromString(
                    "{\"partitionColumnName\":\"datada\",\"partitionUpperBound\":\"datahtwhh\",\"partitionLowerBound\":\"databomf\",\"maxPartitionsNumber\":\"datajkerdujfnb\"}")
                .toObject(SapTablePartitionSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapTablePartitionSettings model =
            new SapTablePartitionSettings()
                .withPartitionColumnName("datada")
                .withPartitionUpperBound("datahtwhh")
                .withPartitionLowerBound("databomf")
                .withMaxPartitionsNumber("datajkerdujfnb");
        model = BinaryData.fromObject(model).toObject(SapTablePartitionSettings.class);
    }
}
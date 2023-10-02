// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSWriteSettings;

public final class AzureBlobFSWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSWriteSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureBlobFSWriteSettings\",\"blockSizeInMB\":\"datacbwmvp\",\"maxConcurrentConnections\":\"datajyzicel\",\"disableMetricsCollection\":\"dataazcgwnibnduqgji\",\"copyBehavior\":\"dataxxiao\",\"\":{\"pugnvhtgwadu\":\"datauhumgw\"}}")
                .toObject(AzureBlobFSWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSWriteSettings model =
            new AzureBlobFSWriteSettings()
                .withMaxConcurrentConnections("datajyzicel")
                .withDisableMetricsCollection("dataazcgwnibnduqgji")
                .withCopyBehavior("dataxxiao")
                .withBlockSizeInMB("datacbwmvp");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSWriteSettings.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobStorageWriteSettings;

public final class AzureBlobStorageWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobStorageWriteSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureBlobStorageWriteSettings\",\"blockSizeInMB\":\"datanisoorwfdtjpsjwl\",\"maxConcurrentConnections\":\"dataxl\",\"disableMetricsCollection\":\"datazcdrgtuaoouocaf\",\"copyBehavior\":\"datavhjrpbnrolge\",\"\":{\"lbyjahbzbtl\":\"datanenjtxuuwdmrqa\"}}")
                .toObject(AzureBlobStorageWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobStorageWriteSettings model =
            new AzureBlobStorageWriteSettings()
                .withMaxConcurrentConnections("dataxl")
                .withDisableMetricsCollection("datazcdrgtuaoouocaf")
                .withCopyBehavior("datavhjrpbnrolge")
                .withBlockSizeInMB("datanisoorwfdtjpsjwl");
        model = BinaryData.fromObject(model).toObject(AzureBlobStorageWriteSettings.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreReadSettings;

public final class AzureDataLakeStoreReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureDataLakeStoreReadSettings\",\"recursive\":\"dataev\",\"wildcardFolderPath\":\"datauvupdsafqaghw\",\"wildcardFileName\":\"datamecqyi\",\"fileListPath\":\"datajmvvkodkqffhuxo\",\"listAfter\":\"datatgzvzcfmwfogj\",\"listBefore\":\"datamtbpnhjo\",\"enablePartitionDiscovery\":\"datavfz\",\"partitionRootPath\":\"datakrmptapyqees\",\"deleteFilesAfterCompletion\":\"datanpixhulfjl\",\"modifiedDatetimeStart\":\"datahv\",\"modifiedDatetimeEnd\":\"datakwrvtflotjizvi\",\"maxConcurrentConnections\":\"dataixlvnwznfx\",\"disableMetricsCollection\":\"dataylsl\",\"\":{\"llatbld\":\"datatrwkpelyglfwma\",\"nithxnainssv\":\"datacfh\",\"bmyghqtthsb\":\"datakzslylioguwshrmc\"}}")
                .toObject(AzureDataLakeStoreReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreReadSettings model =
            new AzureDataLakeStoreReadSettings()
                .withMaxConcurrentConnections("dataixlvnwznfx")
                .withDisableMetricsCollection("dataylsl")
                .withRecursive("dataev")
                .withWildcardFolderPath("datauvupdsafqaghw")
                .withWildcardFileName("datamecqyi")
                .withFileListPath("datajmvvkodkqffhuxo")
                .withListAfter("datatgzvzcfmwfogj")
                .withListBefore("datamtbpnhjo")
                .withEnablePartitionDiscovery("datavfz")
                .withPartitionRootPath("datakrmptapyqees")
                .withDeleteFilesAfterCompletion("datanpixhulfjl")
                .withModifiedDatetimeStart("datahv")
                .withModifiedDatetimeEnd("datakwrvtflotjizvi");
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreReadSettings.class);
    }
}
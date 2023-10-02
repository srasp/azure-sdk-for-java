// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3CompatibleReadSettings;

public final class AmazonS3CompatibleReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonS3CompatibleReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"AmazonS3CompatibleReadSettings\",\"recursive\":\"datagd\",\"wildcardFolderPath\":\"datajkoxlccjdooy\",\"wildcardFileName\":\"dataozzo\",\"prefix\":\"datadjhqqlbwid\",\"fileListPath\":\"datadftbxruu\",\"enablePartitionDiscovery\":\"dataaarrrgjnqkuca\",\"partitionRootPath\":\"datanpwgchl\",\"deleteFilesAfterCompletion\":\"datattxfitt\",\"modifiedDatetimeStart\":\"dataaxq\",\"modifiedDatetimeEnd\":\"dataflnl\",\"maxConcurrentConnections\":\"dataacss\",\"disableMetricsCollection\":\"datallfukqurrtcfgq\",\"\":{\"vymo\":\"datayrsleghozsmjj\",\"sxv\":\"dataryyyvlxmspjqa\"}}")
                .toObject(AmazonS3CompatibleReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonS3CompatibleReadSettings model =
            new AmazonS3CompatibleReadSettings()
                .withMaxConcurrentConnections("dataacss")
                .withDisableMetricsCollection("datallfukqurrtcfgq")
                .withRecursive("datagd")
                .withWildcardFolderPath("datajkoxlccjdooy")
                .withWildcardFileName("dataozzo")
                .withPrefix("datadjhqqlbwid")
                .withFileListPath("datadftbxruu")
                .withEnablePartitionDiscovery("dataaarrrgjnqkuca")
                .withPartitionRootPath("datanpwgchl")
                .withDeleteFilesAfterCompletion("datattxfitt")
                .withModifiedDatetimeStart("dataaxq")
                .withModifiedDatetimeEnd("dataflnl");
        model = BinaryData.fromObject(model).toObject(AmazonS3CompatibleReadSettings.class);
    }
}
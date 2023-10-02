// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataExplorerSink;

public final class AzureDataExplorerSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataExplorerSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureDataExplorerSink\",\"ingestionMappingName\":\"dataezlqwbgly\",\"ingestionMappingAsJson\":\"dataztt\",\"flushImmediately\":\"datayrwdsnpuo\",\"writeBatchSize\":\"datar\",\"writeBatchTimeout\":\"dataizybpjyp\",\"sinkRetryCount\":\"datatkzghwcywrbmxwls\",\"sinkRetryWait\":\"dataffwf\",\"maxConcurrentConnections\":\"dataiezbmhsqy\",\"disableMetricsCollection\":\"datawbzhafcoayuq\",\"\":{\"yfjtsem\":\"dataghjmmjmmjnx\",\"ocyo\":\"dataidbaykvlrsbrn\",\"mbch\":\"datap\",\"ybugojzcargsxmaw\":\"dataskwaffsjqnjp\"}}")
                .toObject(AzureDataExplorerSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataExplorerSink model =
            new AzureDataExplorerSink()
                .withWriteBatchSize("datar")
                .withWriteBatchTimeout("dataizybpjyp")
                .withSinkRetryCount("datatkzghwcywrbmxwls")
                .withSinkRetryWait("dataffwf")
                .withMaxConcurrentConnections("dataiezbmhsqy")
                .withDisableMetricsCollection("datawbzhafcoayuq")
                .withIngestionMappingName("dataezlqwbgly")
                .withIngestionMappingAsJson("dataztt")
                .withFlushImmediately("datayrwdsnpuo");
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerSink.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSource;

public final class AzureBlobFSSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureBlobFSSource\",\"treatEmptyAsNull\":\"datazlcfe\",\"skipHeaderLineCount\":\"dataryxnklfswzsyigx\",\"recursive\":\"dataxhygc\",\"sourceRetryCount\":\"databapeuqyz\",\"sourceRetryWait\":\"datasuopcdiaossp\",\"maxConcurrentConnections\":\"datatgkmrsqaqgllnhgi\",\"disableMetricsCollection\":\"datawzzk\",\"\":{\"wdkpadktsyywa\":\"datarnglgituae\",\"dajqpdvvzbejx\":\"datajrfqtfkkiup\"}}")
                .toObject(AzureBlobFSSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSource model =
            new AzureBlobFSSource()
                .withSourceRetryCount("databapeuqyz")
                .withSourceRetryWait("datasuopcdiaossp")
                .withMaxConcurrentConnections("datatgkmrsqaqgllnhgi")
                .withDisableMetricsCollection("datawzzk")
                .withTreatEmptyAsNull("datazlcfe")
                .withSkipHeaderLineCount("dataryxnklfswzsyigx")
                .withRecursive("dataxhygc");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSource.class);
    }
}
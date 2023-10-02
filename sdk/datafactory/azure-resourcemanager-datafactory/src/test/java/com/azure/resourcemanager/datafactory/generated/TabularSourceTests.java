// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularSource;

public final class TabularSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TabularSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"TabularSource\",\"queryTimeout\":\"datakrsyfdsg\",\"additionalColumns\":\"datake\",\"sourceRetryCount\":\"datamrupgevjma\",\"sourceRetryWait\":\"datarvvjoklb\",\"maxConcurrentConnections\":\"datat\",\"disableMetricsCollection\":\"datatwxfjlpk\",\"\":{\"uvwlfzjrjgla\":\"dataexfmqfuflu\"}}")
                .toObject(TabularSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TabularSource model =
            new TabularSource()
                .withSourceRetryCount("datamrupgevjma")
                .withSourceRetryWait("datarvvjoklb")
                .withMaxConcurrentConnections("datat")
                .withDisableMetricsCollection("datatwxfjlpk")
                .withQueryTimeout("datakrsyfdsg")
                .withAdditionalColumns("datake");
        model = BinaryData.fromObject(model).toObject(TabularSource.class);
    }
}
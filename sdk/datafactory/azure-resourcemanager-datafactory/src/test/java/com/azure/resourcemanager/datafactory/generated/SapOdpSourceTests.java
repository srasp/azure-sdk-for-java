// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapOdpSource;

public final class SapOdpSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOdpSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapOdpSource\",\"extractionMode\":\"datalug\",\"subscriberProcess\":\"datau\",\"selection\":\"dataypliotgtlan\",\"projection\":\"datakvlxsycqqdoxooxu\",\"queryTimeout\":\"datafqoobwxctkveq\",\"additionalColumns\":\"dataedw\",\"sourceRetryCount\":\"dataqcjreryp\",\"sourceRetryWait\":\"datayqxeyzqnupsi\",\"maxConcurrentConnections\":\"datalxvaovssibnv\",\"disableMetricsCollection\":\"datavi\",\"\":{\"iyo\":\"databmzwlej\",\"xzdbntop\":\"datanbualr\",\"lgsxkyboysquyg\":\"dataabndwcfmzmqmg\",\"stwcyigrhfevxy\":\"datakh\"}}")
                .toObject(SapOdpSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOdpSource model =
            new SapOdpSource()
                .withSourceRetryCount("dataqcjreryp")
                .withSourceRetryWait("datayqxeyzqnupsi")
                .withMaxConcurrentConnections("datalxvaovssibnv")
                .withDisableMetricsCollection("datavi")
                .withQueryTimeout("datafqoobwxctkveq")
                .withAdditionalColumns("dataedw")
                .withExtractionMode("datalug")
                .withSubscriberProcess("datau")
                .withSelection("dataypliotgtlan")
                .withProjection("datakvlxsycqqdoxooxu");
        model = BinaryData.fromObject(model).toObject(SapOdpSource.class);
    }
}
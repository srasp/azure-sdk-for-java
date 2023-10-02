// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PaypalSource;

public final class PaypalSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PaypalSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"PaypalSource\",\"query\":\"datamm\",\"queryTimeout\":\"datatzxsvwqiwgjwrhu\",\"additionalColumns\":\"dataaaaxigafa\",\"sourceRetryCount\":\"datatoo\",\"sourceRetryWait\":\"datazdoblpdtcyv\",\"maxConcurrentConnections\":\"datahboplavgfbvro\",\"disableMetricsCollection\":\"datauexqweyslwlppoh\",\"\":{\"gb\":\"datagalexyiygkadtwd\",\"vxcjdobsgv\":\"dataxt\"}}")
                .toObject(PaypalSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PaypalSource model =
            new PaypalSource()
                .withSourceRetryCount("datatoo")
                .withSourceRetryWait("datazdoblpdtcyv")
                .withMaxConcurrentConnections("datahboplavgfbvro")
                .withDisableMetricsCollection("datauexqweyslwlppoh")
                .withQueryTimeout("datatzxsvwqiwgjwrhu")
                .withAdditionalColumns("dataaaaxigafa")
                .withQuery("datamm");
        model = BinaryData.fromObject(model).toObject(PaypalSource.class);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HttpServerLocation;

public final class HttpServerLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpServerLocation model =
            BinaryData
                .fromString(
                    "{\"type\":\"HttpServerLocation\",\"relativeUrl\":\"datauklajvcfoc\",\"folderPath\":\"dataapejovtkwx\",\"fileName\":\"datawhhnoyrzaa\",\"\":{\"envjeateaxxc\":\"datahpm\"}}")
                .toObject(HttpServerLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpServerLocation model =
            new HttpServerLocation()
                .withFolderPath("dataapejovtkwx")
                .withFileName("datawhhnoyrzaa")
                .withRelativeUrl("datauklajvcfoc");
        model = BinaryData.fromObject(model).toObject(HttpServerLocation.class);
    }
}
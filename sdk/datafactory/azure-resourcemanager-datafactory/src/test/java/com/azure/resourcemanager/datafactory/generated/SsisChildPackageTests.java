// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisChildPackage;
import org.junit.jupiter.api.Assertions;

public final class SsisChildPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisChildPackage model =
            BinaryData
                .fromString(
                    "{\"packagePath\":\"dataozfaj\",\"packageName\":\"bswwbrllvva\",\"packageContent\":\"dataujcqz\",\"packageLastModifiedDate\":\"wlxz\"}")
                .toObject(SsisChildPackage.class);
        Assertions.assertEquals("bswwbrllvva", model.packageName());
        Assertions.assertEquals("wlxz", model.packageLastModifiedDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisChildPackage model =
            new SsisChildPackage()
                .withPackagePath("dataozfaj")
                .withPackageName("bswwbrllvva")
                .withPackageContent("dataujcqz")
                .withPackageLastModifiedDate("wlxz");
        model = BinaryData.fromObject(model).toObject(SsisChildPackage.class);
        Assertions.assertEquals("bswwbrllvva", model.packageName());
        Assertions.assertEquals("wlxz", model.packageLastModifiedDate());
    }
}
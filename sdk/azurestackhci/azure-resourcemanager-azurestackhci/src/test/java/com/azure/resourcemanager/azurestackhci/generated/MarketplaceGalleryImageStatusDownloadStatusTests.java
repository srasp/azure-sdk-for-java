// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.MarketplaceGalleryImageStatusDownloadStatus;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceGalleryImageStatusDownloadStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceGalleryImageStatusDownloadStatus model =
            BinaryData
                .fromString("{\"downloadSizeInMB\":4225896230813201107}")
                .toObject(MarketplaceGalleryImageStatusDownloadStatus.class);
        Assertions.assertEquals(4225896230813201107L, model.downloadSizeInMB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceGalleryImageStatusDownloadStatus model =
            new MarketplaceGalleryImageStatusDownloadStatus().withDownloadSizeInMB(4225896230813201107L);
        model = BinaryData.fromObject(model).toObject(MarketplaceGalleryImageStatusDownloadStatus.class);
        Assertions.assertEquals(4225896230813201107L, model.downloadSizeInMB());
    }
}
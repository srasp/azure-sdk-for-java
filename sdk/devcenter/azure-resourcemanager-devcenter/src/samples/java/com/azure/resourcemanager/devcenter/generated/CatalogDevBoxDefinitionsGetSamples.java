// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for CatalogDevBoxDefinitions Get. */
public final class CatalogDevBoxDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2023-10-01-preview/examples/CatalogDevBoxDefinitions_Get.json
     */
    /**
     * Sample code: CatalogDevBoxDefinitions_Get.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void catalogDevBoxDefinitionsGet(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .catalogDevBoxDefinitions()
            .getWithResponse("rg1", "Contoso", "CentralCatalog", "WebDevBox", com.azure.core.util.Context.NONE);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for PrivateLinkResources ListByHostPool. */
public final class PrivateLinkResourcesListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2023-09-05/examples/PrivateLinkResources_ListByHostPool.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByHostPool.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateLinkResourcesListByHostPool(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .privateLinkResources()
            .listByHostPool("resourceGroup1", "hostPool1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
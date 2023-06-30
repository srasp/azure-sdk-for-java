// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for VirtualHardDisksOperation GetByResourceGroup. */
public final class VirtualHardDisksOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/GetVirtualHardDisk.json
     */
    /**
     * Sample code: GetVirtualHardDisk.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void getVirtualHardDisk(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .virtualHardDisksOperations()
            .getByResourceGroupWithResponse("test-rg", "test-vhd", com.azure.core.util.Context.NONE);
    }
}
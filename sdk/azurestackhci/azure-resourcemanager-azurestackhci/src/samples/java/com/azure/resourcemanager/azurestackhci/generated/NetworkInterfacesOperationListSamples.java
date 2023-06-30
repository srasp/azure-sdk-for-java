// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for NetworkInterfacesOperation List. */
public final class NetworkInterfacesOperationListSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/ListNetworkInterfaceBySubscription.json
     */
    /**
     * Sample code: ListNetworkInterfaceBySubscription.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void listNetworkInterfaceBySubscription(
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.networkInterfacesOperations().list(com.azure.core.util.Context.NONE);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for VirtualMachineInstances Start. */
public final class VirtualMachineInstancesStartSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/StartVirtualMachineInstance.json
     */
    /**
     * Sample code: StartVirtualMachine.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void startVirtualMachine(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .virtualMachineInstances()
            .start(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/Microsoft.HybridCompute/machines/DemoVM/providers/Microsoft.AzureStackHCI/virtualMachineInstances/default",
                com.azure.core.util.Context.NONE);
    }
}
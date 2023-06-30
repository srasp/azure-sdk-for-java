// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

/** Samples for AzureBareMetalStorageInstances GetByResourceGroup. */
public final class AzureBareMetalStorageInstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/baremetalinfrastructure/resource-manager/Microsoft.BareMetalInfrastructure/preview/2023-08-04-preview/examples/AzureBareMetalStorageInstances_Get.json
     */
    /**
     * Sample code: Get an AzureBareMetalStorage instance.
     *
     * @param manager Entry point to BareMetalInfrastructureManager.
     */
    public static void getAnAzureBareMetalStorageInstance(
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager) {
        manager
            .azureBareMetalStorageInstances()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myAzureBareMetalStorageInstance", com.azure.core.util.Context.NONE);
    }
}
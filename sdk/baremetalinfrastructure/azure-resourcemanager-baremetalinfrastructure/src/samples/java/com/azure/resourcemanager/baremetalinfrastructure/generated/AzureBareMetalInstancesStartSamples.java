// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

/** Samples for AzureBareMetalInstances Start. */
public final class AzureBareMetalInstancesStartSamples {
    /*
     * x-ms-original-file: specification/baremetalinfrastructure/resource-manager/Microsoft.BareMetalInfrastructure/preview/2023-08-04-preview/examples/AzureBareMetalInstances_Start.json
     */
    /**
     * Sample code: Start an Azure Bare Metal instance.
     *
     * @param manager Entry point to BareMetalInfrastructureManager.
     */
    public static void startAnAzureBareMetalInstance(
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager) {
        manager.azureBareMetalInstances().start("myResourceGroup", "myABMInstance", com.azure.core.util.Context.NONE);
    }
}
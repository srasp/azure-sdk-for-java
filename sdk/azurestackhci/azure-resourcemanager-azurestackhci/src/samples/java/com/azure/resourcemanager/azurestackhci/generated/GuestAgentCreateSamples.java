// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.resourcemanager.azurestackhci.fluent.models.GuestAgentInner;
import com.azure.resourcemanager.azurestackhci.models.GuestCredential;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningAction;

/** Samples for GuestAgent Create. */
public final class GuestAgentCreateSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/CreateGuestAgent.json
     */
    /**
     * Sample code: CreateGuestAgent.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createGuestAgent(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .guestAgents()
            .create(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/Microsoft.HybridCompute/machines/DemoVM",
                new GuestAgentInner()
                    .withCredentials(
                        new GuestCredential().withUsername("tempuser").withPassword("fakeTokenPlaceholder"))
                    .withProvisioningAction(ProvisioningAction.INSTALL),
                com.azure.core.util.Context.NONE);
    }
}
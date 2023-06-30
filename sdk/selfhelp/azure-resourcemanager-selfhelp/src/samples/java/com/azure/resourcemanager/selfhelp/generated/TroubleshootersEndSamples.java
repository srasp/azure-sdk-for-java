// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

/** Samples for Troubleshooters End. */
public final class TroubleshootersEndSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/preview/2023-09-01-preview/examples/Troubleshooter_End.json
     */
    /**
     * Sample code: Troubleshooters_End.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void troubleshootersEnd(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .troubleshooters()
            .endWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1",
                com.azure.core.util.Context.NONE);
    }
}
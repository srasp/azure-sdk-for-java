// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for SandboxCustomImages ListByCluster. */
public final class SandboxCustomImagesListByClusterSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2023-08-15/examples/KustoSandboxCustomImagesList.json
     */
    /**
     * Sample code: KustoSandboxCustomImagesListByCluster.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoSandboxCustomImagesListByCluster(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.sandboxCustomImages().listByCluster("kustorptest", "kustoCluster", com.azure.core.util.Context.NONE);
    }
}
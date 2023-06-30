// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/** Samples for Workflow Get. */
public final class WorkflowGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Workflow_Get.json
     */
    /**
     * Sample code: Workflow_Get.
     *
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void workflowGet(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager
            .workflows()
            .getWithResponse("rgrecoveryservicesdatareplication", "4", "ZGH4y", com.azure.core.util.Context.NONE);
    }
}
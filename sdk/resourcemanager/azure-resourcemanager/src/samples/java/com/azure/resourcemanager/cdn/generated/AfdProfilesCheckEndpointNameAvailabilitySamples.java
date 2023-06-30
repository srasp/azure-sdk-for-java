// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.cdn.models.CheckEndpointNameAvailabilityInput;
import com.azure.resourcemanager.cdn.models.ResourceType;

/** Samples for AfdProfiles CheckEndpointNameAvailability. */
public final class AfdProfilesCheckEndpointNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/AFDProfiles_CheckEndpointNameAvailability.json
     */
    /**
     * Sample code: CheckEndpointNameAvailability.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkEndpointNameAvailability(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getAfdProfiles()
            .checkEndpointNameAvailabilityWithResponse(
                "myResourceGroup",
                "profile1",
                new CheckEndpointNameAvailabilityInput()
                    .withName("sampleName")
                    .withType(ResourceType.MICROSOFT_CDN_PROFILES_AFD_ENDPOINTS)
                    .withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope.TENANT_REUSE),
                com.azure.core.util.Context.NONE);
    }
}
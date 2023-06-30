// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.azurestackhci.fluent.models.GuestAgentInner;
import com.azure.resourcemanager.azurestackhci.models.GuestAgent;
import com.azure.resourcemanager.azurestackhci.models.GuestCredential;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningAction;

public final class GuestAgentImpl implements GuestAgent {
    private GuestAgentInner innerObject;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    GuestAgentImpl(
        GuestAgentInner innerObject, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public GuestCredential credentials() {
        return this.innerModel().credentials();
    }

    public ProvisioningAction provisioningAction() {
        return this.innerModel().provisioningAction();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public GuestAgentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }
}
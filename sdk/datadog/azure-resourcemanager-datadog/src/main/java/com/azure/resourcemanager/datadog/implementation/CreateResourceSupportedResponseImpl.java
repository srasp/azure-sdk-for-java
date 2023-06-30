// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.resourcemanager.datadog.fluent.models.CreateResourceSupportedResponseInner;
import com.azure.resourcemanager.datadog.models.CreateResourceSupportedProperties;
import com.azure.resourcemanager.datadog.models.CreateResourceSupportedResponse;

public final class CreateResourceSupportedResponseImpl implements CreateResourceSupportedResponse {
    private CreateResourceSupportedResponseInner innerObject;

    private final com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager;

    CreateResourceSupportedResponseImpl(
        CreateResourceSupportedResponseInner innerObject,
        com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CreateResourceSupportedProperties properties() {
        return this.innerModel().properties();
    }

    public CreateResourceSupportedResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }
}
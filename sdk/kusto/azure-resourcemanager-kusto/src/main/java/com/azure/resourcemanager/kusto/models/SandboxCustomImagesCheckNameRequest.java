// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result returned from a sandboxCustomImage check name availability request. */
@Fluent
public final class SandboxCustomImagesCheckNameRequest {
    /*
     * Sandbox custom image resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, for instance Microsoft.Kusto/clusters/sandboxCustomImages.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "Microsoft.Kusto/clusters/sandboxCustomImages";

    /** Creates an instance of SandboxCustomImagesCheckNameRequest class. */
    public SandboxCustomImagesCheckNameRequest() {
        type = "Microsoft.Kusto/clusters/sandboxCustomImages";
    }

    /**
     * Get the name property: Sandbox custom image resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Sandbox custom image resource name.
     *
     * @param name the name value to set.
     * @return the SandboxCustomImagesCheckNameRequest object itself.
     */
    public SandboxCustomImagesCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, for instance Microsoft.Kusto/clusters/sandboxCustomImages.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, for instance Microsoft.Kusto/clusters/sandboxCustomImages.
     *
     * @param type the type value to set.
     * @return the SandboxCustomImagesCheckNameRequest object itself.
     */
    public SandboxCustomImagesCheckNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model SandboxCustomImagesCheckNameRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SandboxCustomImagesCheckNameRequest.class);
}
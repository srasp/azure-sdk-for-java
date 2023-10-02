// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The folder that this CDC is in. If not specified, CDC will appear at the root level. */
@Fluent
public final class ChangeDataCaptureFolder {
    /*
     * The name of the folder that this CDC is in.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of ChangeDataCaptureFolder class. */
    public ChangeDataCaptureFolder() {
    }

    /**
     * Get the name property: The name of the folder that this CDC is in.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the folder that this CDC is in.
     *
     * @param name the name value to set.
     * @return the ChangeDataCaptureFolder object itself.
     */
    public ChangeDataCaptureFolder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
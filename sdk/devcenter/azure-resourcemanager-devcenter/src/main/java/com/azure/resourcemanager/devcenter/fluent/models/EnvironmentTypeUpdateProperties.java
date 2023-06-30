// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an environment type. These properties can be updated after the resource has been created. */
@Fluent
public class EnvironmentTypeUpdateProperties {
    /*
     * The display name of the environment type.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /** Creates an instance of EnvironmentTypeUpdateProperties class. */
    public EnvironmentTypeUpdateProperties() {
    }

    /**
     * Get the displayName property: The display name of the environment type.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the environment type.
     *
     * @param displayName the displayName value to set.
     * @return the EnvironmentTypeUpdateProperties object itself.
     */
    public EnvironmentTypeUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
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
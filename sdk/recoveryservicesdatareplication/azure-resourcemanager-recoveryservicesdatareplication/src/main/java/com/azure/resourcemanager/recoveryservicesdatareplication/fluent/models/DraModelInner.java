// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.DraModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.DraModelSystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dra model. */
@Fluent
public final class DraModelInner extends ProxyResource {
    /*
     * Dra model properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DraModelProperties properties;

    /*
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private DraModelSystemData systemData;

    /** Creates an instance of DraModelInner class. */
    public DraModelInner() {
    }

    /**
     * Get the properties property: Dra model properties.
     *
     * @return the properties value.
     */
    public DraModelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Dra model properties.
     *
     * @param properties the properties value to set.
     * @return the DraModelInner object itself.
     */
    public DraModelInner withProperties(DraModelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    public DraModelSystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model DraModelInner"));
        } else {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DraModelInner.class);
}
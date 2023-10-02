// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerservice.models.MeshRevisionProfileProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Mesh revision profile for a mesh. */
@Fluent
public final class MeshRevisionProfileInner extends ProxyResource {
    /*
     * Mesh revision profile properties for a mesh
     */
    @JsonProperty(value = "properties")
    private MeshRevisionProfileProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of MeshRevisionProfileInner class. */
    public MeshRevisionProfileInner() {
    }

    /**
     * Get the properties property: Mesh revision profile properties for a mesh.
     *
     * @return the properties value.
     */
    public MeshRevisionProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Mesh revision profile properties for a mesh.
     *
     * @param properties the properties value to set.
     * @return the MeshRevisionProfileInner object itself.
     */
    public MeshRevisionProfileInner withProperties(MeshRevisionProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
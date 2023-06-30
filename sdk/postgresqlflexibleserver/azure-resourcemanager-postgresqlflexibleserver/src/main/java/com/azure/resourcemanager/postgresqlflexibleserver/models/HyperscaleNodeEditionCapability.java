// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Hyperscale node edition capabilities. */
@Immutable
public final class HyperscaleNodeEditionCapability {
    /*
     * Server edition name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of editions supported by this server edition.
     */
    @JsonProperty(value = "supportedStorageEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageEditionCapability> supportedStorageEditions;

    /*
     * The list of server versions supported by this server edition.
     */
    @JsonProperty(value = "supportedServerVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerVersionCapability> supportedServerVersions;

    /*
     * The list of Node Types supported by this server edition.
     */
    @JsonProperty(value = "supportedNodeTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<NodeTypeCapability> supportedNodeTypes;

    /*
     * The status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of HyperscaleNodeEditionCapability class. */
    public HyperscaleNodeEditionCapability() {
    }

    /**
     * Get the name property: Server edition name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedStorageEditions property: The list of editions supported by this server edition.
     *
     * @return the supportedStorageEditions value.
     */
    public List<StorageEditionCapability> supportedStorageEditions() {
        return this.supportedStorageEditions;
    }

    /**
     * Get the supportedServerVersions property: The list of server versions supported by this server edition.
     *
     * @return the supportedServerVersions value.
     */
    public List<ServerVersionCapability> supportedServerVersions() {
        return this.supportedServerVersions;
    }

    /**
     * Get the supportedNodeTypes property: The list of Node Types supported by this server edition.
     *
     * @return the supportedNodeTypes value.
     */
    public List<NodeTypeCapability> supportedNodeTypes() {
        return this.supportedNodeTypes;
    }

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedStorageEditions() != null) {
            supportedStorageEditions().forEach(e -> e.validate());
        }
        if (supportedServerVersions() != null) {
            supportedServerVersions().forEach(e -> e.validate());
        }
        if (supportedNodeTypes() != null) {
            supportedNodeTypes().forEach(e -> e.validate());
        }
    }
}
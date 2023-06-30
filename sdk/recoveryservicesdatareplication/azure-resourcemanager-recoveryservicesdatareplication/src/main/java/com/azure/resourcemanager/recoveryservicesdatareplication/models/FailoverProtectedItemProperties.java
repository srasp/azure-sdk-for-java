// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Failover properties of the protected item. */
@Immutable
public final class FailoverProtectedItemProperties {
    /*
     * Gets or sets the protected item name.
     */
    @JsonProperty(value = "protectedItemName", access = JsonProperty.Access.WRITE_ONLY)
    private String protectedItemName;

    /*
     * Gets or sets the VM name.
     */
    @JsonProperty(value = "vmName", access = JsonProperty.Access.WRITE_ONLY)
    private String vmName;

    /*
     * Gets or sets the test VM name.
     */
    @JsonProperty(value = "testVmName", access = JsonProperty.Access.WRITE_ONLY)
    private String testVmName;

    /*
     * Gets or sets the recovery point Id.
     */
    @JsonProperty(value = "recoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String recoveryPointId;

    /*
     * Gets or sets the recovery point time.
     */
    @JsonProperty(value = "recoveryPointTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime recoveryPointTime;

    /*
     * Gets or sets the network name.
     */
    @JsonProperty(value = "networkName", access = JsonProperty.Access.WRITE_ONLY)
    private String networkName;

    /*
     * Gets or sets the network subnet.
     */
    @JsonProperty(value = "subnet", access = JsonProperty.Access.WRITE_ONLY)
    private String subnet;

    /** Creates an instance of FailoverProtectedItemProperties class. */
    public FailoverProtectedItemProperties() {
    }

    /**
     * Get the protectedItemName property: Gets or sets the protected item name.
     *
     * @return the protectedItemName value.
     */
    public String protectedItemName() {
        return this.protectedItemName;
    }

    /**
     * Get the vmName property: Gets or sets the VM name.
     *
     * @return the vmName value.
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Get the testVmName property: Gets or sets the test VM name.
     *
     * @return the testVmName value.
     */
    public String testVmName() {
        return this.testVmName;
    }

    /**
     * Get the recoveryPointId property: Gets or sets the recovery point Id.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Get the recoveryPointTime property: Gets or sets the recovery point time.
     *
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Get the networkName property: Gets or sets the network name.
     *
     * @return the networkName value.
     */
    public String networkName() {
        return this.networkName;
    }

    /**
     * Get the subnet property: Gets or sets the network subnet.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
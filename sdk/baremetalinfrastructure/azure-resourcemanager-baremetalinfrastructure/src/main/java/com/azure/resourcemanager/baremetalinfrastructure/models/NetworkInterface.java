// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the network interfaces of a bare metal resource. */
@Fluent
public final class NetworkInterface {
    /*
     * Specifies the IP address of the network interface.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /** Creates an instance of NetworkInterface class. */
    public NetworkInterface() {
    }

    /**
     * Get the ipAddress property: Specifies the IP address of the network interface.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: Specifies the IP address of the network interface.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
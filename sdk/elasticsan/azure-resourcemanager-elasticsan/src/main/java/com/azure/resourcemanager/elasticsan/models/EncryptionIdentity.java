// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption identity for the volume group. */
@Fluent
public final class EncryptionIdentity {
    /*
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the volume
     * group.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String encryptionUserAssignedIdentity;

    /** Creates an instance of EncryptionIdentity class. */
    public EncryptionIdentity() {
    }

    /**
     * Get the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the volume group.
     *
     * @return the encryptionUserAssignedIdentity value.
     */
    public String encryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity;
    }

    /**
     * Set the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the volume group.
     *
     * @param encryptionUserAssignedIdentity the encryptionUserAssignedIdentity value to set.
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withEncryptionUserAssignedIdentity(String encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
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
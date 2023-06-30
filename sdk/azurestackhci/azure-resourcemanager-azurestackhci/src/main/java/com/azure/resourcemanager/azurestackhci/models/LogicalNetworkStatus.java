// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The observed state of logical networks. */
@Fluent
public final class LogicalNetworkStatus {
    /*
     * LogicalNetwork provisioning error code
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Descriptive error message
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * The provisioningStatus property.
     */
    @JsonProperty(value = "provisioningStatus")
    private LogicalNetworkStatusProvisioningStatus provisioningStatus;

    /** Creates an instance of LogicalNetworkStatus class. */
    public LogicalNetworkStatus() {
    }

    /**
     * Get the errorCode property: LogicalNetwork provisioning error code.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: LogicalNetwork provisioning error code.
     *
     * @param errorCode the errorCode value to set.
     * @return the LogicalNetworkStatus object itself.
     */
    public LogicalNetworkStatus withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Descriptive error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Descriptive error message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the LogicalNetworkStatus object itself.
     */
    public LogicalNetworkStatus withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the provisioningStatus property: The provisioningStatus property.
     *
     * @return the provisioningStatus value.
     */
    public LogicalNetworkStatusProvisioningStatus provisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Set the provisioningStatus property: The provisioningStatus property.
     *
     * @param provisioningStatus the provisioningStatus value to set.
     * @return the LogicalNetworkStatus object itself.
     */
    public LogicalNetworkStatus withProvisioningStatus(LogicalNetworkStatusProvisioningStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provisioningStatus() != null) {
            provisioningStatus().validate();
        }
    }
}
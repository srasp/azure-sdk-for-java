// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Failover workflow model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FailoverWorkflowDetails")
@Immutable
public final class FailoverWorkflowModelCustomProperties extends WorkflowModelCustomProperties {
    /*
     * Gets or sets the failed over protected item details.
     */
    @JsonProperty(value = "protectedItemDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<FailoverProtectedItemProperties> protectedItemDetails;

    /** Creates an instance of FailoverWorkflowModelCustomProperties class. */
    public FailoverWorkflowModelCustomProperties() {
    }

    /**
     * Get the protectedItemDetails property: Gets or sets the failed over protected item details.
     *
     * @return the protectedItemDetails value.
     */
    public List<FailoverProtectedItemProperties> protectedItemDetails() {
        return this.protectedItemDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (protectedItemDetails() != null) {
            protectedItemDetails().forEach(e -> e.validate());
        }
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.OperationStatusInner;

/** An immutable client-side representation of OperationStatus. */
public interface OperationStatus {
    /**
     * Gets the name property: Unique Operation Status Identifier.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: Status of the operation.
     *
     * @return the status value.
     */
    AsyncOperationStatus status();

    /**
     * Gets the startTime property: Start Time when the operation was initially executed.
     *
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the error property: An error from the Azure Bare Metal Infrastructure service.
     *
     * @return the error value.
     */
    OperationStatusError error();

    /**
     * Gets the inner com.azure.resourcemanager.baremetalinfrastructure.fluent.models.OperationStatusInner object.
     *
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets or sets the workflow state. */
public final class WorkflowState extends ExpandableStringEnum<WorkflowState> {
    /** Static value Pending for WorkflowState. */
    public static final WorkflowState PENDING = fromString("Pending");

    /** Static value Started for WorkflowState. */
    public static final WorkflowState STARTED = fromString("Started");

    /** Static value Cancelling for WorkflowState. */
    public static final WorkflowState CANCELLING = fromString("Cancelling");

    /** Static value Succeeded for WorkflowState. */
    public static final WorkflowState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for WorkflowState. */
    public static final WorkflowState FAILED = fromString("Failed");

    /** Static value Cancelled for WorkflowState. */
    public static final WorkflowState CANCELLED = fromString("Cancelled");

    /** Static value CompletedWithInformation for WorkflowState. */
    public static final WorkflowState COMPLETED_WITH_INFORMATION = fromString("CompletedWithInformation");

    /** Static value CompletedWithWarnings for WorkflowState. */
    public static final WorkflowState COMPLETED_WITH_WARNINGS = fromString("CompletedWithWarnings");

    /** Static value CompletedWithErrors for WorkflowState. */
    public static final WorkflowState COMPLETED_WITH_ERRORS = fromString("CompletedWithErrors");

    /**
     * Creates a new instance of WorkflowState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WorkflowState() {
    }

    /**
     * Creates or finds a WorkflowState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkflowState.
     */
    @JsonCreator
    public static WorkflowState fromString(String name) {
        return fromString(name, WorkflowState.class);
    }

    /**
     * Gets known WorkflowState values.
     *
     * @return known WorkflowState values.
     */
    public static Collection<WorkflowState> values() {
        return values(WorkflowState.class);
    }
}
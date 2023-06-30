// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current provisioning state of trusted access role binding. */
public final class TrustedAccessRoleBindingProvisioningState
    extends ExpandableStringEnum<TrustedAccessRoleBindingProvisioningState> {
    /** Static value Canceled for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deleting for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState DELETING = fromString("Deleting");

    /** Static value Failed for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Updating for TrustedAccessRoleBindingProvisioningState. */
    public static final TrustedAccessRoleBindingProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of TrustedAccessRoleBindingProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TrustedAccessRoleBindingProvisioningState() {
    }

    /**
     * Creates or finds a TrustedAccessRoleBindingProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrustedAccessRoleBindingProvisioningState.
     */
    @JsonCreator
    public static TrustedAccessRoleBindingProvisioningState fromString(String name) {
        return fromString(name, TrustedAccessRoleBindingProvisioningState.class);
    }

    /**
     * Gets known TrustedAccessRoleBindingProvisioningState values.
     *
     * @return known TrustedAccessRoleBindingProvisioningState values.
     */
    public static Collection<TrustedAccessRoleBindingProvisioningState> values() {
        return values(TrustedAccessRoleBindingProvisioningState.class);
    }
}
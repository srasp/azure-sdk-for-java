// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** IPAllocationMethod - The IP address allocation method. Possible values include: 'Static', 'Dynamic'. */
public final class IpAllocationMethodEnum extends ExpandableStringEnum<IpAllocationMethodEnum> {
    /** Static value Dynamic for IpAllocationMethodEnum. */
    public static final IpAllocationMethodEnum DYNAMIC = fromString("Dynamic");

    /** Static value Static for IpAllocationMethodEnum. */
    public static final IpAllocationMethodEnum STATIC = fromString("Static");

    /**
     * Creates a new instance of IpAllocationMethodEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpAllocationMethodEnum() {
    }

    /**
     * Creates or finds a IpAllocationMethodEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpAllocationMethodEnum.
     */
    @JsonCreator
    public static IpAllocationMethodEnum fromString(String name) {
        return fromString(name, IpAllocationMethodEnum.class);
    }

    /**
     * Gets known IpAllocationMethodEnum values.
     *
     * @return known IpAllocationMethodEnum values.
     */
    public static Collection<IpAllocationMethodEnum> values() {
        return values(IpAllocationMethodEnum.class);
    }
}
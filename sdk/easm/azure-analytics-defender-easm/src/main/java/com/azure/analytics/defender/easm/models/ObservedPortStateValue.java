// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ObservedPortStateValue. */
public final class ObservedPortStateValue extends ExpandableStringEnum<ObservedPortStateValue> {

    /** Static value open for ObservedPortStateValue. */
    @Generated public static final ObservedPortStateValue OPEN = fromString("open");

    /** Static value closed for ObservedPortStateValue. */
    @Generated public static final ObservedPortStateValue CLOSED = fromString("closed");

    /** Static value filtered for ObservedPortStateValue. */
    @Generated public static final ObservedPortStateValue FILTERED = fromString("filtered");

    /**
     * Creates a new instance of ObservedPortStateValue value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ObservedPortStateValue() {}

    /**
     * Creates or finds a ObservedPortStateValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ObservedPortStateValue.
     */
    @Generated
    @JsonCreator
    public static ObservedPortStateValue fromString(String name) {
        return fromString(name, ObservedPortStateValue.class);
    }

    /**
     * Gets known ObservedPortStateValue values.
     *
     * @return known ObservedPortStateValue values.
     */
    @Generated
    public static Collection<ObservedPortStateValue> values() {
        return values(ObservedPortStateValue.class);
    }
}
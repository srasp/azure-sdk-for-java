// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TranscriptionTransportType. */
public final class TranscriptionTransportType extends ExpandableStringEnum<TranscriptionTransportType> {
    /** Static value websocket for TranscriptionTransportType. */
    public static final TranscriptionTransportType WEBSOCKET = fromString("websocket");

    /**
     * Creates or finds a TranscriptionTransportType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TranscriptionTransportType.
     */
    @JsonCreator
    public static TranscriptionTransportType fromString(String name) {
        return fromString(name, TranscriptionTransportType.class);
    }

    /** @return known TranscriptionTransportType values. */
    public static Collection<TranscriptionTransportType> values() {
        return values(TranscriptionTransportType.class);
    }
}
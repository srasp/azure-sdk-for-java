// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.EventModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Event model collection. */
@Fluent
public final class EventModelCollection {
    /*
     * Gets or sets the list of events.
     */
    @JsonProperty(value = "value")
    private List<EventModelInner> value;

    /*
     * Gets or sets the value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of EventModelCollection class. */
    public EventModelCollection() {
    }

    /**
     * Get the value property: Gets or sets the list of events.
     *
     * @return the value value.
     */
    public List<EventModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of events.
     *
     * @param value the value value to set.
     * @return the EventModelCollection object itself.
     */
    public EventModelCollection withValue(List<EventModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the EventModelCollection object itself.
     */
    public EventModelCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
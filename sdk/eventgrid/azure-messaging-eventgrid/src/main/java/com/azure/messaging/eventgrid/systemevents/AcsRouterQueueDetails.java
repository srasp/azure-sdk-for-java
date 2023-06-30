// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Router Queue Details. */
@Fluent
public final class AcsRouterQueueDetails {
    /*
     * Router Queue Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Router Queue Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Router Queue Labels
     */
    @JsonProperty(value = "labels")
    private Map<String, String> labels;

    /** Creates an instance of AcsRouterQueueDetails class. */
    public AcsRouterQueueDetails() {}

    /**
     * Get the id property: Router Queue Id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Router Queue Id.
     *
     * @param id the id value to set.
     * @return the AcsRouterQueueDetails object itself.
     */
    public AcsRouterQueueDetails setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Router Queue Name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Router Queue Name.
     *
     * @param name the name value to set.
     * @return the AcsRouterQueueDetails object itself.
     */
    public AcsRouterQueueDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the labels property: Router Queue Labels.
     *
     * @return the labels value.
     */
    public Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: Router Queue Labels.
     *
     * @param labels the labels value to set.
     * @return the AcsRouterQueueDetails object itself.
     */
    public AcsRouterQueueDetails setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datadog.models.SubscriptionList;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request to update subscriptions needed to be monitored by the Datadog monitor resource. */
@Fluent
public final class MonitoredSubscriptionPropertiesInner {
    /*
     * Name of the monitored subscription resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The id of the monitored subscription resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The type of the monitored subscription resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The request to update subscriptions needed to be monitored by the Datadog monitor resource.
     */
    @JsonProperty(value = "properties")
    private SubscriptionList properties;

    /** Creates an instance of MonitoredSubscriptionPropertiesInner class. */
    public MonitoredSubscriptionPropertiesInner() {
    }

    /**
     * Get the name property: Name of the monitored subscription resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: The id of the monitored subscription resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: The type of the monitored subscription resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: The request to update subscriptions needed to be monitored by the Datadog monitor
     * resource.
     *
     * @return the properties value.
     */
    public SubscriptionList properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The request to update subscriptions needed to be monitored by the Datadog monitor
     * resource.
     *
     * @param properties the properties value to set.
     * @return the MonitoredSubscriptionPropertiesInner object itself.
     */
    public MonitoredSubscriptionPropertiesInner withProperties(SubscriptionList properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerRegistered event. */
@Fluent
public final class AcsRouterWorkerRegisteredEventData {
    /*
     * Router Worker Registered Worker Id
     */
    @JsonProperty(value = "workerId")
    private String workerId;

    /*
     * Router Worker Registered Queue Info
     */
    @JsonProperty(value = "queueAssignments")
    private List<AcsRouterQueueDetails> queueAssignments;

    /*
     * Router Worker Registered Channel Configuration
     */
    @JsonProperty(value = "channelConfigurations")
    private List<AcsRouterChannelConfiguration> channelConfigurations;

    /*
     * Router Worker Register Total Capacity
     */
    @JsonProperty(value = "totalCapacity")
    private Integer totalCapacity;

    /*
     * Router Worker Registered Labels
     */
    @JsonProperty(value = "labels")
    private Map<String, String> labels;

    /*
     * Router Worker Registered Tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /** Creates an instance of AcsRouterWorkerRegisteredEventData class. */
    public AcsRouterWorkerRegisteredEventData() {}

    /**
     * Get the workerId property: Router Worker Registered Worker Id.
     *
     * @return the workerId value.
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: Router Worker Registered Worker Id.
     *
     * @param workerId the workerId value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * Get the queueAssignments property: Router Worker Registered Queue Info.
     *
     * @return the queueAssignments value.
     */
    public List<AcsRouterQueueDetails> getQueueAssignments() {
        return this.queueAssignments;
    }

    /**
     * Set the queueAssignments property: Router Worker Registered Queue Info.
     *
     * @param queueAssignments the queueAssignments value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setQueueAssignments(List<AcsRouterQueueDetails> queueAssignments) {
        this.queueAssignments = queueAssignments;
        return this;
    }

    /**
     * Get the channelConfigurations property: Router Worker Registered Channel Configuration.
     *
     * @return the channelConfigurations value.
     */
    public List<AcsRouterChannelConfiguration> getChannelConfigurations() {
        return this.channelConfigurations;
    }

    /**
     * Set the channelConfigurations property: Router Worker Registered Channel Configuration.
     *
     * @param channelConfigurations the channelConfigurations value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setChannelConfigurations(
            List<AcsRouterChannelConfiguration> channelConfigurations) {
        this.channelConfigurations = channelConfigurations;
        return this;
    }

    /**
     * Get the totalCapacity property: Router Worker Register Total Capacity.
     *
     * @return the totalCapacity value.
     */
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity property: Router Worker Register Total Capacity.
     *
     * @param totalCapacity the totalCapacity value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get the labels property: Router Worker Registered Labels.
     *
     * @return the labels value.
     */
    public Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: Router Worker Registered Labels.
     *
     * @param labels the labels value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: Router Worker Registered Tags.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Router Worker Registered Tags.
     *
     * @param tags the tags value to set.
     * @return the AcsRouterWorkerRegisteredEventData object itself.
     */
    public AcsRouterWorkerRegisteredEventData setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterJobReceived event. */
@Fluent
public final class AcsRouterJobReceivedEventData extends AcsRouterJobEventData {

    /*
     * Router Job Received Job Status
     */
    @JsonProperty(value = "jobStatus")
    private AcsRouterJobStatus jobStatus;

    /*
     * Router Job Classification Policy Id
     */
    @JsonProperty(value = "classificationPolicyId")
    private String classificationPolicyId;

    /*
     * Router Job Priority
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Router Job Received Requested Worker Selectors
     */
    @JsonProperty(value = "requestedWorkerSelectors")
    private List<AcsRouterWorkerSelector> requestedWorkerSelectors;

    /*
     * Router Job Received Scheduled Time in UTC
     */
    @JsonProperty(value = "scheduledOn")
    private OffsetDateTime scheduledOn;

    /*
     * Unavailable For Matching for Router Job Received
     */
    @JsonProperty(value = "unavailableForMatching", required = true)
    private boolean unavailableForMatching;

    /** Creates an instance of AcsRouterJobReceivedEventData class. */
    public AcsRouterJobReceivedEventData() {}

    /**
     * Get the jobStatus property: Router Job Received Job Status.
     *
     * @return the jobStatus value.
     */
    public AcsRouterJobStatus getJobStatus() {
        return this.jobStatus;
    }

    /**
     * Set the jobStatus property: Router Job Received Job Status.
     *
     * @param jobStatus the jobStatus value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setJobStatus(AcsRouterJobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get the classificationPolicyId property: Router Job Classification Policy Id.
     *
     * @return the classificationPolicyId value.
     */
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: Router Job Classification Policy Id.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        return this;
    }

    /**
     * Get the priority property: Router Job Priority.
     *
     * @return the priority value.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Router Job Priority.
     *
     * @param priority the priority value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the requestedWorkerSelectors property: Router Job Received Requested Worker Selectors.
     *
     * @return the requestedWorkerSelectors value.
     */
    public List<AcsRouterWorkerSelector> getRequestedWorkerSelectors() {
        return this.requestedWorkerSelectors;
    }

    /**
     * Set the requestedWorkerSelectors property: Router Job Received Requested Worker Selectors.
     *
     * @param requestedWorkerSelectors the requestedWorkerSelectors value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setRequestedWorkerSelectors(
            List<AcsRouterWorkerSelector> requestedWorkerSelectors) {
        this.requestedWorkerSelectors = requestedWorkerSelectors;
        return this;
    }

    /**
     * Get the scheduledOn property: Router Job Received Scheduled Time in UTC.
     *
     * @return the scheduledOn value.
     */
    public OffsetDateTime getScheduledOn() {
        return this.scheduledOn;
    }

    /**
     * Set the scheduledOn property: Router Job Received Scheduled Time in UTC.
     *
     * @param scheduledOn the scheduledOn value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setScheduledOn(OffsetDateTime scheduledOn) {
        this.scheduledOn = scheduledOn;
        return this;
    }

    /**
     * Get the unavailableForMatching property: Unavailable For Matching for Router Job Received.
     *
     * @return the unavailableForMatching value.
     */
    public Boolean isUnavailableForMatching() {
        return this.unavailableForMatching;
    }

    /**
     * Set the unavailableForMatching property: Unavailable For Matching for Router Job Received.
     *
     * @param unavailableForMatching the unavailableForMatching value to set.
     * @return the AcsRouterJobReceivedEventData object itself.
     */
    public AcsRouterJobReceivedEventData setUnavailableForMatching(Boolean unavailableForMatching) {
        this.unavailableForMatching = unavailableForMatching;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setQueueId(String queueId) {
        super.setQueueId(queueId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setLabels(Map<String, String> labels) {
        super.setLabels(labels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobReceivedEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
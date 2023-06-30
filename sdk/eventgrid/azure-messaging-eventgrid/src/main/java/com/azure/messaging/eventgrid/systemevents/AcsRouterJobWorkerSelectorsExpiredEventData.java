// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterJobWorkerSelectorsExpired event.
 */
@Fluent
public final class AcsRouterJobWorkerSelectorsExpiredEventData extends AcsRouterJobEventData {
    /*
     * Router Job Worker Selectors Expired Requested Worker Selectors
     */
    @JsonProperty(value = "expiredRequestedWorkerSelectors")
    private List<AcsRouterWorkerSelector> expiredRequestedWorkerSelectors;

    /*
     * Router Job Worker Selectors Expired Attached Worker Selectors
     */
    @JsonProperty(value = "expiredAttachedWorkerSelectors")
    private List<AcsRouterWorkerSelector> expiredAttachedWorkerSelectors;

    /** Creates an instance of AcsRouterJobWorkerSelectorsExpiredEventData class. */
    public AcsRouterJobWorkerSelectorsExpiredEventData() {}

    /**
     * Get the expiredRequestedWorkerSelectors property: Router Job Worker Selectors Expired Requested Worker Selectors.
     *
     * @return the expiredRequestedWorkerSelectors value.
     */
    public List<AcsRouterWorkerSelector> getExpiredRequestedWorkerSelectors() {
        return this.expiredRequestedWorkerSelectors;
    }

    /**
     * Set the expiredRequestedWorkerSelectors property: Router Job Worker Selectors Expired Requested Worker Selectors.
     *
     * @param expiredRequestedWorkerSelectors the expiredRequestedWorkerSelectors value to set.
     * @return the AcsRouterJobWorkerSelectorsExpiredEventData object itself.
     */
    public AcsRouterJobWorkerSelectorsExpiredEventData setExpiredRequestedWorkerSelectors(
            List<AcsRouterWorkerSelector> expiredRequestedWorkerSelectors) {
        this.expiredRequestedWorkerSelectors = expiredRequestedWorkerSelectors;
        return this;
    }

    /**
     * Get the expiredAttachedWorkerSelectors property: Router Job Worker Selectors Expired Attached Worker Selectors.
     *
     * @return the expiredAttachedWorkerSelectors value.
     */
    public List<AcsRouterWorkerSelector> getExpiredAttachedWorkerSelectors() {
        return this.expiredAttachedWorkerSelectors;
    }

    /**
     * Set the expiredAttachedWorkerSelectors property: Router Job Worker Selectors Expired Attached Worker Selectors.
     *
     * @param expiredAttachedWorkerSelectors the expiredAttachedWorkerSelectors value to set.
     * @return the AcsRouterJobWorkerSelectorsExpiredEventData object itself.
     */
    public AcsRouterJobWorkerSelectorsExpiredEventData setExpiredAttachedWorkerSelectors(
            List<AcsRouterWorkerSelector> expiredAttachedWorkerSelectors) {
        this.expiredAttachedWorkerSelectors = expiredAttachedWorkerSelectors;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setQueueId(String queueId) {
        super.setQueueId(queueId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setLabels(Map<String, String> labels) {
        super.setLabels(labels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobWorkerSelectorsExpiredEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
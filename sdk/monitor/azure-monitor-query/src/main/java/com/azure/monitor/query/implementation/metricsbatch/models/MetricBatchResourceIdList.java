// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsbatch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The comma separated list of resource IDs to query metrics for. */
@Fluent
public final class MetricBatchResourceIdList {
    /*
     * The list of resource IDs to query metrics for.
     */
    @JsonProperty(value = "resourceids")
    private List<String> resourceids;

    /** Creates an instance of MetricBatchResourceIdList class. */
    public MetricBatchResourceIdList() {}

    /**
     * Get the resourceids property: The list of resource IDs to query metrics for.
     *
     * @return the resourceids value.
     */
    public List<String> getResourceids() {
        return this.resourceids;
    }

    /**
     * Set the resourceids property: The list of resource IDs to query metrics for.
     *
     * @param resourceids the resourceids value to set.
     * @return the MetricBatchResourceIdList object itself.
     */
    public MetricBatchResourceIdList setResourceids(List<String> resourceids) {
        this.resourceids = resourceids;
        return this;
    }
}
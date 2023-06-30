// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Video detail. */
@Fluent
public final class Video extends VideoGroupVideo {
    /*
     * Place holder used in HTML Content replace control with the insight content
     */
    @JsonProperty(value = "replacementKey")
    private String replacementKey;

    /** Creates an instance of Video class. */
    public Video() {
    }

    /**
     * Get the replacementKey property: Place holder used in HTML Content replace control with the insight content.
     *
     * @return the replacementKey value.
     */
    public String replacementKey() {
        return this.replacementKey;
    }

    /**
     * Set the replacementKey property: Place holder used in HTML Content replace control with the insight content.
     *
     * @param replacementKey the replacementKey value to set.
     * @return the Video object itself.
     */
    public Video withReplacementKey(String replacementKey) {
        this.replacementKey = replacementKey;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Video withSrc(String src) {
        super.withSrc(src);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Video withTitle(String title) {
        super.withTitle(title);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
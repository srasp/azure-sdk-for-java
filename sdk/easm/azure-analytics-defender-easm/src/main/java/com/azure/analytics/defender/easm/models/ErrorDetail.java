// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This is the top-level error object whose code matches the x-ms-error-code response header. */
@Immutable
public final class ErrorDetail {

    /*
     * This is one of a server-defined set of error codes.
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * This is a human-readable representation of the error.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /*
     * This is the error target.
     */
    @Generated
    @JsonProperty(value = "target")
    private String target;

    /*
     * This is an array of details about specific errors that led to this reported error.
     */
    @Generated
    @JsonProperty(value = "details")
    private List<ErrorDetail> details;

    /*
     * This is an object containing more specific information than the current object about the error.
     */
    @Generated
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Creates an instance of ErrorDetail class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    @JsonCreator
    private ErrorDetail(@JsonProperty(value = "code") String code, @JsonProperty(value = "message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: This is one of a server-defined set of error codes.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: This is a human-readable representation of the error.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: This is the error target.
     *
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: This is an array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    @Generated
    public List<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Get the innererror property: This is an object containing more specific information than the current object about
     * the error.
     *
     * @return the innererror value.
     */
    @Generated
    public InnerError getInnererror() {
        return this.innererror;
    }
}
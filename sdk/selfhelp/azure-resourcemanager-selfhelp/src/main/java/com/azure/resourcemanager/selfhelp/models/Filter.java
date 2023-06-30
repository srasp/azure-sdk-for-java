// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Filter criterion. */
@Fluent
public final class Filter {
    /*
     * Filter name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Filter values
     */
    @JsonProperty(value = "values")
    private String values;

    /*
     * Filter operator
     */
    @JsonProperty(value = "operator")
    private String operator;

    /** Creates an instance of Filter class. */
    public Filter() {
    }

    /**
     * Get the name property: Filter name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Filter name.
     *
     * @param name the name value to set.
     * @return the Filter object itself.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the values property: Filter values.
     *
     * @return the values value.
     */
    public String values() {
        return this.values;
    }

    /**
     * Set the values property: Filter values.
     *
     * @param values the values value to set.
     * @return the Filter object itself.
     */
    public Filter withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * Get the operator property: Filter operator.
     *
     * @return the operator value.
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Filter operator.
     *
     * @param operator the operator value to set.
     * @return the Filter object itself.
     */
    public Filter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
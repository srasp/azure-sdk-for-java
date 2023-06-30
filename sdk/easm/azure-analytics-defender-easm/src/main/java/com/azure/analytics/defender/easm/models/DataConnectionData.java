// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The DataConnectionData model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = DataConnectionData.class)
@JsonTypeName("DataConnectionData")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "logAnalytics", value = LogAnalyticsDataConnectionData.class),
    @JsonSubTypes.Type(name = "azureDataExplorer", value = AzureDataExplorerDataConnectionData.class)
})
@Fluent
public class DataConnectionData {

    /*
     * The name of data connection
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of data the data connection will transfer.
     */
    @Generated
    @JsonProperty(value = "content")
    private DataConnectionContent content;

    /*
     * The rate at which the data connection will receive updates.
     */
    @Generated
    @JsonProperty(value = "frequency")
    private DataConnectionFrequency frequency;

    /*
     * The day to update the data connection on. (1-7 for weekly, 1-31 for monthly)
     */
    @Generated
    @JsonProperty(value = "frequencyOffset")
    private Integer frequencyOffset;

    /** Creates an instance of DataConnectionData class. */
    @Generated
    public DataConnectionData() {}

    /**
     * Get the name property: The name of data connection.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of data connection.
     *
     * @param name the name value to set.
     * @return the DataConnectionData object itself.
     */
    @Generated
    public DataConnectionData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the content property: The type of data the data connection will transfer.
     *
     * @return the content value.
     */
    @Generated
    public DataConnectionContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: The type of data the data connection will transfer.
     *
     * @param content the content value to set.
     * @return the DataConnectionData object itself.
     */
    @Generated
    public DataConnectionData setContent(DataConnectionContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get the frequency property: The rate at which the data connection will receive updates.
     *
     * @return the frequency value.
     */
    @Generated
    public DataConnectionFrequency getFrequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: The rate at which the data connection will receive updates.
     *
     * @param frequency the frequency value to set.
     * @return the DataConnectionData object itself.
     */
    @Generated
    public DataConnectionData setFrequency(DataConnectionFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the frequencyOffset property: The day to update the data connection on. (1-7 for weekly, 1-31 for monthly).
     *
     * @return the frequencyOffset value.
     */
    @Generated
    public Integer getFrequencyOffset() {
        return this.frequencyOffset;
    }

    /**
     * Set the frequencyOffset property: The day to update the data connection on. (1-7 for weekly, 1-31 for monthly).
     *
     * @param frequencyOffset the frequencyOffset value to set.
     * @return the DataConnectionData object itself.
     */
    @Generated
    public DataConnectionData setFrequencyOffset(Integer frequencyOffset) {
        this.frequencyOffset = frequencyOffset;
        return this;
    }
}
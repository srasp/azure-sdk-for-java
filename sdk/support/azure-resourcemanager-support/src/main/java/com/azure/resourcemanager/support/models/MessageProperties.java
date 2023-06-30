// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes the properties of a Message Details resource. */
@Fluent
public final class MessageProperties {
    /*
     * Content type.
     */
    @JsonProperty(value = "contentType", access = JsonProperty.Access.WRITE_ONLY)
    private TranscriptContentType contentType;

    /*
     * Direction of communication.
     */
    @JsonProperty(value = "communicationDirection", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationDirection communicationDirection;

    /*
     * Name of the sender.
     */
    @JsonProperty(value = "sender")
    private String sender;

    /*
     * Body of the communication.
     */
    @JsonProperty(value = "body", required = true)
    private String body;

    /*
     * Time in UTC (ISO 8601 format) when the communication was created.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /** Creates an instance of MessageProperties class. */
    public MessageProperties() {
    }

    /**
     * Get the contentType property: Content type.
     *
     * @return the contentType value.
     */
    public TranscriptContentType contentType() {
        return this.contentType;
    }

    /**
     * Get the communicationDirection property: Direction of communication.
     *
     * @return the communicationDirection value.
     */
    public CommunicationDirection communicationDirection() {
        return this.communicationDirection;
    }

    /**
     * Get the sender property: Name of the sender.
     *
     * @return the sender value.
     */
    public String sender() {
        return this.sender;
    }

    /**
     * Set the sender property: Name of the sender.
     *
     * @param sender the sender value to set.
     * @return the MessageProperties object itself.
     */
    public MessageProperties withSender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get the body property: Body of the communication.
     *
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Body of the communication.
     *
     * @param body the body value to set.
     * @return the MessageProperties object itself.
     */
    public MessageProperties withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get the createdDate property: Time in UTC (ISO 8601 format) when the communication was created.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (body() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property body in model MessageProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MessageProperties.class);
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsInner;

/**
 * An instance of this class provides access to all the operations defined in
 * SupportTicketChatTranscriptsNoSubscriptionsClient.
 */
public interface SupportTicketChatTranscriptsNoSubscriptionsClient {
    /**
     * Lists all chat transcripts for a support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Chat Transcripts resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChatTranscriptDetailsInner> list(String supportTicketName);

    /**
     * Lists all chat transcripts for a support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Chat Transcripts resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChatTranscriptDetailsInner> list(String supportTicketName, Context context);
}
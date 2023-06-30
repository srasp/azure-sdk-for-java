// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.support.fluent.ChatTranscriptsNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ChatTranscriptsNoSubscriptionsClient. */
public final class ChatTranscriptsNoSubscriptionsClientImpl implements ChatTranscriptsNoSubscriptionsClient {
    /** The proxy service used to perform REST calls. */
    private final ChatTranscriptsNoSubscriptionsService service;

    /** The service client containing this operation class. */
    private final MicrosoftSupportImpl client;

    /**
     * Initializes an instance of ChatTranscriptsNoSubscriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ChatTranscriptsNoSubscriptionsClientImpl(MicrosoftSupportImpl client) {
        this.service =
            RestProxy
                .create(
                    ChatTranscriptsNoSubscriptionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftSupportChatTranscriptsNoSubscriptions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftSupportChat")
    public interface ChatTranscriptsNoSubscriptionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Support/supportTickets/{supportTicketName}/chatTranscripts/{chatTranscriptName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ChatTranscriptDetailsInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("supportTicketName") String supportTicketName,
            @PathParam("chatTranscriptName") String chatTranscriptName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns chatTranscript details for a no subscription support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ChatTranscriptDetailsInner>> getWithResponseAsync(
        String supportTicketName, String chatTranscriptName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (supportTicketName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter supportTicketName is required and cannot be null."));
        }
        if (chatTranscriptName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter chatTranscriptName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            supportTicketName,
                            chatTranscriptName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns chatTranscript details for a no subscription support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ChatTranscriptDetailsInner>> getWithResponseAsync(
        String supportTicketName, String chatTranscriptName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (supportTicketName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter supportTicketName is required and cannot be null."));
        }
        if (chatTranscriptName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter chatTranscriptName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                supportTicketName,
                chatTranscriptName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Returns chatTranscript details for a no subscription support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ChatTranscriptDetailsInner> getAsync(String supportTicketName, String chatTranscriptName) {
        return getWithResponseAsync(supportTicketName, chatTranscriptName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns chatTranscript details for a no subscription support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChatTranscriptDetailsInner> getWithResponse(
        String supportTicketName, String chatTranscriptName, Context context) {
        return getWithResponseAsync(supportTicketName, chatTranscriptName, context).block();
    }

    /**
     * Returns chatTranscript details for a no subscription support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChatTranscriptDetailsInner get(String supportTicketName, String chatTranscriptName) {
        return getWithResponse(supportTicketName, chatTranscriptName, Context.NONE).getValue();
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Workflows. */
public final class WorkflowsImpl {
    /** The proxy service used to perform REST calls. */
    private final WorkflowsService service;

    /** The service client containing this operation class. */
    private final PurviewWorkflowClientImpl client;

    /**
     * Initializes an instance of WorkflowsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowsImpl(PurviewWorkflowClientImpl client) {
        this.service =
                RestProxy.create(WorkflowsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewWorkflowWorkflows to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}/workflow")
    @ServiceInterface(name = "PurviewWorkflowWorkf")
    public interface WorkflowsService {
        @Get("/workflows")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/workflows")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listSync(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listNextSync(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * List all workflows.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listSinglePageAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getEndpoint(),
                                        this.client.getServiceVersion().getVersion(),
                                        accept,
                                        requestOptions,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * List all workflows.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
                requestOptions != null && requestOptions.getContext() != null
                        ? requestOptions.getContext()
                        : Context.NONE);
        return new PagedFlux<>(
                () -> listSinglePageAsync(requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, requestOptionsForNextPage));
    }

    /**
     * List all workflows.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listSinglePage(RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res =
                service.listSync(
                        this.client.getEndpoint(),
                        this.client.getServiceVersion().getVersion(),
                        accept,
                        requestOptions,
                        Context.NONE);
        return new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                getValues(res.getValue(), "value"),
                getNextLink(res.getValue(), "nextLink"),
                null);
    }

    /**
     * List all workflows.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
                requestOptions != null && requestOptions.getContext() != null
                        ? requestOptions.getContext()
                        : Context.NONE);
        return new PagedIterable<>(
                () -> listSinglePage(requestOptions),
                nextLink -> listNextSinglePage(nextLink, requestOptionsForNextPage));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listNextSinglePageAsync(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.listNext(nextLink, this.client.getEndpoint(), accept, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     triggers (Required): [
     *          (Required){
     *             type: String(when_term_creation_is_requested/when_term_deletion_is_requested/when_term_update_is_requested/when_terms_import_is_requested/when_data_access_grant_is_requested/when_asset_update_is_requested) (Required)
     *             underGlossaryHierarchy: String (Optional)
     *             underCollection: String (Optional)
     *             underGlossary: String (Optional)
     *         }
     *     ]
     *     createdTime: OffsetDateTime (Optional)
     *     createdBy: String (Optional)
     *     lastUpdateTime: OffsetDateTime (Optional)
     *     updatedBy: String (Optional)
     *     name: String (Required)
     *     isEnabled: boolean (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the workflow list along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listNextSinglePage(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res =
                service.listNextSync(nextLink, this.client.getEndpoint(), accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                getValues(res.getValue(), "value"),
                getNextLink(res.getValue(), "nextLink"),
                null);
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
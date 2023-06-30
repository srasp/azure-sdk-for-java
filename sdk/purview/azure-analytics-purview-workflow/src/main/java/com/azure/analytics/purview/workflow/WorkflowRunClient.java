// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.analytics.purview.workflow.implementation.WorkflowRunsOperationsImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewWorkflowClient type. */
@ServiceClient(builder = WorkflowRunClientBuilder.class)
public final class WorkflowRunClient {
    @Generated private final WorkflowRunsOperationsImpl serviceClient;

    /**
     * Initializes an instance of WorkflowRunClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    WorkflowRunClient(WorkflowRunsOperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a workflow run.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     workflowId: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     requestor: String (Optional)
     *     userRequestId: String (Optional)
     *     runPayload (Optional): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *         payload: Object (Required)
     *     }
     *     status: String(NotStarted/InProgress/Failed/Completed/Canceling/CancellationFailed/Canceled) (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     cancelTime: OffsetDateTime (Optional)
     *     cancelComment: String (Optional)
     *     actionDag: Object (Required)
     *     detail (Required): {
     *         runInput: Object (Required)
     *         actions: Object (Required)
     *     }
     * }
     * }</pre>
     *
     * @param workflowRunId The workflow run id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a workflow run along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String workflowRunId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(workflowRunId, requestOptions);
    }

    /**
     * Cancel a workflow run.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     comment: String (Optional)
     * }
     * }</pre>
     *
     * @param workflowRunId The workflow run id.
     * @param runCancelReply Reply of canceling a workflow run.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelWithResponse(
            String workflowRunId, BinaryData runCancelReply, RequestOptions requestOptions) {
        return this.serviceClient.cancelWithResponse(workflowRunId, runCancelReply, requestOptions);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.DraModelInner;

/** An instance of this class provides access to all the operations defined in DrasClient. */
public interface DrasClient {
    /**
     * Gets the fabric agent (Dra).
     *
     * <p>Gets the details of the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DraModelInner> getWithResponse(
        String resourceGroupName, String fabricName, String fabricAgentName, Context context);

    /**
     * Gets the fabric agent (Dra).
     *
     * <p>Gets the details of the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the fabric agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DraModelInner get(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Puts the fabric agent (Dra).
     *
     * <p>Creates the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of dra model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DraModelInner>, DraModelInner> beginCreate(
        String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Puts the fabric agent (Dra).
     *
     * <p>Creates the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @param body Dra model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of dra model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DraModelInner>, DraModelInner> beginCreate(
        String resourceGroupName, String fabricName, String fabricAgentName, DraModelInner body, Context context);

    /**
     * Puts the fabric agent (Dra).
     *
     * <p>Creates the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dra model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DraModelInner create(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Puts the fabric agent (Dra).
     *
     * <p>Creates the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @param body Dra model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dra model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DraModelInner create(
        String resourceGroupName, String fabricName, String fabricAgentName, DraModelInner body, Context context);

    /**
     * Deletes the fabric agent (Dra).
     *
     * <p>Deletes the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Deletes the fabric agent (Dra).
     *
     * <p>Deletes the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String fabricName, String fabricAgentName, Context context);

    /**
     * Deletes the fabric agent (Dra).
     *
     * <p>Deletes the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fabricName, String fabricAgentName);

    /**
     * Deletes the fabric agent (Dra).
     *
     * <p>Deletes the fabric agent.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param fabricAgentName The fabric agent (Dra) name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fabricName, String fabricAgentName, Context context);

    /**
     * Lists the fabric agents (Dras).
     *
     * <p>Gets the list of fabric agents in the given fabric.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of fabric agents in the given fabric as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DraModelInner> list(String resourceGroupName, String fabricName);

    /**
     * Lists the fabric agents (Dras).
     *
     * <p>Gets the list of fabric agents in the given fabric.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of fabric agents in the given fabric as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DraModelInner> list(String resourceGroupName, String fabricName, Context context);
}
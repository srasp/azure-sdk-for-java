// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MonitoredSubscriptions. */
public interface MonitoredSubscriptions {
    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoredSubscriptionProperties> list(String resourceGroupName, String monitorName);

    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoredSubscriptionProperties> list(String resourceGroupName, String monitorName, Context context);

    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configuration name. Only 'default' value is supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request to update subscriptions needed to be monitored by the Datadog monitor resource along with
     *     {@link Response}.
     */
    Response<MonitoredSubscriptionProperties> getWithResponse(
        String resourceGroupName, String monitorName, String configurationName, Context context);

    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configuration name. Only 'default' value is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request to update subscriptions needed to be monitored by the Datadog monitor resource.
     */
    MonitoredSubscriptionProperties get(String resourceGroupName, String monitorName, String configurationName);

    /**
     * Updates the subscriptions that are being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName Configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String monitorName, String configurationName);

    /**
     * Updates the subscriptions that are being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName Configuration name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String monitorName, String configurationName, Context context);

    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request to update subscriptions needed to be monitored by the Datadog monitor resource along with
     *     {@link Response}.
     */
    MonitoredSubscriptionProperties getById(String id);

    /**
     * List the subscriptions currently being monitored by the Datadog monitor resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the request to update subscriptions needed to be monitored by the Datadog monitor resource along with
     *     {@link Response}.
     */
    Response<MonitoredSubscriptionProperties> getByIdWithResponse(String id, Context context);

    /**
     * Updates the subscriptions that are being monitored by the Datadog monitor resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Updates the subscriptions that are being monitored by the Datadog monitor resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MonitoredSubscriptionProperties resource.
     *
     * @param name resource name.
     * @return the first stage of the new MonitoredSubscriptionProperties definition.
     */
    MonitoredSubscriptionProperties.DefinitionStages.Blank define(String name);
}
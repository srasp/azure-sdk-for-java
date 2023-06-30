// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurestackhci.fluent.models.MarketplaceGalleryImagesInner;
import com.azure.resourcemanager.azurestackhci.models.MarketplaceGalleryImagesUpdateRequest;

/**
 * An instance of this class provides access to all the operations defined in MarketplaceGalleryImagesOperationsClient.
 */
public interface MarketplaceGalleryImagesOperationsClient {
    /**
     * Gets a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a marketplace gallery image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MarketplaceGalleryImagesInner> getByResourceGroupWithResponse(
        String resourceGroupName, String marketplaceGalleryImageName, Context context);

    /**
     * Gets a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a marketplace gallery image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MarketplaceGalleryImagesInner getByResourceGroup(String resourceGroupName, String marketplaceGalleryImageName);

    /**
     * The operation to create or update a marketplace gallery image. Please note some properties can be set only during
     * marketplace gallery image creation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MarketplaceGalleryImagesInner>, MarketplaceGalleryImagesInner> beginCreateOrUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesInner marketplaceGalleryImages);

    /**
     * The operation to create or update a marketplace gallery image. Please note some properties can be set only during
     * marketplace gallery image creation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MarketplaceGalleryImagesInner>, MarketplaceGalleryImagesInner> beginCreateOrUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesInner marketplaceGalleryImages,
        Context context);

    /**
     * The operation to create or update a marketplace gallery image. Please note some properties can be set only during
     * marketplace gallery image creation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MarketplaceGalleryImagesInner createOrUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesInner marketplaceGalleryImages);

    /**
     * The operation to create or update a marketplace gallery image. Please note some properties can be set only during
     * marketplace gallery image creation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MarketplaceGalleryImagesInner createOrUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesInner marketplaceGalleryImages,
        Context context);

    /**
     * The operation to delete a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String marketplaceGalleryImageName);

    /**
     * The operation to delete a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String marketplaceGalleryImageName, Context context);

    /**
     * The operation to delete a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String marketplaceGalleryImageName);

    /**
     * The operation to delete a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String marketplaceGalleryImageName, Context context);

    /**
     * The operation to update a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MarketplaceGalleryImagesInner>, MarketplaceGalleryImagesInner> beginUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesUpdateRequest marketplaceGalleryImages);

    /**
     * The operation to update a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MarketplaceGalleryImagesInner>, MarketplaceGalleryImagesInner> beginUpdate(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesUpdateRequest marketplaceGalleryImages,
        Context context);

    /**
     * The operation to update a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MarketplaceGalleryImagesInner update(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesUpdateRequest marketplaceGalleryImages);

    /**
     * The operation to update a marketplace gallery image.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param marketplaceGalleryImageName Name of the marketplace gallery image.
     * @param marketplaceGalleryImages The marketplace gallery image resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace gallery image resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MarketplaceGalleryImagesInner update(
        String resourceGroupName,
        String marketplaceGalleryImageName,
        MarketplaceGalleryImagesUpdateRequest marketplaceGalleryImages,
        Context context);

    /**
     * Lists all of the marketplace gallery images in the specified resource group. Use the nextLink property in the
     * response to get the next page of marketplace gallery images.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceGalleryImagesInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the marketplace gallery images in the specified resource group. Use the nextLink property in the
     * response to get the next page of marketplace gallery images.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceGalleryImagesInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the marketplace gallery images in the specified subscription. Use the nextLink property in the
     * response to get the next page of marketplace gallery images.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceGalleryImagesInner> list();

    /**
     * Lists all of the marketplace gallery images in the specified subscription. Use the nextLink property in the
     * response to get the next page of marketplace gallery images.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MarketplaceGalleryImagesInner> list(Context context);
}
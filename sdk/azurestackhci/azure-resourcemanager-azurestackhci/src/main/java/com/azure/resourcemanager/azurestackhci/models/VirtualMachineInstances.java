// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.VirtualMachineInstanceInner;

/** Resource collection API of VirtualMachineInstances. */
public interface VirtualMachineInstances {
    /**
     * Gets a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine instance along with {@link Response}.
     */
    Response<VirtualMachineInstance> getWithResponse(String resourceUri, Context context);

    /**
     * Gets a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine instance.
     */
    VirtualMachineInstance get(String resourceUri);

    /**
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param virtualMachineInstance The virtual machine instance resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance createOrUpdate(String resourceUri, VirtualMachineInstanceInner virtualMachineInstance);

    /**
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param virtualMachineInstance The virtual machine instance resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance createOrUpdate(
        String resourceUri, VirtualMachineInstanceInner virtualMachineInstance, Context context);

    /**
     * The operation to delete a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri);

    /**
     * The operation to delete a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceUri, Context context);

    /**
     * The operation to update a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param virtualMachineInstance The virtual machine instance resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance update(String resourceUri, VirtualMachineInstanceUpdateRequest virtualMachineInstance);

    /**
     * The operation to update a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param virtualMachineInstance The virtual machine instance resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance update(
        String resourceUri, VirtualMachineInstanceUpdateRequest virtualMachineInstance, Context context);

    /**
     * The operation to start a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance start(String resourceUri);

    /**
     * The operation to start a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance start(String resourceUri, Context context);

    /**
     * The operation to stop a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance stop(String resourceUri);

    /**
     * The operation to stop a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance stop(String resourceUri, Context context);

    /**
     * The operation to restart a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance restart(String resourceUri);

    /**
     * The operation to restart a virtual machine instance.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine instance resource definition.
     */
    VirtualMachineInstance restart(String resourceUri, Context context);

    /**
     * Lists all of the virtual machine instances within the specified parent resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineInstance> list(String resourceUri);

    /**
     * Lists all of the virtual machine instances within the specified parent resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineInstance> list(String resourceUri, Context context);
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Files. */
public interface Files {
    /**
     * Lists all the Files information under a workspace for an Azure subscription.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of File resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileDetails> list(String fileWorkspaceName);

    /**
     * Lists all the Files information under a workspace for an Azure subscription.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of File resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileDetails> list(String fileWorkspaceName, Context context);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param fileName File Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource along with {@link Response}.
     */
    Response<FileDetails> getWithResponse(String fileWorkspaceName, String fileName, Context context);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param fileName File Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource.
     */
    FileDetails get(String fileWorkspaceName, String fileName);

    /**
     * This API allows you to upload content to a file.
     *
     * @param fileWorkspaceName File WorkspaceName.
     * @param fileName File Name.
     * @param uploadFile UploadFile object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> uploadWithResponse(
        String fileWorkspaceName, String fileName, UploadFile uploadFile, Context context);

    /**
     * This API allows you to upload content to a file.
     *
     * @param fileWorkspaceName File WorkspaceName.
     * @param fileName File Name.
     * @param uploadFile UploadFile object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upload(String fileWorkspaceName, String fileName, UploadFile uploadFile);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource along with {@link Response}.
     */
    FileDetails getById(String id);

    /**
     * Returns details of a specific file in a work space.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents File Details resource along with {@link Response}.
     */
    Response<FileDetails> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FileDetails resource.
     *
     * @param name resource name.
     * @return the first stage of the new FileDetails definition.
     */
    FileDetails.DefinitionStages.Blank define(String name);
}
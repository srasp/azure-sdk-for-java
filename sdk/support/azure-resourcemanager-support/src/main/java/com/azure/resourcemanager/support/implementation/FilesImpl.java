// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.FilesClient;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.FileDetails;
import com.azure.resourcemanager.support.models.Files;
import com.azure.resourcemanager.support.models.UploadFile;

public final class FilesImpl implements Files {
    private static final ClientLogger LOGGER = new ClientLogger(FilesImpl.class);

    private final FilesClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public FilesImpl(FilesClient innerClient, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FileDetails> list(String fileWorkspaceName) {
        PagedIterable<FileDetailsInner> inner = this.serviceClient().list(fileWorkspaceName);
        return Utils.mapPage(inner, inner1 -> new FileDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<FileDetails> list(String fileWorkspaceName, Context context) {
        PagedIterable<FileDetailsInner> inner = this.serviceClient().list(fileWorkspaceName, context);
        return Utils.mapPage(inner, inner1 -> new FileDetailsImpl(inner1, this.manager()));
    }

    public Response<FileDetails> getWithResponse(String fileWorkspaceName, String fileName, Context context) {
        Response<FileDetailsInner> inner = this.serviceClient().getWithResponse(fileWorkspaceName, fileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FileDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileDetails get(String fileWorkspaceName, String fileName) {
        FileDetailsInner inner = this.serviceClient().get(fileWorkspaceName, fileName);
        if (inner != null) {
            return new FileDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> uploadWithResponse(
        String fileWorkspaceName, String fileName, UploadFile uploadFile, Context context) {
        return this.serviceClient().uploadWithResponse(fileWorkspaceName, fileName, uploadFile, context);
    }

    public void upload(String fileWorkspaceName, String fileName, UploadFile uploadFile) {
        this.serviceClient().upload(fileWorkspaceName, fileName, uploadFile);
    }

    public FileDetails getById(String id) {
        String fileWorkspaceName = Utils.getValueFromIdByName(id, "fileWorkspaces");
        if (fileWorkspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'fileWorkspaces'.", id)));
        }
        String fileName = Utils.getValueFromIdByName(id, "files");
        if (fileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'files'.", id)));
        }
        return this.getWithResponse(fileWorkspaceName, fileName, Context.NONE).getValue();
    }

    public Response<FileDetails> getByIdWithResponse(String id, Context context) {
        String fileWorkspaceName = Utils.getValueFromIdByName(id, "fileWorkspaces");
        if (fileWorkspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'fileWorkspaces'.", id)));
        }
        String fileName = Utils.getValueFromIdByName(id, "files");
        if (fileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'files'.", id)));
        }
        return this.getWithResponse(fileWorkspaceName, fileName, context);
    }

    private FilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    public FileDetailsImpl define(String name) {
        return new FileDetailsImpl(name, this.manager());
    }
}
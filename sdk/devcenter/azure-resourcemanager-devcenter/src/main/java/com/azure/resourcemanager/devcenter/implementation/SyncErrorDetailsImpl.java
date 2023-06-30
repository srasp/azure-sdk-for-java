// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.resourcemanager.devcenter.fluent.models.SyncErrorDetailsInner;
import com.azure.resourcemanager.devcenter.models.CatalogConflictError;
import com.azure.resourcemanager.devcenter.models.CatalogErrorDetails;
import com.azure.resourcemanager.devcenter.models.CatalogSyncError;
import com.azure.resourcemanager.devcenter.models.SyncErrorDetails;
import java.util.Collections;
import java.util.List;

public final class SyncErrorDetailsImpl implements SyncErrorDetails {
    private SyncErrorDetailsInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    SyncErrorDetailsImpl(
        SyncErrorDetailsInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CatalogErrorDetails operationError() {
        return this.innerModel().operationError();
    }

    public List<CatalogConflictError> conflicts() {
        List<CatalogConflictError> inner = this.innerModel().conflicts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CatalogSyncError> errors() {
        List<CatalogSyncError> inner = this.innerModel().errors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SyncErrorDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
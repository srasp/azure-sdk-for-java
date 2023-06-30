// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;

/** The DraModelSystemData model. */
@Fluent
public final class DraModelSystemData extends SystemDataModel {
    /** Creates an instance of DraModelSystemData class. */
    public DraModelSystemData() {
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withCreatedBy(String createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withCreatedByType(String createdByType) {
        super.withCreatedByType(createdByType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withCreatedAt(OffsetDateTime createdAt) {
        super.withCreatedAt(createdAt);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withLastModifiedBy(String lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withLastModifiedByType(String lastModifiedByType) {
        super.withLastModifiedByType(lastModifiedByType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DraModelSystemData withLastModifiedAt(OffsetDateTime lastModifiedAt) {
        super.withLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
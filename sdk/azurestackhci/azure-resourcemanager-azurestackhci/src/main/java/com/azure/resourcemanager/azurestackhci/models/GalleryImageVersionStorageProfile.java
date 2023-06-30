// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is the storage profile of a Gallery Image Version. */
@Fluent
public final class GalleryImageVersionStorageProfile {
    /*
     * This is the OS disk image.
     */
    @JsonProperty(value = "osDiskImage")
    private GalleryOSDiskImage osDiskImage;

    /** Creates an instance of GalleryImageVersionStorageProfile class. */
    public GalleryImageVersionStorageProfile() {
    }

    /**
     * Get the osDiskImage property: This is the OS disk image.
     *
     * @return the osDiskImage value.
     */
    public GalleryOSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: This is the OS disk image.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withOsDiskImage(GalleryOSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
    }
}
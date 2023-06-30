// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body for Migrate operation. */
@Fluent
public final class MigrationParameters {
    /*
     * Sku for the migration
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Resource reference of the classic cdn profile or classic frontdoor that need to be migrated.
     */
    @JsonProperty(value = "classicResourceReference", required = true)
    private ResourceReference classicResourceReference;

    /*
     * Name of the new profile that need to be created.
     */
    @JsonProperty(value = "profileName", required = true)
    private String profileName;

    /*
     * Waf mapping for the migrated profile
     */
    @JsonProperty(value = "migrationWebApplicationFirewallMappings")
    private List<MigrationWebApplicationFirewallMapping> migrationWebApplicationFirewallMappings;

    /** Creates an instance of MigrationParameters class. */
    public MigrationParameters() {
    }

    /**
     * Get the sku property: Sku for the migration.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku for the migration.
     *
     * @param sku the sku value to set.
     * @return the MigrationParameters object itself.
     */
    public MigrationParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the classicResourceReference property: Resource reference of the classic cdn profile or classic frontdoor
     * that need to be migrated.
     *
     * @return the classicResourceReference value.
     */
    public ResourceReference classicResourceReference() {
        return this.classicResourceReference;
    }

    /**
     * Set the classicResourceReference property: Resource reference of the classic cdn profile or classic frontdoor
     * that need to be migrated.
     *
     * @param classicResourceReference the classicResourceReference value to set.
     * @return the MigrationParameters object itself.
     */
    public MigrationParameters withClassicResourceReference(ResourceReference classicResourceReference) {
        this.classicResourceReference = classicResourceReference;
        return this;
    }

    /**
     * Get the profileName property: Name of the new profile that need to be created.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Set the profileName property: Name of the new profile that need to be created.
     *
     * @param profileName the profileName value to set.
     * @return the MigrationParameters object itself.
     */
    public MigrationParameters withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * Get the migrationWebApplicationFirewallMappings property: Waf mapping for the migrated profile.
     *
     * @return the migrationWebApplicationFirewallMappings value.
     */
    public List<MigrationWebApplicationFirewallMapping> migrationWebApplicationFirewallMappings() {
        return this.migrationWebApplicationFirewallMappings;
    }

    /**
     * Set the migrationWebApplicationFirewallMappings property: Waf mapping for the migrated profile.
     *
     * @param migrationWebApplicationFirewallMappings the migrationWebApplicationFirewallMappings value to set.
     * @return the MigrationParameters object itself.
     */
    public MigrationParameters withMigrationWebApplicationFirewallMappings(
        List<MigrationWebApplicationFirewallMapping> migrationWebApplicationFirewallMappings) {
        this.migrationWebApplicationFirewallMappings = migrationWebApplicationFirewallMappings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model MigrationParameters"));
        } else {
            sku().validate();
        }
        if (classicResourceReference() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property classicResourceReference in model MigrationParameters"));
        } else {
            classicResourceReference().validate();
        }
        if (profileName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property profileName in model MigrationParameters"));
        }
        if (migrationWebApplicationFirewallMappings() != null) {
            migrationWebApplicationFirewallMappings().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MigrationParameters.class);
}
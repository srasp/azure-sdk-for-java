// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.playwrighttesting.fluent.models.AccountInner;
import com.azure.resourcemanager.playwrighttesting.models.Account;
import com.azure.resourcemanager.playwrighttesting.models.AccountUpdate;
import com.azure.resourcemanager.playwrighttesting.models.EnablementStatus;
import com.azure.resourcemanager.playwrighttesting.models.ProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class AccountImpl implements Account, Account.Definition, Account.Update {
    private AccountInner innerObject;

    private final com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String dashboardUri() {
        return this.innerModel().dashboardUri();
    }

    public EnablementStatus regionalAffinity() {
        return this.innerModel().regionalAffinity();
    }

    public EnablementStatus scalableExecution() {
        return this.innerModel().scalableExecution();
    }

    public EnablementStatus reporting() {
        return this.innerModel().reporting();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private AccountUpdate updateProperties;

    public AccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Account create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public Account create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    AccountImpl(String name, com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager serviceManager) {
        this.innerObject = new AccountInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public AccountImpl update() {
        this.updateProperties = new AccountUpdate();
        return this;
    }

    public Account apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .updateWithResponse(resourceGroupName, name, updateProperties, Context.NONE)
                .getValue();
        return this;
    }

    public Account apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .updateWithResponse(resourceGroupName, name, updateProperties, context)
                .getValue();
        return this;
    }

    AccountImpl(
        AccountInner innerObject, com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "accounts");
    }

    public Account refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public Account refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public AccountImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AccountImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AccountImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public AccountImpl withRegionalAffinity(EnablementStatus regionalAffinity) {
        if (isInCreateMode()) {
            this.innerModel().withRegionalAffinity(regionalAffinity);
            return this;
        } else {
            this.updateProperties.withRegionalAffinity(regionalAffinity);
            return this;
        }
    }

    public AccountImpl withScalableExecution(EnablementStatus scalableExecution) {
        if (isInCreateMode()) {
            this.innerModel().withScalableExecution(scalableExecution);
            return this;
        } else {
            this.updateProperties.withScalableExecution(scalableExecution);
            return this;
        }
    }

    public AccountImpl withReporting(EnablementStatus reporting) {
        if (isInCreateMode()) {
            this.innerModel().withReporting(reporting);
            return this;
        } else {
            this.updateProperties.withReporting(reporting);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
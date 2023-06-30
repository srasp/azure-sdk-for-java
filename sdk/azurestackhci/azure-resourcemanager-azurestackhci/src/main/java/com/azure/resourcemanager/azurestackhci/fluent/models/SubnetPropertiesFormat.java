// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.models.IpAllocationMethodEnum;
import com.azure.resourcemanager.azurestackhci.models.IpPool;
import com.azure.resourcemanager.azurestackhci.models.RouteTable;
import com.azure.resourcemanager.azurestackhci.models.SubnetPropertiesFormatIpConfigurationReferencesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the subnet. */
@Fluent
public final class SubnetPropertiesFormat {
    /*
     * The address prefix for the subnet: Cidr for this subnet - IPv4, IPv6.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * List of address prefixes for the subnet.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /*
     * IPAllocationMethod - The IP address allocation method. Possible values include: 'Static', 'Dynamic'
     */
    @JsonProperty(value = "ipAllocationMethod")
    private IpAllocationMethodEnum ipAllocationMethod;

    /*
     * IPConfigurationReferences - list of IPConfigurationReferences
     */
    @JsonProperty(value = "ipConfigurationReferences")
    private List<SubnetPropertiesFormatIpConfigurationReferencesItem> ipConfigurationReferences;

    /*
     * Route table resource.
     */
    @JsonProperty(value = "routeTable")
    private RouteTable routeTable;

    /*
     * network associated pool of IP Addresses
     */
    @JsonProperty(value = "ipPools")
    private List<IpPool> ipPools;

    /*
     * Vlan to use for the subnet
     */
    @JsonProperty(value = "vlan")
    private Integer vlan;

    /** Creates an instance of SubnetPropertiesFormat class. */
    public SubnetPropertiesFormat() {
    }

    /**
     * Get the addressPrefix property: The address prefix for the subnet: Cidr for this subnet - IPv4, IPv6.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: The address prefix for the subnet: Cidr for this subnet - IPv4, IPv6.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the ipAllocationMethod property: IPAllocationMethod - The IP address allocation method. Possible values
     * include: 'Static', 'Dynamic'.
     *
     * @return the ipAllocationMethod value.
     */
    public IpAllocationMethodEnum ipAllocationMethod() {
        return this.ipAllocationMethod;
    }

    /**
     * Set the ipAllocationMethod property: IPAllocationMethod - The IP address allocation method. Possible values
     * include: 'Static', 'Dynamic'.
     *
     * @param ipAllocationMethod the ipAllocationMethod value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withIpAllocationMethod(IpAllocationMethodEnum ipAllocationMethod) {
        this.ipAllocationMethod = ipAllocationMethod;
        return this;
    }

    /**
     * Get the ipConfigurationReferences property: IPConfigurationReferences - list of IPConfigurationReferences.
     *
     * @return the ipConfigurationReferences value.
     */
    public List<SubnetPropertiesFormatIpConfigurationReferencesItem> ipConfigurationReferences() {
        return this.ipConfigurationReferences;
    }

    /**
     * Set the ipConfigurationReferences property: IPConfigurationReferences - list of IPConfigurationReferences.
     *
     * @param ipConfigurationReferences the ipConfigurationReferences value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withIpConfigurationReferences(
        List<SubnetPropertiesFormatIpConfigurationReferencesItem> ipConfigurationReferences) {
        this.ipConfigurationReferences = ipConfigurationReferences;
        return this;
    }

    /**
     * Get the routeTable property: Route table resource.
     *
     * @return the routeTable value.
     */
    public RouteTable routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable property: Route table resource.
     *
     * @param routeTable the routeTable value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the ipPools property: network associated pool of IP Addresses.
     *
     * @return the ipPools value.
     */
    public List<IpPool> ipPools() {
        return this.ipPools;
    }

    /**
     * Set the ipPools property: network associated pool of IP Addresses.
     *
     * @param ipPools the ipPools value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withIpPools(List<IpPool> ipPools) {
        this.ipPools = ipPools;
        return this;
    }

    /**
     * Get the vlan property: Vlan to use for the subnet.
     *
     * @return the vlan value.
     */
    public Integer vlan() {
        return this.vlan;
    }

    /**
     * Set the vlan property: Vlan to use for the subnet.
     *
     * @param vlan the vlan value to set.
     * @return the SubnetPropertiesFormat object itself.
     */
    public SubnetPropertiesFormat withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurationReferences() != null) {
            ipConfigurationReferences().forEach(e -> e.validate());
        }
        if (routeTable() != null) {
            routeTable().validate();
        }
        if (ipPools() != null) {
            ipPools().forEach(e -> e.validate());
        }
    }
}
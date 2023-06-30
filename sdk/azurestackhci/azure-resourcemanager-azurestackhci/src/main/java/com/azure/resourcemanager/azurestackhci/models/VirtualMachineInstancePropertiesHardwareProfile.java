// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HardwareProfile - Specifies the hardware settings for the virtual machine instance. */
@Fluent
public final class VirtualMachineInstancePropertiesHardwareProfile {
    /*
     * The vmSize property.
     */
    @JsonProperty(value = "vmSize")
    private VmSizeEnum vmSize;

    /*
     * number of processors for the virtual machine instance
     */
    @JsonProperty(value = "processors")
    private Integer processors;

    /*
     * RAM in MB for the virtual machine instance
     */
    @JsonProperty(value = "memoryMB")
    private Long memoryMB;

    /*
     * The dynamicMemoryConfig property.
     */
    @JsonProperty(value = "dynamicMemoryConfig")
    private VirtualMachineInstancePropertiesHardwareProfileDynamicMemoryConfig dynamicMemoryConfig;

    /** Creates an instance of VirtualMachineInstancePropertiesHardwareProfile class. */
    public VirtualMachineInstancePropertiesHardwareProfile() {
    }

    /**
     * Get the vmSize property: The vmSize property.
     *
     * @return the vmSize value.
     */
    public VmSizeEnum vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: The vmSize property.
     *
     * @param vmSize the vmSize value to set.
     * @return the VirtualMachineInstancePropertiesHardwareProfile object itself.
     */
    public VirtualMachineInstancePropertiesHardwareProfile withVmSize(VmSizeEnum vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the processors property: number of processors for the virtual machine instance.
     *
     * @return the processors value.
     */
    public Integer processors() {
        return this.processors;
    }

    /**
     * Set the processors property: number of processors for the virtual machine instance.
     *
     * @param processors the processors value to set.
     * @return the VirtualMachineInstancePropertiesHardwareProfile object itself.
     */
    public VirtualMachineInstancePropertiesHardwareProfile withProcessors(Integer processors) {
        this.processors = processors;
        return this;
    }

    /**
     * Get the memoryMB property: RAM in MB for the virtual machine instance.
     *
     * @return the memoryMB value.
     */
    public Long memoryMB() {
        return this.memoryMB;
    }

    /**
     * Set the memoryMB property: RAM in MB for the virtual machine instance.
     *
     * @param memoryMB the memoryMB value to set.
     * @return the VirtualMachineInstancePropertiesHardwareProfile object itself.
     */
    public VirtualMachineInstancePropertiesHardwareProfile withMemoryMB(Long memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }

    /**
     * Get the dynamicMemoryConfig property: The dynamicMemoryConfig property.
     *
     * @return the dynamicMemoryConfig value.
     */
    public VirtualMachineInstancePropertiesHardwareProfileDynamicMemoryConfig dynamicMemoryConfig() {
        return this.dynamicMemoryConfig;
    }

    /**
     * Set the dynamicMemoryConfig property: The dynamicMemoryConfig property.
     *
     * @param dynamicMemoryConfig the dynamicMemoryConfig value to set.
     * @return the VirtualMachineInstancePropertiesHardwareProfile object itself.
     */
    public VirtualMachineInstancePropertiesHardwareProfile withDynamicMemoryConfig(
        VirtualMachineInstancePropertiesHardwareProfileDynamicMemoryConfig dynamicMemoryConfig) {
        this.dynamicMemoryConfig = dynamicMemoryConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dynamicMemoryConfig() != null) {
            dynamicMemoryConfig().validate();
        }
    }
}
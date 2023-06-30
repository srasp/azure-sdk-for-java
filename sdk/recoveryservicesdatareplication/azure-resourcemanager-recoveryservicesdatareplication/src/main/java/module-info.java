// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.recoveryservicesdatareplication {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.recoveryservicesdatareplication;
    exports com.azure.resourcemanager.recoveryservicesdatareplication.fluent;
    exports com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models;
    exports com.azure.resourcemanager.recoveryservicesdatareplication.models;

    opens com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.recoveryservicesdatareplication.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
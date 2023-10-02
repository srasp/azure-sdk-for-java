// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeImportCommand;

public final class AzureDatabricksDeltaLakeImportCommandTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDatabricksDeltaLakeImportCommand model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureDatabricksDeltaLakeImportCommand\",\"dateFormat\":\"datahyzez\",\"timestampFormat\":\"datavkzrvy\",\"\":{\"oelyjduzapn\":\"dataqgyui\",\"odprrqcagl\":\"datapo\"}}")
                .toObject(AzureDatabricksDeltaLakeImportCommand.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDatabricksDeltaLakeImportCommand model =
            new AzureDatabricksDeltaLakeImportCommand().withDateFormat("datahyzez").withTimestampFormat("datavkzrvy");
        model = BinaryData.fromObject(model).toObject(AzureDatabricksDeltaLakeImportCommand.class);
    }
}
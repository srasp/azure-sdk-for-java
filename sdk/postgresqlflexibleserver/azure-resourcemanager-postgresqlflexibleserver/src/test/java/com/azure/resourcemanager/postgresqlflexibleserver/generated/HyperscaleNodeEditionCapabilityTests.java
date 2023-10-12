// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HyperscaleNodeEditionCapability;

public final class HyperscaleNodeEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperscaleNodeEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"qhakauhashsf\",\"supportedStorageEditions\":[{\"name\":\"owzxcu\",\"supportedStorageMB\":[{\"name\":\"ooxdjebwpuc\",\"supportedIops\":6176263530057609955,\"storageSizeMB\":6213483555580723643,\"supportedUpgradableTierList\":[{}],\"status\":\"uecivyhz\"},{\"name\":\"uojgj\",\"supportedIops\":5062126351477079238,\"storageSizeMB\":6905862249105518012,\"supportedUpgradableTierList\":[{},{},{}],\"status\":\"cdytdxw\"},{\"name\":\"xnrj\",\"supportedIops\":7022663417329031305,\"storageSizeMB\":6962157826226813076,\"supportedUpgradableTierList\":[{}],\"status\":\"skxfbk\"},{\"name\":\"cg\",\"supportedIops\":6732175570490023476,\"storageSizeMB\":7330294444739560743,\"supportedUpgradableTierList\":[{},{},{},{}],\"status\":\"uwhvylwzbtdhxujz\"}],\"status\":\"mpowuwpr\"}],\"supportedServerVersions\":[{\"name\":\"eualupjmkhf\",\"supportedVersionsToUpgrade\":[\"bcswsrt\",\"riplrbpbewtg\",\"fgb\"],\"supportedVcores\":[{\"name\":\"xzvlvqhjkbegib\",\"vCores\":6232281043746114213,\"supportedIops\":3339255508658819137,\"supportedMemoryPerVcoreMB\":2986160897527591596,\"status\":\"oayqc\"}],\"status\":\"rtzju\"}],\"supportedNodeTypes\":[{\"name\":\"zmh\",\"nodeType\":\"ongmtsa\",\"status\":\"cbpwxqpsrknft\"},{\"name\":\"vriuhprwmdyvx\",\"nodeType\":\"ayriwwroyqbexrm\",\"status\":\"ibycno\"},{\"name\":\"knme\",\"nodeType\":\"sgzvahapjyzhpv\",\"status\":\"zcjrvxdjzlmwlx\"}],\"status\":\"ug\"}")
                .toObject(HyperscaleNodeEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperscaleNodeEditionCapability model = new HyperscaleNodeEditionCapability();
        model = BinaryData.fromObject(model).toObject(HyperscaleNodeEditionCapability.class);
    }
}
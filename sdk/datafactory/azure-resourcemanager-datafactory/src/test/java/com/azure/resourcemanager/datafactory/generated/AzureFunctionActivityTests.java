// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureFunctionActivity;
import com.azure.resourcemanager.datafactory.models.AzureFunctionActivityMethod;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureFunctionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFunctionActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureFunctionActivity\",\"typeProperties\":{\"method\":\"HEAD\",\"functionName\":\"dataxenmuev\",\"headers\":\"datassclgolbpw\",\"body\":\"datazdionlgn\"},\"linkedServiceName\":{\"referenceName\":\"pk\",\"parameters\":{\"xndrhlbxrqbicj\":\"datafdtzskvpq\",\"poczxmwbk\":\"dataaafvxxiizkehf\",\"inhqpq\":\"datawihbyufm\",\"huxzdgoto\":\"dataowxd\"}},\"policy\":{\"timeout\":\"dataduirjqxknaeuhxnp\",\"retry\":\"datadjaeqaolfy\",\"retryIntervalInSeconds\":900983791,\"secureInput\":false,\"secureOutput\":true,\"\":{\"mjwgrwvlzb\":\"dataaxtbn\",\"tieybi\":\"datafmhz\",\"et\":\"dataitgx\"}},\"name\":\"wloo\",\"description\":\"gkwabzr\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"ii\",\"dependencyConditions\":[\"Completed\",\"Failed\"],\"\":{\"kuzlfnbz\":\"dataez\",\"vckyhncqyogv\":\"datakwoajbkw\",\"tnx\":\"datapxs\",\"kovgxamhmqe\":\"datagwxmqyhtlnnpfta\"}},{\"activity\":\"yoylcwzkcreufdp\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Failed\"],\"\":{\"smiaru\":\"datahrpxsxyba\",\"yvxjelsjhgrvytlu\":\"databotqzypvcob\",\"elawdbkezfko\":\"datakhiycddonqikujjd\"}},{\"activity\":\"voszgcy\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Succeeded\"],\"\":{\"j\":\"dataqwvvferlqhfzzqqs\",\"skjqejkm\":\"datashwxy\",\"utcyjjbdgfrl\":\"datatwftlhsmtkxzio\",\"egqvusffzvpwzvh\":\"datah\"}}],\"userProperties\":[{\"name\":\"rvmpiw\",\"value\":\"dataoorrnssthninza\"},{\"name\":\"dmnc\",\"value\":\"dataltrxwab\"},{\"name\":\"d\",\"value\":\"dataclqgteoepdpx\"}],\"\":{\"qikeamymalvoy\":\"dataqwfpqixomonq\"}}")
                .toObject(AzureFunctionActivity.class);
        Assertions.assertEquals("wloo", model.name());
        Assertions.assertEquals("gkwabzr", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ii", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("rvmpiw", model.userProperties().get(0).name());
        Assertions.assertEquals("pk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(900983791, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(AzureFunctionActivityMethod.HEAD, model.method());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFunctionActivity model =
            new AzureFunctionActivity()
                .withName("wloo")
                .withDescription("gkwabzr")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("ii")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("yoylcwzkcreufdp")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("voszgcy")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("rvmpiw").withValue("dataoorrnssthninza"),
                            new UserProperty().withName("dmnc").withValue("dataltrxwab"),
                            new UserProperty().withName("d").withValue("dataclqgteoepdpx")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("pk")
                        .withParameters(
                            mapOf(
                                "xndrhlbxrqbicj",
                                "datafdtzskvpq",
                                "poczxmwbk",
                                "dataaafvxxiizkehf",
                                "inhqpq",
                                "datawihbyufm",
                                "huxzdgoto",
                                "dataowxd")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("dataduirjqxknaeuhxnp")
                        .withRetry("datadjaeqaolfy")
                        .withRetryIntervalInSeconds(900983791)
                        .withSecureInput(false)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withMethod(AzureFunctionActivityMethod.HEAD)
                .withFunctionName("dataxenmuev")
                .withHeaders("datassclgolbpw")
                .withBody("datazdionlgn");
        model = BinaryData.fromObject(model).toObject(AzureFunctionActivity.class);
        Assertions.assertEquals("wloo", model.name());
        Assertions.assertEquals("gkwabzr", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ii", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("rvmpiw", model.userProperties().get(0).name());
        Assertions.assertEquals("pk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(900983791, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(AzureFunctionActivityMethod.HEAD, model.method());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightMapReduceActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightMapReduceActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightMapReduceActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"HDInsightMapReduce\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"ljhgqqjmfrm\",\"parameters\":{\"hjhpxjlgiurmli\":\"datagcbrmmweeuy\"}},{\"referenceName\":\"nad\",\"parameters\":{\"wokefdeeppycwsy\":\"datafxzcxvpogrtkdit\",\"hmgv\":\"dataxfowfnsyyeytrwyo\"}},{\"referenceName\":\"eemjazq\",\"parameters\":{\"a\":\"datagkxtgs\",\"puds\":\"datanholkoyxm\",\"xs\":\"datawvzunrqvup\"}},{\"referenceName\":\"nqzdfjwofgzif\",\"parameters\":{\"ddir\":\"dataftilhoyemhwaep\",\"vorifcqmfvzu\":\"datadt\",\"sxtry\":\"datam\",\"hrizwmptsygqztn\":\"datarvwmmuovturdhnn\"}}],\"arguments\":[\"dataeizuapgqxe\",\"databvwxyumqoqw\"],\"getDebugInfo\":\"Failure\",\"className\":\"datayiyeigngrzve\",\"jarFilePath\":\"dataxmxlnhqxzewlww\",\"jarLinkedService\":{\"referenceName\":\"pvpc\",\"parameters\":{\"vfctsfujdapc\":\"dataovzkwhdtf\",\"tddydbat\":\"datagamgbnktg\",\"rwsdy\":\"dataxkwcolna\"}},\"jarLibs\":[\"datan\",\"datad\"],\"defines\":{\"gtkojrruhzvveer\":\"datamvnzhdsaqme\",\"cczkggbmzdnyrmo\":\"datalehsnlmdosiyzf\",\"umckcbsakoucss\":\"datamaekc\"}},\"linkedServiceName\":{\"referenceName\":\"dqilzogilgrqzwy\",\"parameters\":{\"ksghpsqvuisedeqr\":\"datafybflrpvcgqqx\",\"rqdxvbt\":\"datafjkxxn\"}},\"policy\":{\"timeout\":\"dataxvlsv\",\"retry\":\"datavpagwohkromzs\",\"retryIntervalInSeconds\":2037950340,\"secureInput\":true,\"secureOutput\":false,\"\":{\"lvhbg\":\"datavr\",\"gpsalynan\":\"datagjpiezthf\"}},\"name\":\"wzpfbiqjrz\",\"description\":\"xizorqliblyb\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"ffzdyoznidstof\",\"dependencyConditions\":[\"Failed\",\"Completed\"],\"\":{\"xmcsxidazslwh\":\"datawabfgfwebi\"}},{\"activity\":\"yikhdcilinbuok\",\"dependencyConditions\":[\"Failed\",\"Succeeded\",\"Skipped\"],\"\":{\"valoauuwoigofu\":\"dataiplzmswhqrdv\"}},{\"activity\":\"bpmzedmf\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Completed\",\"Succeeded\"],\"\":{\"wyinfywtqvjnoem\":\"dataavbotaoaixip\"}},{\"activity\":\"wutbyaeyyiw\",\"dependencyConditions\":[\"Completed\",\"Completed\"],\"\":{\"onridhwoyznjdd\":\"datamexugdjdmwcxvc\",\"ipuot\":\"datahazlomvx\",\"rhjh\":\"dataiqzqmpgvyydjww\",\"h\":\"datawcfftszswvyi\"}}],\"userProperties\":[{\"name\":\"hgyeoikxjpuwgg\",\"value\":\"datasaqfnbxuw\"}],\"\":{\"egtsqzkzworuhhv\":\"databus\",\"bkgp\":\"dataeodcdjhf\",\"tyuvuzqtrfziub\":\"dataxusylgpznbklhw\"}}")
                .toObject(HDInsightMapReduceActivity.class);
        Assertions.assertEquals("wzpfbiqjrz", model.name());
        Assertions.assertEquals("xizorqliblyb", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("ffzdyoznidstof", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("hgyeoikxjpuwgg", model.userProperties().get(0).name());
        Assertions.assertEquals("dqilzogilgrqzwy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2037950340, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("ljhgqqjmfrm", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("pvpc", model.jarLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightMapReduceActivity model =
            new HDInsightMapReduceActivity()
                .withName("wzpfbiqjrz")
                .withDescription("xizorqliblyb")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("ffzdyoznidstof")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("yikhdcilinbuok")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.FAILED,
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("bpmzedmf")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("wutbyaeyyiw")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("hgyeoikxjpuwgg").withValue("datasaqfnbxuw")))
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("dqilzogilgrqzwy")
                        .withParameters(mapOf("ksghpsqvuisedeqr", "datafybflrpvcgqqx", "rqdxvbt", "datafjkxxn")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("dataxvlsv")
                        .withRetry("datavpagwohkromzs")
                        .withRetryIntervalInSeconds(2037950340)
                        .withSecureInput(true)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()))
                .withStorageLinkedServices(
                    Arrays
                        .asList(
                            new LinkedServiceReference()
                                .withReferenceName("ljhgqqjmfrm")
                                .withParameters(mapOf("hjhpxjlgiurmli", "datagcbrmmweeuy")),
                            new LinkedServiceReference()
                                .withReferenceName("nad")
                                .withParameters(
                                    mapOf("wokefdeeppycwsy", "datafxzcxvpogrtkdit", "hmgv", "dataxfowfnsyyeytrwyo")),
                            new LinkedServiceReference()
                                .withReferenceName("eemjazq")
                                .withParameters(
                                    mapOf("a", "datagkxtgs", "puds", "datanholkoyxm", "xs", "datawvzunrqvup")),
                            new LinkedServiceReference()
                                .withReferenceName("nqzdfjwofgzif")
                                .withParameters(
                                    mapOf(
                                        "ddir",
                                        "dataftilhoyemhwaep",
                                        "vorifcqmfvzu",
                                        "datadt",
                                        "sxtry",
                                        "datam",
                                        "hrizwmptsygqztn",
                                        "datarvwmmuovturdhnn"))))
                .withArguments(Arrays.asList("dataeizuapgqxe", "databvwxyumqoqw"))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE)
                .withClassName("datayiyeigngrzve")
                .withJarFilePath("dataxmxlnhqxzewlww")
                .withJarLinkedService(
                    new LinkedServiceReference()
                        .withReferenceName("pvpc")
                        .withParameters(
                            mapOf(
                                "vfctsfujdapc", "dataovzkwhdtf", "tddydbat", "datagamgbnktg", "rwsdy", "dataxkwcolna")))
                .withJarLibs(Arrays.asList("datan", "datad"))
                .withDefines(
                    mapOf(
                        "gtkojrruhzvveer",
                        "datamvnzhdsaqme",
                        "cczkggbmzdnyrmo",
                        "datalehsnlmdosiyzf",
                        "umckcbsakoucss",
                        "datamaekc"));
        model = BinaryData.fromObject(model).toObject(HDInsightMapReduceActivity.class);
        Assertions.assertEquals("wzpfbiqjrz", model.name());
        Assertions.assertEquals("xizorqliblyb", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("ffzdyoznidstof", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("hgyeoikxjpuwgg", model.userProperties().get(0).name());
        Assertions.assertEquals("dqilzogilgrqzwy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2037950340, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("ljhgqqjmfrm", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("pvpc", model.jarLinkedService().referenceName());
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
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model =
            BinaryData
                .fromString(
                    "{\"createTime\":\"2021-02-13T03:04:12Z\",\"taskQueueId\":\"yacgih\",\"internalChannelEncryption\":\"NotSet\",\"version\":\"cuedybkbgdwbmi\",\"nodes\":[{\"nodeName\":\"a\",\"machineName\":\"wedbpirbz\",\"hostServiceUri\":\"uzbbhxncs\",\"status\":\"InitializeFailed\",\"capabilities\":{\"ltniuiimerffhgvc\":\"veuxgmigsoeb\",\"feudbobmoljirch\":\"mddoeilhgga\",\"vccquajpoipdjxyo\":\"wlzi\"},\"versionStatus\":\"vraxhnto\",\"version\":\"fszkrlkosjwrrets\",\"registerTime\":\"2021-10-13T01:30:26Z\",\"lastConnectTime\":\"2021-06-28T14:03:07Z\",\"expiryTime\":\"2021-04-17T06:24:34Z\",\"lastStartTime\":\"2021-06-06T15:54:39Z\",\"lastStopTime\":\"2021-06-16T13:23:22Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-09-19T12:13:02Z\",\"lastEndUpdateTime\":\"2021-09-13T03:41:11Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1049765252,\"maxConcurrentJobs\":1561686443,\"\":{\"bmggnqx\":\"datauwhdqngqam\",\"kvomdqxnoy\":\"dataexqzaffzqodoks\",\"nqnttrwocb\":\"dataqipapifccydbjgh\"}},{\"nodeName\":\"vxdvphxmw\",\"machineName\":\"xcaicb\",\"hostServiceUri\":\"bogsfov\",\"status\":\"Initializing\",\"capabilities\":{\"gunrukcyyaa\":\"y\"},\"versionStatus\":\"kubzq\",\"version\":\"dlrkvitzk\",\"registerTime\":\"2021-11-08T06:32:59Z\",\"lastConnectTime\":\"2021-04-07T03:33:39Z\",\"expiryTime\":\"2021-02-19T10:39:22Z\",\"lastStartTime\":\"2021-11-26T11:08:51Z\",\"lastStopTime\":\"2021-01-21T13:21:41Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-04-13T20:26:39Z\",\"lastEndUpdateTime\":\"2021-08-26T10:49:52Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1165715853,\"maxConcurrentJobs\":201253191,\"\":{\"ulqfpqqll\":\"datahpvarumvuwj\",\"raczvtniwfcubw\":\"datavzlhjgmrodblap\",\"ceg\":\"dataxmyibx\"}},{\"nodeName\":\"tgxkxtcxb\",\"machineName\":\"beyqohvi\",\"hostServiceUri\":\"pjfkr\",\"status\":\"InitializeFailed\",\"capabilities\":{\"ocjasuame\":\"lgbvtpxowgoww\",\"esloblit\":\"jkfiszhexumfav\",\"trztogujg\":\"rrsjscosanjso\"},\"versionStatus\":\"clxhwkzfggs\",\"version\":\"kvdantpzuiwa\",\"registerTime\":\"2021-08-04T05:42:18Z\",\"lastConnectTime\":\"2021-08-22T07:40:35Z\",\"expiryTime\":\"2021-06-25T02:31:13Z\",\"lastStartTime\":\"2021-07-21T07:45:13Z\",\"lastStopTime\":\"2021-06-24T14:20:53Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-06-22T12:30:30Z\",\"lastEndUpdateTime\":\"2021-12-06T12:52:42Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1481970214,\"maxConcurrentJobs\":347395039,\"\":{\"juwgw\":\"datakpoidfzwegvu\",\"cfsssmyaemkrh\":\"dataccvufjqv\",\"qcpenob\":\"datasdgktluifiqg\",\"ufzsautbric\":\"dataysbeespqbvvaersz\"}},{\"nodeName\":\"ofenin\",\"machineName\":\"unhy\",\"hostServiceUri\":\"xckdlxjpisrdn\",\"status\":\"Initializing\",\"capabilities\":{\"fvijnu\":\"be\",\"lghkvoxdpor\":\"xfiiytqxewjsyute\",\"vbkutogecyqoy\":\"k\"},\"versionStatus\":\"ssbvqnpwdwdmu\",\"version\":\"a\",\"registerTime\":\"2021-11-15T19:44:59Z\",\"lastConnectTime\":\"2021-11-27T10:02:18Z\",\"expiryTime\":\"2021-07-18T23:19:26Z\",\"lastStartTime\":\"2021-08-07T10:40:29Z\",\"lastStopTime\":\"2021-04-19T19:41:17Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-01-22T09:48:44Z\",\"lastEndUpdateTime\":\"2021-01-24T12:50:02Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1160702084,\"maxConcurrentJobs\":1043840923,\"\":{\"cjni\":\"datahdhfrvsizfwgn\",\"wuuogdkpnmwrfu\":\"dataffwcgjjio\",\"l\":\"datajdebyxqucnbgib\"}}],\"scheduledUpdateDate\":\"2021-03-03T09:06:06Z\",\"updateDelayOffset\":\"kouzyv\",\"localTimeZoneOffset\":\"evbfvxmtsmgkret\",\"capabilities\":{\"oy\":\"rceulbyzzcxsyg\"},\"serviceUrls\":[\"kdpzbrxbmlj\"],\"autoUpdate\":\"On\",\"versionStatus\":\"jleuxixkps\",\"links\":[{\"name\":\"nimqoa\",\"subscriptionId\":\"qzxjziqcsotwqtk\",\"dataFactoryName\":\"cdefqoermgmg\",\"dataFactoryLocation\":\"daxao\",\"createTime\":\"2021-11-20T12:07:58Z\"},{\"name\":\"cmmmbipysehyybo\",\"subscriptionId\":\"jcvmkkbp\",\"dataFactoryName\":\"iwdyyhdt\",\"dataFactoryLocation\":\"mbrwqwvcwc\",\"createTime\":\"2021-05-19T23:17:23Z\"},{\"name\":\"trgpd\",\"subscriptionId\":\"t\",\"dataFactoryName\":\"hyfwjfqktuzr\",\"dataFactoryLocation\":\"pecsdk\",\"createTime\":\"2021-03-28T12:44:10Z\"}],\"pushedVersion\":\"bvttqjntvhnj\",\"latestVersion\":\"hjlugcupcyfrhoo\",\"autoUpdateETA\":\"2021-09-05T04:43:39Z\",\"selfContainedInteractiveAuthoringEnabled\":true}")
                .toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model =
            new SelfHostedIntegrationRuntimeStatusTypeProperties()
                .withNodes(
                    Arrays
                        .asList(
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "a",
                                        "lastStartUpdateTime",
                                        "2021-09-19T12:13:02Z",
                                        "lastConnectTime",
                                        "2021-06-28T14:03:07Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"ltniuiimerffhgvc\":\"veuxgmigsoeb\",\"feudbobmoljirch\":\"mddoeilhgga\",\"vccquajpoipdjxyo\":\"wlzi\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "uzbbhxncs",
                                        "registerTime",
                                        "2021-10-13T01:30:26Z",
                                        "maxConcurrentJobs",
                                        1561686443,
                                        "lastStopTime",
                                        "2021-06-16T13:23:22Z",
                                        "version",
                                        "fszkrlkosjwrrets",
                                        "machineName",
                                        "wedbpirbz",
                                        "versionStatus",
                                        "vraxhnto",
                                        "concurrentJobsLimit",
                                        1049765252,
                                        "lastEndUpdateTime",
                                        "2021-09-13T03:41:11Z",
                                        "expiryTime",
                                        "2021-04-17T06:24:34Z",
                                        "lastStartTime",
                                        "2021-06-06T15:54:39Z",
                                        "lastUpdateResult",
                                        "Succeed",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "InitializeFailed")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "vxdvphxmw",
                                        "lastStartUpdateTime",
                                        "2021-04-13T20:26:39Z",
                                        "lastConnectTime",
                                        "2021-04-07T03:33:39Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"gunrukcyyaa\":\"y\"}", Object.class, SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "bogsfov",
                                        "registerTime",
                                        "2021-11-08T06:32:59Z",
                                        "maxConcurrentJobs",
                                        201253191,
                                        "lastStopTime",
                                        "2021-01-21T13:21:41Z",
                                        "version",
                                        "dlrkvitzk",
                                        "machineName",
                                        "xcaicb",
                                        "versionStatus",
                                        "kubzq",
                                        "concurrentJobsLimit",
                                        1165715853,
                                        "lastEndUpdateTime",
                                        "2021-08-26T10:49:52Z",
                                        "expiryTime",
                                        "2021-02-19T10:39:22Z",
                                        "lastStartTime",
                                        "2021-11-26T11:08:51Z",
                                        "lastUpdateResult",
                                        "Fail",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "Initializing")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "tgxkxtcxb",
                                        "lastStartUpdateTime",
                                        "2021-06-22T12:30:30Z",
                                        "lastConnectTime",
                                        "2021-08-22T07:40:35Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"ocjasuame\":\"lgbvtpxowgoww\",\"esloblit\":\"jkfiszhexumfav\",\"trztogujg\":\"rrsjscosanjso\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "pjfkr",
                                        "registerTime",
                                        "2021-08-04T05:42:18Z",
                                        "maxConcurrentJobs",
                                        347395039,
                                        "lastStopTime",
                                        "2021-06-24T14:20:53Z",
                                        "version",
                                        "kvdantpzuiwa",
                                        "machineName",
                                        "beyqohvi",
                                        "versionStatus",
                                        "clxhwkzfggs",
                                        "concurrentJobsLimit",
                                        1481970214,
                                        "lastEndUpdateTime",
                                        "2021-12-06T12:52:42Z",
                                        "expiryTime",
                                        "2021-06-25T02:31:13Z",
                                        "lastStartTime",
                                        "2021-07-21T07:45:13Z",
                                        "lastUpdateResult",
                                        "Fail",
                                        "isActiveDispatcher",
                                        true,
                                        "status",
                                        "InitializeFailed")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "ofenin",
                                        "lastStartUpdateTime",
                                        "2021-01-22T09:48:44Z",
                                        "lastConnectTime",
                                        "2021-11-27T10:02:18Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"fvijnu\":\"be\",\"lghkvoxdpor\":\"xfiiytqxewjsyute\",\"vbkutogecyqoy\":\"k\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "xckdlxjpisrdn",
                                        "registerTime",
                                        "2021-11-15T19:44:59Z",
                                        "maxConcurrentJobs",
                                        1043840923,
                                        "lastStopTime",
                                        "2021-04-19T19:41:17Z",
                                        "version",
                                        "a",
                                        "machineName",
                                        "unhy",
                                        "versionStatus",
                                        "ssbvqnpwdwdmu",
                                        "concurrentJobsLimit",
                                        1160702084,
                                        "lastEndUpdateTime",
                                        "2021-01-24T12:50:02Z",
                                        "expiryTime",
                                        "2021-07-18T23:19:26Z",
                                        "lastStartTime",
                                        "2021-08-07T10:40:29Z",
                                        "lastUpdateResult",
                                        "Fail",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "Initializing"))))
                .withLinks(
                    Arrays
                        .asList(
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
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
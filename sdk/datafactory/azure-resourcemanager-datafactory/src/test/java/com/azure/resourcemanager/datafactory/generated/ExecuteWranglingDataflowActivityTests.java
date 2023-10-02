// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.ExecuteWranglingDataflowActivity;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExecuteWranglingDataflowActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecuteWranglingDataflowActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"ExecuteWranglingDataflow\",\"typeProperties\":{\"sinks\":{\"bsx\":{\"script\":\"ttefbbrklofkvsh\",\"schemaLinkedService\":{\"referenceName\":\"j\",\"parameters\":{\"acb\":\"datawvdohocsgktfzst\",\"exlhlkpie\":\"datakcxevitvbzy\",\"sibtdmg\":\"datacrtvdcbzpyned\",\"aawehxshamzfx\":\"dataxo\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"uvjbpyvoswgkbzrm\",\"parameters\":{\"uiags\":\"datagvfu\"}},\"name\":\"vzghnq\",\"description\":\"eykvgfhu\",\"dataset\":{\"referenceName\":\"otzygqdcai\",\"parameters\":{\"ynunrajtbumaid\":\"datarytkmfhbpcr\"}},\"linkedService\":{\"referenceName\":\"nyvyutcv\",\"parameters\":{\"j\":\"datagt\",\"xkdqqombiaoaqwwo\":\"datacgtlttnjpgxuxkce\",\"frau\":\"dataxnu\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"tjhtqb\",\"datasetParameters\":\"datadpnzqqti\",\"parameters\":{\"qfkiguk\":\"dataeanakk\",\"nwaymrlvhl\":\"dataximw\"},\"\":{\"aubi\":\"dataiqendtyccnghsz\",\"bqe\":\"dataizjbwufjogsw\",\"etaydhfgxyd\":\"databpypwrvnv\"}}},\"ywdtgz\":{\"script\":\"js\",\"schemaLinkedService\":{\"referenceName\":\"u\",\"parameters\":{\"rtgofpsrhou\":\"datafzyvx\",\"ksehtyxtgsurfnkt\":\"datakcpyerfsngtrijbo\",\"ltc\":\"datahtzrzdqqoydr\",\"kqwffcvahknvnfp\":\"datattjibognhuq\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"obhkqgbijzoixu\",\"parameters\":{\"vajbgpu\":\"datalscnknkukempa\"}},\"name\":\"kstkankzyqizxujl\",\"description\":\"htrgybfumo\",\"dataset\":{\"referenceName\":\"qrut\",\"parameters\":{\"pyrzazkalj\":\"dataynwwml\",\"oaepbfntg\":\"datavmknwlbz\"}},\"linkedService\":{\"referenceName\":\"ungueggphwgix\",\"parameters\":{\"vkoynjucmyjblafv\":\"datavwmvafhriuaaqg\",\"qenbgymgjneoh\":\"datandkvbc\",\"bhg\":\"datakis\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"jodskqyjsdxgefk\",\"datasetParameters\":\"datafihetor\",\"parameters\":{\"rqagpjociunndgp\":\"datafuw\"},\"\":{\"iqzagfkk\":\"datakwyzqnlqzymivjka\"}}},\"xnafojtqqqc\":{\"script\":\"qflpuxy\",\"schemaLinkedService\":{\"referenceName\":\"ofrsoeshqttkq\",\"parameters\":{\"smnyfahidlscdow\":\"datalootceit\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"rniyjqzjtdk\",\"parameters\":{\"odcopirgdsqcbxkw\":\"datax\",\"hyqj\":\"datanqsybwjvifgjztzh\",\"rbirv\":\"dataga\"}},\"name\":\"xubbnb\",\"description\":\"yeggaauubkr\",\"dataset\":{\"referenceName\":\"hkwwibxjpyt\",\"parameters\":{\"elujwcy\":\"datahva\"}},\"linkedService\":{\"referenceName\":\"xbqu\",\"parameters\":{\"c\":\"datarfxir\",\"hfzuraqpcs\":\"dataggwzvdqpxicpoz\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"rdkdomyqbeasbvz\",\"datasetParameters\":\"datakzu\",\"parameters\":{\"wbmfq\":\"dataudqgf\"},\"\":{\"ovqtvbusyqyfit\":\"dataaqltoxhfphaw\",\"ikdcjmbwrhpw\":\"dataprbmmfqteox\",\"dsrwhjhivgeran\":\"dataudegykzdspbjks\"}}}},\"queries\":[{\"queryName\":\"duspxijrr\",\"dataflowSinks\":[{\"script\":\"qcgyvzpvzsdu\",\"schemaLinkedService\":{\"referenceName\":\"ybjucfs\"},\"rejectedDataLinkedService\":{\"referenceName\":\"kq\"},\"name\":\"gfyjwxwpoywymt\",\"description\":\"zdgbgcxyzrzh\",\"dataset\":{\"referenceName\":\"mwcgiahrftpgqx\"},\"linkedService\":{\"referenceName\":\"oak\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"lzalsujezgzsekb\"}},{\"script\":\"dbmfejt\",\"schemaLinkedService\":{\"referenceName\":\"oacnyacjyp\"},\"rejectedDataLinkedService\":{\"referenceName\":\"hf\"},\"name\":\"ypykjorlrj\",\"description\":\"zxaamibhkaqz\",\"dataset\":{\"referenceName\":\"jqslshceyhalbxr\"},\"linkedService\":{\"referenceName\":\"snffcoatsupa\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"thojrtcdavlrifm\"}},{\"script\":\"ewez\",\"schemaLinkedService\":{\"referenceName\":\"parjrxi\"},\"rejectedDataLinkedService\":{\"referenceName\":\"v\"},\"name\":\"oze\",\"description\":\"zkcigykea\",\"dataset\":{\"referenceName\":\"umhzgdsjbla\"},\"linkedService\":{\"referenceName\":\"shdubqhafxl\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"wnkhiwqiq\"}}]},{\"queryName\":\"wbormfnntpocf\",\"dataflowSinks\":[{\"script\":\"sfdohytkhq\",\"schemaLinkedService\":{\"referenceName\":\"dyz\"},\"rejectedDataLinkedService\":{\"referenceName\":\"hqmttswpeaivbz\"},\"name\":\"msoe\",\"description\":\"wjimrzavcif\",\"dataset\":{\"referenceName\":\"ameccuqko\"},\"linkedService\":{\"referenceName\":\"fiomdiecrbcv\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"dsyxabddjbzoh\"}},{\"script\":\"qtxluqpzwlbccxj\",\"schemaLinkedService\":{\"referenceName\":\"loihj\"},\"rejectedDataLinkedService\":{\"referenceName\":\"nfvpav\"},\"name\":\"aeeiboqc\",\"description\":\"nxuiiprfijmilo\",\"dataset\":{\"referenceName\":\"dxsphfjzxeswzg\"},\"linkedService\":{\"referenceName\":\"lgggjt\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"olxbggojoemtwehv\"}},{\"script\":\"tngatglarczzguar\",\"schemaLinkedService\":{\"referenceName\":\"fab\"},\"rejectedDataLinkedService\":{\"referenceName\":\"eahypjqag\"},\"name\":\"eujuclff\",\"description\":\"djfwsib\",\"dataset\":{\"referenceName\":\"btmwaexybrh\"},\"linkedService\":{\"referenceName\":\"cxh\"},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"abnpdnbtymhheu\"}}]}],\"dataFlow\":{\"type\":\"DataFlowReference\",\"referenceName\":\"mwixyrvrpu\",\"datasetParameters\":\"datau\",\"parameters\":{\"gteihmvxupqfaww\":\"datay\",\"snynvgf\":\"dataxqjhmfyvgmdwv\"},\"\":{\"ndekpzgdr\":\"dataoki\",\"ot\":\"dataddzkkik\",\"tqoxethrxlpgrvtz\":\"datavxyeqdinwqse\"}},\"staging\":{\"linkedService\":{\"referenceName\":\"ns\",\"parameters\":{\"smhoviear\":\"dataqwylh\",\"ben\":\"datakdaomxyx\"}},\"folderPath\":\"datatxhx\"},\"integrationRuntime\":{\"referenceName\":\"knmrcel\",\"parameters\":{\"lfniislohftmf\":\"datadxwywdyqpkwbwo\"}},\"compute\":{\"computeType\":\"datax\",\"coreCount\":\"dataaicyvtsgopmatub\"},\"traceLevel\":\"datajipqynrlnq\",\"continueOnError\":\"dataoelqfsfxthcdzeu\",\"runConcurrently\":\"dataqkvfthbni\",\"sourceStagingConcurrency\":\"dataybrsofpwqmt\"},\"policy\":{\"timeout\":\"datakubymiszoxmzvl\",\"retry\":\"datazdnv\",\"retryIntervalInSeconds\":219796390,\"secureInput\":true,\"secureOutput\":true,\"\":{\"xtxgrh\":\"dataafcxpvxrqegkw\",\"sb\":\"dataqbstodeu\"}},\"name\":\"dcoqm\",\"description\":\"feqlwkpv\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"xccnfykn\",\"dependencyConditions\":[\"Skipped\",\"Failed\",\"Completed\"],\"\":{\"kqmlldeksgejmpkq\":\"dataeqse\",\"qhpkaamoovrb\":\"datajacnbep\",\"gxvkzhqpkckwaaf\":\"databuoqbclhnlqxuxr\"}},{\"activity\":\"yscjawqhpijur\",\"dependencyConditions\":[\"Completed\",\"Failed\"],\"\":{\"j\":\"databjivm\",\"jjzsijmsa\":\"datakvfur\",\"mnvukovxfkxnevc\":\"datacnbluxomzgq\"}}],\"userProperties\":[{\"name\":\"iopgyunfmoc\",\"value\":\"dataycgdkikpqmdi\"},{\"name\":\"hmpmfakinode\",\"value\":\"datappcpwcxfn\"},{\"name\":\"ys\",\"value\":\"datavxaymxldorqp\"},{\"name\":\"jevu\",\"value\":\"datayzglssogze\"}],\"\":{\"bguewtcq\":\"datavir\"}}")
                .toObject(ExecuteWranglingDataflowActivity.class);
        Assertions.assertEquals("dcoqm", model.name());
        Assertions.assertEquals("feqlwkpv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("xccnfykn", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("iopgyunfmoc", model.userProperties().get(0).name());
        Assertions.assertEquals(219796390, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("vzghnq", model.sinks().get("bsx").name());
        Assertions.assertEquals("eykvgfhu", model.sinks().get("bsx").description());
        Assertions.assertEquals("otzygqdcai", model.sinks().get("bsx").dataset().referenceName());
        Assertions.assertEquals("nyvyutcv", model.sinks().get("bsx").linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get("bsx").flowlet().type());
        Assertions.assertEquals("tjhtqb", model.sinks().get("bsx").flowlet().referenceName());
        Assertions.assertEquals("j", model.sinks().get("bsx").schemaLinkedService().referenceName());
        Assertions
            .assertEquals("uvjbpyvoswgkbzrm", model.sinks().get("bsx").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("ttefbbrklofkvsh", model.sinks().get("bsx").script());
        Assertions.assertEquals("duspxijrr", model.queries().get(0).queryName());
        Assertions.assertEquals("gfyjwxwpoywymt", model.queries().get(0).dataflowSinks().get(0).name());
        Assertions.assertEquals("zdgbgcxyzrzh", model.queries().get(0).dataflowSinks().get(0).description());
        Assertions
            .assertEquals("mwcgiahrftpgqx", model.queries().get(0).dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("oak", model.queries().get(0).dataflowSinks().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(
                DataFlowReferenceType.DATA_FLOW_REFERENCE,
                model.queries().get(0).dataflowSinks().get(0).flowlet().type());
        Assertions
            .assertEquals("lzalsujezgzsekb", model.queries().get(0).dataflowSinks().get(0).flowlet().referenceName());
        Assertions
            .assertEquals(
                "ybjucfs", model.queries().get(0).dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions
            .assertEquals(
                "kq", model.queries().get(0).dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("qcgyvzpvzsdu", model.queries().get(0).dataflowSinks().get(0).script());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("mwixyrvrpu", model.dataFlow().referenceName());
        Assertions.assertEquals("ns", model.staging().linkedService().referenceName());
        Assertions.assertEquals("knmrcel", model.integrationRuntime().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecuteWranglingDataflowActivity model =
            new ExecuteWranglingDataflowActivity()
                .withName("dcoqm")
                .withDescription("feqlwkpv")
                .withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("xccnfykn")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("yscjawqhpijur")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("iopgyunfmoc").withValue("dataycgdkikpqmdi"),
                            new UserProperty().withName("hmpmfakinode").withValue("datappcpwcxfn"),
                            new UserProperty().withName("ys").withValue("datavxaymxldorqp"),
                            new UserProperty().withName("jevu").withValue("datayzglssogze")))
                .withPolicy(
                    new ActivityPolicy()
                        .withTimeout("datakubymiszoxmzvl")
                        .withRetry("datazdnv")
                        .withRetryIntervalInSeconds(219796390)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withSinks(
                    mapOf(
                        "bsx",
                        new PowerQuerySink()
                            .withName("vzghnq")
                            .withDescription("eykvgfhu")
                            .withDataset(
                                new DatasetReference()
                                    .withReferenceName("otzygqdcai")
                                    .withParameters(mapOf("ynunrajtbumaid", "datarytkmfhbpcr")))
                            .withLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("nyvyutcv")
                                    .withParameters(
                                        mapOf(
                                            "j",
                                            "datagt",
                                            "xkdqqombiaoaqwwo",
                                            "datacgtlttnjpgxuxkce",
                                            "frau",
                                            "dataxnu")))
                            .withFlowlet(
                                new DataFlowReference()
                                    .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("tjhtqb")
                                    .withDatasetParameters("datadpnzqqti")
                                    .withParameters(mapOf("qfkiguk", "dataeanakk", "nwaymrlvhl", "dataximw"))
                                    .withAdditionalProperties(mapOf()))
                            .withSchemaLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("j")
                                    .withParameters(
                                        mapOf(
                                            "acb",
                                            "datawvdohocsgktfzst",
                                            "exlhlkpie",
                                            "datakcxevitvbzy",
                                            "sibtdmg",
                                            "datacrtvdcbzpyned",
                                            "aawehxshamzfx",
                                            "dataxo")))
                            .withRejectedDataLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("uvjbpyvoswgkbzrm")
                                    .withParameters(mapOf("uiags", "datagvfu")))
                            .withScript("ttefbbrklofkvsh"),
                        "ywdtgz",
                        new PowerQuerySink()
                            .withName("kstkankzyqizxujl")
                            .withDescription("htrgybfumo")
                            .withDataset(
                                new DatasetReference()
                                    .withReferenceName("qrut")
                                    .withParameters(mapOf("pyrzazkalj", "dataynwwml", "oaepbfntg", "datavmknwlbz")))
                            .withLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("ungueggphwgix")
                                    .withParameters(
                                        mapOf(
                                            "vkoynjucmyjblafv",
                                            "datavwmvafhriuaaqg",
                                            "qenbgymgjneoh",
                                            "datandkvbc",
                                            "bhg",
                                            "datakis")))
                            .withFlowlet(
                                new DataFlowReference()
                                    .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("jodskqyjsdxgefk")
                                    .withDatasetParameters("datafihetor")
                                    .withParameters(mapOf("rqagpjociunndgp", "datafuw"))
                                    .withAdditionalProperties(mapOf()))
                            .withSchemaLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("u")
                                    .withParameters(
                                        mapOf(
                                            "rtgofpsrhou",
                                            "datafzyvx",
                                            "ksehtyxtgsurfnkt",
                                            "datakcpyerfsngtrijbo",
                                            "ltc",
                                            "datahtzrzdqqoydr",
                                            "kqwffcvahknvnfp",
                                            "datattjibognhuq")))
                            .withRejectedDataLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("obhkqgbijzoixu")
                                    .withParameters(mapOf("vajbgpu", "datalscnknkukempa")))
                            .withScript("js"),
                        "xnafojtqqqc",
                        new PowerQuerySink()
                            .withName("xubbnb")
                            .withDescription("yeggaauubkr")
                            .withDataset(
                                new DatasetReference()
                                    .withReferenceName("hkwwibxjpyt")
                                    .withParameters(mapOf("elujwcy", "datahva")))
                            .withLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("xbqu")
                                    .withParameters(mapOf("c", "datarfxir", "hfzuraqpcs", "dataggwzvdqpxicpoz")))
                            .withFlowlet(
                                new DataFlowReference()
                                    .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("rdkdomyqbeasbvz")
                                    .withDatasetParameters("datakzu")
                                    .withParameters(mapOf("wbmfq", "dataudqgf"))
                                    .withAdditionalProperties(mapOf()))
                            .withSchemaLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("ofrsoeshqttkq")
                                    .withParameters(mapOf("smnyfahidlscdow", "datalootceit")))
                            .withRejectedDataLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("rniyjqzjtdk")
                                    .withParameters(
                                        mapOf(
                                            "odcopirgdsqcbxkw",
                                            "datax",
                                            "hyqj",
                                            "datanqsybwjvifgjztzh",
                                            "rbirv",
                                            "dataga")))
                            .withScript("qflpuxy")))
                .withQueries(
                    Arrays
                        .asList(
                            new PowerQuerySinkMapping()
                                .withQueryName("duspxijrr")
                                .withDataflowSinks(
                                    Arrays
                                        .asList(
                                            new PowerQuerySink()
                                                .withName("gfyjwxwpoywymt")
                                                .withDescription("zdgbgcxyzrzh")
                                                .withDataset(new DatasetReference().withReferenceName("mwcgiahrftpgqx"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("oak"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("lzalsujezgzsekb")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("ybjucfs"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("kq"))
                                                .withScript("qcgyvzpvzsdu"),
                                            new PowerQuerySink()
                                                .withName("ypykjorlrj")
                                                .withDescription("zxaamibhkaqz")
                                                .withDataset(
                                                    new DatasetReference().withReferenceName("jqslshceyhalbxr"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("snffcoatsupa"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("thojrtcdavlrifm")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("oacnyacjyp"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("hf"))
                                                .withScript("dbmfejt"),
                                            new PowerQuerySink()
                                                .withName("oze")
                                                .withDescription("zkcigykea")
                                                .withDataset(new DatasetReference().withReferenceName("umhzgdsjbla"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("shdubqhafxl"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("wnkhiwqiq")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("parjrxi"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("v"))
                                                .withScript("ewez"))),
                            new PowerQuerySinkMapping()
                                .withQueryName("wbormfnntpocf")
                                .withDataflowSinks(
                                    Arrays
                                        .asList(
                                            new PowerQuerySink()
                                                .withName("msoe")
                                                .withDescription("wjimrzavcif")
                                                .withDataset(new DatasetReference().withReferenceName("ameccuqko"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("fiomdiecrbcv"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("dsyxabddjbzoh")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("dyz"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("hqmttswpeaivbz"))
                                                .withScript("sfdohytkhq"),
                                            new PowerQuerySink()
                                                .withName("aeeiboqc")
                                                .withDescription("nxuiiprfijmilo")
                                                .withDataset(new DatasetReference().withReferenceName("dxsphfjzxeswzg"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("lgggjt"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("olxbggojoemtwehv")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("loihj"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("nfvpav"))
                                                .withScript("qtxluqpzwlbccxj"),
                                            new PowerQuerySink()
                                                .withName("eujuclff")
                                                .withDescription("djfwsib")
                                                .withDataset(new DatasetReference().withReferenceName("btmwaexybrh"))
                                                .withLinkedService(
                                                    new LinkedServiceReference().withReferenceName("cxh"))
                                                .withFlowlet(
                                                    new DataFlowReference()
                                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                                        .withReferenceName("abnpdnbtymhheu")
                                                        .withAdditionalProperties(mapOf()))
                                                .withSchemaLinkedService(
                                                    new LinkedServiceReference().withReferenceName("fab"))
                                                .withRejectedDataLinkedService(
                                                    new LinkedServiceReference().withReferenceName("eahypjqag"))
                                                .withScript("tngatglarczzguar")))))
                .withDataFlow(
                    new DataFlowReference()
                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("mwixyrvrpu")
                        .withDatasetParameters("datau")
                        .withParameters(mapOf("gteihmvxupqfaww", "datay", "snynvgf", "dataxqjhmfyvgmdwv"))
                        .withAdditionalProperties(mapOf()))
                .withStaging(
                    new DataFlowStagingInfo()
                        .withLinkedService(
                            new LinkedServiceReference()
                                .withReferenceName("ns")
                                .withParameters(mapOf("smhoviear", "dataqwylh", "ben", "datakdaomxyx")))
                        .withFolderPath("datatxhx"))
                .withIntegrationRuntime(
                    new IntegrationRuntimeReference()
                        .withReferenceName("knmrcel")
                        .withParameters(mapOf("lfniislohftmf", "datadxwywdyqpkwbwo")))
                .withCompute(
                    new ExecuteDataFlowActivityTypePropertiesCompute()
                        .withComputeType("datax")
                        .withCoreCount("dataaicyvtsgopmatub"))
                .withTraceLevel("datajipqynrlnq")
                .withContinueOnError("dataoelqfsfxthcdzeu")
                .withRunConcurrently("dataqkvfthbni")
                .withSourceStagingConcurrency("dataybrsofpwqmt");
        model = BinaryData.fromObject(model).toObject(ExecuteWranglingDataflowActivity.class);
        Assertions.assertEquals("dcoqm", model.name());
        Assertions.assertEquals("feqlwkpv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("xccnfykn", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("iopgyunfmoc", model.userProperties().get(0).name());
        Assertions.assertEquals(219796390, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("vzghnq", model.sinks().get("bsx").name());
        Assertions.assertEquals("eykvgfhu", model.sinks().get("bsx").description());
        Assertions.assertEquals("otzygqdcai", model.sinks().get("bsx").dataset().referenceName());
        Assertions.assertEquals("nyvyutcv", model.sinks().get("bsx").linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get("bsx").flowlet().type());
        Assertions.assertEquals("tjhtqb", model.sinks().get("bsx").flowlet().referenceName());
        Assertions.assertEquals("j", model.sinks().get("bsx").schemaLinkedService().referenceName());
        Assertions
            .assertEquals("uvjbpyvoswgkbzrm", model.sinks().get("bsx").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("ttefbbrklofkvsh", model.sinks().get("bsx").script());
        Assertions.assertEquals("duspxijrr", model.queries().get(0).queryName());
        Assertions.assertEquals("gfyjwxwpoywymt", model.queries().get(0).dataflowSinks().get(0).name());
        Assertions.assertEquals("zdgbgcxyzrzh", model.queries().get(0).dataflowSinks().get(0).description());
        Assertions
            .assertEquals("mwcgiahrftpgqx", model.queries().get(0).dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("oak", model.queries().get(0).dataflowSinks().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(
                DataFlowReferenceType.DATA_FLOW_REFERENCE,
                model.queries().get(0).dataflowSinks().get(0).flowlet().type());
        Assertions
            .assertEquals("lzalsujezgzsekb", model.queries().get(0).dataflowSinks().get(0).flowlet().referenceName());
        Assertions
            .assertEquals(
                "ybjucfs", model.queries().get(0).dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions
            .assertEquals(
                "kq", model.queries().get(0).dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("qcgyvzpvzsdu", model.queries().get(0).dataflowSinks().get(0).script());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("mwixyrvrpu", model.dataFlow().referenceName());
        Assertions.assertEquals("ns", model.staging().linkedService().referenceName());
        Assertions.assertEquals("knmrcel", model.integrationRuntime().referenceName());
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
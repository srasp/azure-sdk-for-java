// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowSink;
import com.azure.resourcemanager.datafactory.models.DataFlowSource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.Flowlet;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FlowletTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Flowlet model =
            BinaryData
                .fromString(
                    "{\"type\":\"Flowlet\",\"typeProperties\":{\"sources\":[{\"schemaLinkedService\":{\"referenceName\":\"pnw\",\"parameters\":{\"ffffg\":\"datafvpctfji\",\"ejjk\":\"datauhznwhvuldbk\",\"azmxjqi\":\"dataigaw\"}},\"name\":\"h\",\"description\":\"jsbcml\",\"dataset\":{\"referenceName\":\"ahz\",\"parameters\":{\"hmojusuzg\":\"dataroolkolir\",\"aaxoialahfxwcc\":\"datajzc\",\"kczynuhhoqeqsh\":\"datakdxkuk\",\"q\":\"datavl\"}},\"linkedService\":{\"referenceName\":\"yrqolnthbbnkgz\",\"parameters\":{\"eyjncjmlfuy\":\"datadrnzkjthf\",\"rufzcqyjmq\":\"datajbpfiddh\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"iocuselqkr\",\"datasetParameters\":\"datazrhxuddqmdtf\",\"parameters\":{\"khmwdmd\":\"datajmr\",\"okwtjawhvagnqfqq\":\"datagyqi\"},\"\":{\"chtvsnvlaqd\":\"datavmyolcaym\",\"zawatuwqkokbc\":\"dataz\",\"msn\":\"dataothymgobl\",\"aaneakhtmhobcya\":\"datagwi\"}}}],\"sinks\":[{\"schemaLinkedService\":{\"referenceName\":\"qtvkh\",\"parameters\":{\"ymhcctopuo\":\"dataogxkfnaoa\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"rnskby\",\"parameters\":{\"xqnwhscoz\":\"datahczygxvhajpxe\",\"ljfewxqo\":\"datawmvgxsmpknpwir\"}},\"name\":\"oxudnmckap\",\"description\":\"knq\",\"dataset\":{\"referenceName\":\"jgencdgmoque\",\"parameters\":{\"ltjouwhldxwh\":\"datakkyo\",\"q\":\"dataepr\",\"cvprst\":\"datasmfx\"}},\"linkedService\":{\"referenceName\":\"itbfjtdy\",\"parameters\":{\"etjt\":\"dataplfacqoccqrqx\",\"oadtxopgehpadkmd\":\"datarhutf\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"szxvctkbbxuhar\",\"datasetParameters\":\"datair\",\"parameters\":{\"bmyqjog\":\"datalabvoyngsuxxc\",\"rntu\":\"datadsaidjanormovdxx\"},\"\":{\"nwemhdeeljslkyo\":\"datail\",\"fzjuegrhrhtsl\":\"datad\",\"j\":\"datajtv\"}}},{\"schemaLinkedService\":{\"referenceName\":\"vgjbfio\",\"parameters\":{\"cbjqqwmtqsm\":\"datajod\",\"cywnfyszza\":\"dataxsazuxejgw\",\"ozsyvrm\":\"datazsinqbdnddb\",\"eeih\":\"datajmyitrchwudl\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"mnoejhqlfmsib\",\"parameters\":{\"mypgfqvmty\":\"datarfgxkyd\",\"kxp\":\"datahl\"}},\"name\":\"jpewpyjlfx\",\"description\":\"pqcrzgeuqxbpiat\",\"dataset\":{\"referenceName\":\"aujegqdtadra\",\"parameters\":{\"gsq\":\"datadhjkrukizy\",\"qfpjb\":\"datanqskt\"}},\"linkedService\":{\"referenceName\":\"gweeiwd\",\"parameters\":{\"gbfzu\":\"datan\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"tunmlhxd\",\"datasetParameters\":\"dataklciichgjsysm\",\"parameters\":{\"bdujgcwxvecbb\":\"datadgwxfkzsifcu\"},\"\":{\"kpgdqxwabzrwiq\":\"datardxrizagbbgiarks\",\"kifmmainw\":\"dataxhaclcdosqkptjq\"}}},{\"schemaLinkedService\":{\"referenceName\":\"d\",\"parameters\":{\"gvydjufbnklblaxp\":\"databqwuntobuizazzel\",\"lfdxaglz\":\"datagjwdab\",\"siflikyypzkgxf\":\"dataytlbtlqhopxouvm\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"myrqsdbpokszan\",\"parameters\":{\"kirkskw\":\"datagpterdiu\",\"olzkgys\":\"datatsdetjygowifcq\",\"zoxlvoc\":\"datagzyy\"}},\"name\":\"tvdxxhe\",\"description\":\"mlil\",\"dataset\":{\"referenceName\":\"ghjhjvmabzzbwa\",\"parameters\":{\"apr\":\"datamdafbgymqt\",\"neychbjizq\":\"dataojxrjnbsconxavi\",\"rfbo\":\"datasgnwdxzedpq\",\"mlnfyz\":\"dataxi\"}},\"linkedService\":{\"referenceName\":\"frbypi\",\"parameters\":{\"aq\":\"datakpdj\",\"dgonjhxshthmgp\":\"datasmqaz\",\"pxtzhigqqbtimpk\":\"datazqulptkbv\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"o\",\"datasetParameters\":\"datas\",\"parameters\":{\"jakx\":\"datahudsmusuaa\",\"vqban\":\"datajnfczmnniixy\",\"gm\":\"datasjtgirnbgmgmddo\",\"yxwe\":\"datanltwmpftmfoeajog\"},\"\":{\"hdidrmuhkahmjedb\":\"datafddrvlkpzwbhnrec\"}}}],\"transformations\":[{\"name\":\"vkhhwm\",\"description\":\"jbweunxcqr\",\"dataset\":{\"referenceName\":\"hu\",\"parameters\":{\"gnzuzpbgkzcsc\":\"datahppiybx\",\"ti\":\"dataiuzvkunhdimju\"}},\"linkedService\":{\"referenceName\":\"kaugpucdocfqplwg\",\"parameters\":{\"jlvzklk\":\"datahxw\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"ikyjtkakvlb\",\"datasetParameters\":\"datahjvpzaptu\",\"parameters\":{\"fgcdiykkcxw\":\"dataaoizjix\",\"dmuqohhi\":\"dataujvqynvavit\",\"ddrwjcljbrhlhpvz\":\"dataraxq\"},\"\":{\"fhxrzfr\":\"datawennin\",\"rcqxgcbvzarmqc\":\"datavztiucwviqllukh\",\"stsinvag\":\"datapo\"}}},{\"name\":\"vjyhdrxbrdvc\",\"description\":\"qwh\",\"dataset\":{\"referenceName\":\"xnmxgnmguzb\",\"parameters\":{\"bkbdhlltqstqkqs\":\"dataorbalkj\",\"eubanlxunpqcc\":\"datagxiynecovagzk\",\"klaslga\":\"dataqiawzl\"}},\"linkedService\":{\"referenceName\":\"zuxlrarwpewsau\",\"parameters\":{\"ytnkqb\":\"datajtighsxj\",\"mehjnhjioti\":\"datalahovuuwx\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"bcngkegxc\",\"datasetParameters\":\"dataxbbfetwil\",\"parameters\":{\"frolq\":\"dataoxpdxq\"},\"\":{\"jew\":\"datakiu\",\"tnlmsoodtmvecdhd\":\"dataahwkxjjm\",\"zxvlgsrgkrfizrp\":\"dataswcrptveaj\"}}},{\"name\":\"wlp\",\"description\":\"uqhrlmcskykp\",\"dataset\":{\"referenceName\":\"ofix\",\"parameters\":{\"kkpyycpaw\":\"datacf\",\"cfpcfjfwzlgz\":\"datapjprdpwr\"}},\"linkedService\":{\"referenceName\":\"kgyepe\",\"parameters\":{\"rntmkctdhu\":\"datannidmdiawpzxk\",\"hqodv\":\"datasgwqpsqaz\",\"ti\":\"datagcnbhcbmjk\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"ynts\",\"datasetParameters\":\"datamfmeftvhkmoo\",\"parameters\":{\"gmjgrul\":\"datahskb\"},\"\":{\"z\":\"datagxhcxnwjtpfdzxco\",\"k\":\"datawofw\"}}},{\"name\":\"kzkdtzxsoednlwg\",\"description\":\"hezomucmqgisnion\",\"dataset\":{\"referenceName\":\"bzdrdpuenxkgt\",\"parameters\":{\"hzkbnbmx\":\"datamtrlxczn\",\"itoqcahfsg\":\"dataxmwtygeqzu\",\"lisolntfxxc\":\"datajmlreesrfwsszvlc\"}},\"linkedService\":{\"referenceName\":\"mipfjw\",\"parameters\":{\"nvgskjtoxjd\":\"datagizmshxxbaizabu\",\"xqqm\":\"datajsjznv\",\"aydhf\":\"datai\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"c\",\"datasetParameters\":\"datatfshksnyzm\",\"parameters\":{\"iqdktwtkvih\":\"datamwbwmbnlslce\",\"nguuzhwvla\":\"datapfliwo\",\"mhjhaus\":\"datap\",\"ekymffztsilscvqs\":\"datab\"},\"\":{\"fymkouih\":\"datai\",\"zhogsmgbvmtdw\":\"dataeseuugci\",\"jnfveg\":\"dataqbe\"}}}],\"script\":\"btvkbi\",\"scriptLines\":[\"htfgficudyhizpac\",\"muhbcakznho\"]},\"description\":\"oitwhrjsdmmazdnc\",\"annotations\":[\"datab\"],\"folder\":{\"name\":\"lhzqpxzbawkikcdg\"}}")
                .toObject(Flowlet.class);
        Assertions.assertEquals("oitwhrjsdmmazdnc", model.description());
        Assertions.assertEquals("lhzqpxzbawkikcdg", model.folder().name());
        Assertions.assertEquals("h", model.sources().get(0).name());
        Assertions.assertEquals("jsbcml", model.sources().get(0).description());
        Assertions.assertEquals("ahz", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("yrqolnthbbnkgz", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("iocuselqkr", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("pnw", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("oxudnmckap", model.sinks().get(0).name());
        Assertions.assertEquals("knq", model.sinks().get(0).description());
        Assertions.assertEquals("jgencdgmoque", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("itbfjtdy", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("szxvctkbbxuhar", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("qtvkh", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("rnskby", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("vkhhwm", model.transformations().get(0).name());
        Assertions.assertEquals("jbweunxcqr", model.transformations().get(0).description());
        Assertions.assertEquals("hu", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("kaugpucdocfqplwg", model.transformations().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("ikyjtkakvlb", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("btvkbi", model.script());
        Assertions.assertEquals("htfgficudyhizpac", model.scriptLines().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Flowlet model =
            new Flowlet()
                .withDescription("oitwhrjsdmmazdnc")
                .withAnnotations(Arrays.asList("datab"))
                .withFolder(new DataFlowFolder().withName("lhzqpxzbawkikcdg"))
                .withSources(
                    Arrays
                        .asList(
                            new DataFlowSource()
                                .withName("h")
                                .withDescription("jsbcml")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("ahz")
                                        .withParameters(
                                            mapOf(
                                                "hmojusuzg",
                                                "dataroolkolir",
                                                "aaxoialahfxwcc",
                                                "datajzc",
                                                "kczynuhhoqeqsh",
                                                "datakdxkuk",
                                                "q",
                                                "datavl")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("yrqolnthbbnkgz")
                                        .withParameters(
                                            mapOf("eyjncjmlfuy", "datadrnzkjthf", "rufzcqyjmq", "datajbpfiddh")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("iocuselqkr")
                                        .withDatasetParameters("datazrhxuddqmdtf")
                                        .withParameters(mapOf("khmwdmd", "datajmr", "okwtjawhvagnqfqq", "datagyqi"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("pnw")
                                        .withParameters(
                                            mapOf(
                                                "ffffg",
                                                "datafvpctfji",
                                                "ejjk",
                                                "datauhznwhvuldbk",
                                                "azmxjqi",
                                                "dataigaw")))))
                .withSinks(
                    Arrays
                        .asList(
                            new DataFlowSink()
                                .withName("oxudnmckap")
                                .withDescription("knq")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("jgencdgmoque")
                                        .withParameters(
                                            mapOf("ltjouwhldxwh", "datakkyo", "q", "dataepr", "cvprst", "datasmfx")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("itbfjtdy")
                                        .withParameters(
                                            mapOf("etjt", "dataplfacqoccqrqx", "oadtxopgehpadkmd", "datarhutf")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("szxvctkbbxuhar")
                                        .withDatasetParameters("datair")
                                        .withParameters(
                                            mapOf("bmyqjog", "datalabvoyngsuxxc", "rntu", "datadsaidjanormovdxx"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("qtvkh")
                                        .withParameters(mapOf("ymhcctopuo", "dataogxkfnaoa")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("rnskby")
                                        .withParameters(
                                            mapOf("xqnwhscoz", "datahczygxvhajpxe", "ljfewxqo", "datawmvgxsmpknpwir"))),
                            new DataFlowSink()
                                .withName("jpewpyjlfx")
                                .withDescription("pqcrzgeuqxbpiat")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("aujegqdtadra")
                                        .withParameters(mapOf("gsq", "datadhjkrukizy", "qfpjb", "datanqskt")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("gweeiwd")
                                        .withParameters(mapOf("gbfzu", "datan")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("tunmlhxd")
                                        .withDatasetParameters("dataklciichgjsysm")
                                        .withParameters(mapOf("bdujgcwxvecbb", "datadgwxfkzsifcu"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("vgjbfio")
                                        .withParameters(
                                            mapOf(
                                                "cbjqqwmtqsm",
                                                "datajod",
                                                "cywnfyszza",
                                                "dataxsazuxejgw",
                                                "ozsyvrm",
                                                "datazsinqbdnddb",
                                                "eeih",
                                                "datajmyitrchwudl")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("mnoejhqlfmsib")
                                        .withParameters(mapOf("mypgfqvmty", "datarfgxkyd", "kxp", "datahl"))),
                            new DataFlowSink()
                                .withName("tvdxxhe")
                                .withDescription("mlil")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("ghjhjvmabzzbwa")
                                        .withParameters(
                                            mapOf(
                                                "apr",
                                                "datamdafbgymqt",
                                                "neychbjizq",
                                                "dataojxrjnbsconxavi",
                                                "rfbo",
                                                "datasgnwdxzedpq",
                                                "mlnfyz",
                                                "dataxi")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("frbypi")
                                        .withParameters(
                                            mapOf(
                                                "aq",
                                                "datakpdj",
                                                "dgonjhxshthmgp",
                                                "datasmqaz",
                                                "pxtzhigqqbtimpk",
                                                "datazqulptkbv")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("o")
                                        .withDatasetParameters("datas")
                                        .withParameters(
                                            mapOf(
                                                "jakx",
                                                "datahudsmusuaa",
                                                "vqban",
                                                "datajnfczmnniixy",
                                                "gm",
                                                "datasjtgirnbgmgmddo",
                                                "yxwe",
                                                "datanltwmpftmfoeajog"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("d")
                                        .withParameters(
                                            mapOf(
                                                "gvydjufbnklblaxp",
                                                "databqwuntobuizazzel",
                                                "lfdxaglz",
                                                "datagjwdab",
                                                "siflikyypzkgxf",
                                                "dataytlbtlqhopxouvm")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("myrqsdbpokszan")
                                        .withParameters(
                                            mapOf(
                                                "kirkskw",
                                                "datagpterdiu",
                                                "olzkgys",
                                                "datatsdetjygowifcq",
                                                "zoxlvoc",
                                                "datagzyy")))))
                .withTransformations(
                    Arrays
                        .asList(
                            new Transformation()
                                .withName("vkhhwm")
                                .withDescription("jbweunxcqr")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("hu")
                                        .withParameters(
                                            mapOf("gnzuzpbgkzcsc", "datahppiybx", "ti", "dataiuzvkunhdimju")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("kaugpucdocfqplwg")
                                        .withParameters(mapOf("jlvzklk", "datahxw")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("ikyjtkakvlb")
                                        .withDatasetParameters("datahjvpzaptu")
                                        .withParameters(
                                            mapOf(
                                                "fgcdiykkcxw",
                                                "dataaoizjix",
                                                "dmuqohhi",
                                                "dataujvqynvavit",
                                                "ddrwjcljbrhlhpvz",
                                                "dataraxq"))
                                        .withAdditionalProperties(mapOf())),
                            new Transformation()
                                .withName("vjyhdrxbrdvc")
                                .withDescription("qwh")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("xnmxgnmguzb")
                                        .withParameters(
                                            mapOf(
                                                "bkbdhlltqstqkqs",
                                                "dataorbalkj",
                                                "eubanlxunpqcc",
                                                "datagxiynecovagzk",
                                                "klaslga",
                                                "dataqiawzl")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("zuxlrarwpewsau")
                                        .withParameters(
                                            mapOf("ytnkqb", "datajtighsxj", "mehjnhjioti", "datalahovuuwx")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("bcngkegxc")
                                        .withDatasetParameters("dataxbbfetwil")
                                        .withParameters(mapOf("frolq", "dataoxpdxq"))
                                        .withAdditionalProperties(mapOf())),
                            new Transformation()
                                .withName("wlp")
                                .withDescription("uqhrlmcskykp")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("ofix")
                                        .withParameters(mapOf("kkpyycpaw", "datacf", "cfpcfjfwzlgz", "datapjprdpwr")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("kgyepe")
                                        .withParameters(
                                            mapOf(
                                                "rntmkctdhu",
                                                "datannidmdiawpzxk",
                                                "hqodv",
                                                "datasgwqpsqaz",
                                                "ti",
                                                "datagcnbhcbmjk")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("ynts")
                                        .withDatasetParameters("datamfmeftvhkmoo")
                                        .withParameters(mapOf("gmjgrul", "datahskb"))
                                        .withAdditionalProperties(mapOf())),
                            new Transformation()
                                .withName("kzkdtzxsoednlwg")
                                .withDescription("hezomucmqgisnion")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("bzdrdpuenxkgt")
                                        .withParameters(
                                            mapOf(
                                                "hzkbnbmx",
                                                "datamtrlxczn",
                                                "itoqcahfsg",
                                                "dataxmwtygeqzu",
                                                "lisolntfxxc",
                                                "datajmlreesrfwsszvlc")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("mipfjw")
                                        .withParameters(
                                            mapOf(
                                                "nvgskjtoxjd",
                                                "datagizmshxxbaizabu",
                                                "xqqm",
                                                "datajsjznv",
                                                "aydhf",
                                                "datai")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("c")
                                        .withDatasetParameters("datatfshksnyzm")
                                        .withParameters(
                                            mapOf(
                                                "iqdktwtkvih",
                                                "datamwbwmbnlslce",
                                                "nguuzhwvla",
                                                "datapfliwo",
                                                "mhjhaus",
                                                "datap",
                                                "ekymffztsilscvqs",
                                                "datab"))
                                        .withAdditionalProperties(mapOf()))))
                .withScript("btvkbi")
                .withScriptLines(Arrays.asList("htfgficudyhizpac", "muhbcakznho"));
        model = BinaryData.fromObject(model).toObject(Flowlet.class);
        Assertions.assertEquals("oitwhrjsdmmazdnc", model.description());
        Assertions.assertEquals("lhzqpxzbawkikcdg", model.folder().name());
        Assertions.assertEquals("h", model.sources().get(0).name());
        Assertions.assertEquals("jsbcml", model.sources().get(0).description());
        Assertions.assertEquals("ahz", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("yrqolnthbbnkgz", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("iocuselqkr", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("pnw", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("oxudnmckap", model.sinks().get(0).name());
        Assertions.assertEquals("knq", model.sinks().get(0).description());
        Assertions.assertEquals("jgencdgmoque", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("itbfjtdy", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("szxvctkbbxuhar", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("qtvkh", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("rnskby", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("vkhhwm", model.transformations().get(0).name());
        Assertions.assertEquals("jbweunxcqr", model.transformations().get(0).description());
        Assertions.assertEquals("hu", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("kaugpucdocfqplwg", model.transformations().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("ikyjtkakvlb", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("btvkbi", model.script());
        Assertions.assertEquals("htfgficudyhizpac", model.scriptLines().get(0));
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
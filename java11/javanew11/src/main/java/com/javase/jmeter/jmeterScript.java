package com.javase.jmeter;

/**
 * @author liwen406
 * @Title: jj
 * @Description:
 * @date 2019/2/16 / 18:26
 */
public class jmeterScript {

    /**
     * 测试计划
     */
    public static final String TEST_PLAN = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><jmeterTestPlan version=\"1.2\" properties=\"5.0\" jmeter=\"5.0 r1840935\">    <hashTree>        <TestPlan guiclass=\"TestPlanGui\" testclass=\"TestPlan\" testname=\"Test Plan\" enabled=\"true\">            <stringProp name=\"TestPlan.comments\">描述</stringProp>            <boolProp name=\"TestPlan.functional_mode\">false</boolProp>            <boolProp name=\"TestPlan.tearDown_on_shutdown\">true</boolProp>            <boolProp name=\"TestPlan.serialize_threadgroups\">false</boolProp>            <elementProp name=\"TestPlan.user_defined_variables\" elementType=\"Arguments\" guiclass=\"ArgumentsPanel\" testclass=\"Arguments\" testname=\"User Defined Variables\" enabled=\"true\">                <collectionProp name=\"Arguments.arguments\">                    #GlobalTraversal#                </collectionProp>            </elementProp>            <stringProp name=\"TestPlan.user_define_classpath\"></stringProp>        </TestPlan>        <hashTree>           #ThreadGroupGui#            <hashTree/>        </hashTree>    </hashTree></jmeterTestPlan>";
    /**
     * 全局参数
     */
    public static final String GLOBALTRAVERSAL = "<elementProp name=\"全局参数名称\" elementType=\"Argument\"><stringProp name=\"Argument.name\">全局参数名称</stringProp><stringProp name=\"Argument.value\">参数值</stringProp><stringProp name=\"Argument.metadata\">=</stringProp>                    </elementProp>";

    /**
     * 线程组
     */
    public static final String THREADGROUPGUI = "<ThreadGroup guiclass=\"ThreadGroupGui\" testclass=\"ThreadGroup\" testname=\"Thread Group\" enabled=\"true\">                <stringProp name=\"ThreadGroup.on_sample_error\">continue</stringProp>                <elementProp name=\"ThreadGroup.main_controller\" elementType=\"LoopController\" guiclass=\"LoopControlPanel\" testclass=\"LoopController\" testname=\"Loop Controller\" enabled=\"true\">                    <boolProp name=\"LoopController.continue_forever\">false</boolProp>                    <stringProp name=\"LoopController.loops\">1</stringProp>                </elementProp>                <stringProp name=\"ThreadGroup.num_threads\">线程数</stringProp>                <stringProp name=\"ThreadGroup.ramp_time\">执行时间</stringProp>                <boolProp name=\"ThreadGroup.scheduler\">false</boolProp>                <stringProp name=\"ThreadGroup.duration\"></stringProp>                <stringProp name=\"ThreadGroup.delay\"></stringProp>            </ThreadGroup>";

    /**
     * 协议
     */
    public static final String HTTPSAMPLERPROXY = "<hashTree>        <HTTPSamplerProxy guiclass=\"HttpTestSampleGui\" testclass=\"HTTPSamplerProxy\" testname=\"HTTP Request\" enabled=\"true\">          <elementProp name=\"HTTPsampler.Arguments\" elementType=\"Arguments\" guiclass=\"HTTPArgumentsPanel\" testclass=\"Arguments\" testname=\"User Defined Variables\" enabled=\"true\">            <collectionProp name=\"Arguments.arguments\"/>          </elementProp>          <stringProp name=\"HTTPSampler.domain\">www.baidu.com</stringProp>          <stringProp name=\"HTTPSampler.port\">80</stringProp>          <stringProp name=\"HTTPSampler.protocol\">http</stringProp>          <stringProp name=\"HTTPSampler.contentEncoding\">utf-8</stringProp>          <stringProp name=\"HTTPSampler.path\">/</stringProp>          <stringProp name=\"HTTPSampler.method\">GET</stringProp>          <boolProp name=\"HTTPSampler.follow_redirects\">true</boolProp>          <boolProp name=\"HTTPSampler.auto_redirects\">false</boolProp>          <boolProp name=\"HTTPSampler.use_keepalive\">true</boolProp>          <boolProp name=\"HTTPSampler.DO_MULTIPART_POST\">false</boolProp>          <stringProp name=\"HTTPSampler.embedded_url_re\"></stringProp>          <stringProp name=\"HTTPSampler.connect_timeout\"></stringProp>          <stringProp name=\"HTTPSampler.response_timeout\"></stringProp>        </HTTPSamplerProxy>        <hashTree/>";


    public static final String TEST_PLAN1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><jmeterTestPlan version=\"1.2\" properties=\"5.0\" jmeter=\"5.0 r1840935\">    <hashTree>        <TestPlan guiclass=\"TestPlanGui\" testclass=\"TestPlan\" testname=\"Test Plan\" enabled=\"true\">            <stringProp name=\"TestPlan.comments\">描述</stringProp>            <boolProp name=\"TestPlan.functional_mode\">false</boolProp>            <boolProp name=\"TestPlan.tearDown_on_shutdown\">true</boolProp>            <boolProp name=\"TestPlan.serialize_threadgroups\">false</boolProp>            <elementProp name=\"TestPlan.user_defined_variables\" elementType=\"Arguments\" guiclass=\"ArgumentsPanel\" testclass=\"Arguments\" testname=\"User Defined Variables\" enabled=\"true\">                <collectionProp name=\"Arguments.arguments\">                    <elementProp name=\"全局参数名称\" elementType=\"Argument\">                        <stringProp name=\"Argument.name\">全局参数名称</stringProp>                        <stringProp name=\"Argument.value\">参数值</stringProp>                        <stringProp name=\"Argument.metadata\">=</stringProp>                    </elementProp>                </collectionProp>            </elementProp>            <stringProp name=\"TestPlan.user_define_classpath\"></stringProp>        </TestPlan>        <hashTree>            <ThreadGroup guiclass=\"ThreadGroupGui\" testclass=\"ThreadGroup\" testname=\"Thread Group\" enabled=\"true\">                <stringProp name=\"ThreadGroup.on_sample_error\">continue</stringProp>                <elementProp name=\"ThreadGroup.main_controller\" elementType=\"LoopController\" guiclass=\"LoopControlPanel\" testclass=\"LoopController\" testname=\"Loop Controller\" enabled=\"true\">                    <boolProp name=\"LoopController.continue_forever\">false</boolProp>                    <stringProp name=\"LoopController.loops\">1</stringProp>                </elementProp>                <stringProp name=\"ThreadGroup.num_threads\">线程数</stringProp>                <stringProp name=\"ThreadGroup.ramp_time\">执行时间</stringProp>                <boolProp name=\"ThreadGroup.scheduler\">false</boolProp>                <stringProp name=\"ThreadGroup.duration\"></stringProp>                <stringProp name=\"ThreadGroup.delay\"></stringProp>            </ThreadGroup>            <hashTree/>        </hashTree>    </hashTree></jmeterTestPlan>";








}

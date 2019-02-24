package com.javase.jmeterTest;

import com.javase.jmeter.jmeterScript;
import com.javase.utils.xmlFormatter;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * @author liwen406
 * @Title: new11javadome
 * @Description:
 * @date 2019/2/16 / 12:33
 */
public class new11javadome {

    @Test
    public void jmeterdome() throws Exception {

        String newJmxx = jmeterScript.TEST_PLAN.replace("#GlobalTraversal#", jmeterScript.GLOBALTRAVERSAL).replace("#ThreadGroupGui#", jmeterScript.THREADGROUPGUI);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("newjmx.jmx"));
        bufferedWriter.write(xmlFormatter.format(newJmxx));
        bufferedWriter.close();
//       System.out.println(xmlFormatter.formatXML(jmeterScript.TEST_PLAN1));


    }

}

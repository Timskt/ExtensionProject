package com.sky.toolkit.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/***
 @author 蔡联发
 @date 2022/10/23
 @version 1.0
 */
public class ExceptionUtil {
    public static String getTrace(Throwable t) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t.printStackTrace(writer);
        StringBuffer buffer = stringWriter.getBuffer();
        return buffer.toString();
    }
}

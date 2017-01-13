package com.alex.api.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Created by alexchen on 2017/1/12.
 */
public class XStreamUtil {
    private static XStream xStream = new XStream(new StaxDriver());

    public static String javaBeanToXmlls(Object obj) {
        xStream.aliasType(obj.getClass().getSimpleName(), obj.getClass());
        xStream.autodetectAnnotations(true);
        return xStream.toXML(obj);
    }

    public static Object xmlToJavaBean(String xml, Class dataType) {
        xStream.processAnnotations(dataType);
        Object obj = xStream.fromXML(xml);
        return obj;
    }
}

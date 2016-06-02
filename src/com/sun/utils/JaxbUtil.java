package com.sun.utils;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbUtil {

	public static String convertToXml(Object obj) {
		return convertToXml(obj, "UTF-8");
	}

	private static String convertToXml(Object obj, String encoding) {
		StringWriter writer = null;
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
			writer = new StringWriter();
			marshaller.marshal(obj, writer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return writer.toString();
	}

	public static <T> T converyToJavaBean(String xml, Class<T> c) {

		T t = null;
		try {
			JAXBContext context = JAXBContext.newInstance(c);
			Unmarshaller un = context.createUnmarshaller();
			t = (T) un.unmarshal(new StringReader(xml));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return t;
	}
}

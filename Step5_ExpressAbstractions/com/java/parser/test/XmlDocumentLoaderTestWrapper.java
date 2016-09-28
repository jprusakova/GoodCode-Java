package com.java.parser.test;

import org.w3c.dom.Document;

import com.java.parser.ParseEmployeeXmlException;
import com.java.parser.XmlDocumentLoader;

public class XmlDocumentLoaderTestWrapper extends XmlDocumentLoader {

	public int calledParseXmlFile = 0;
	
	public Document parseXmlFile(String documentPath) throws ParseEmployeeXmlException {
		this.calledParseXmlFile += 1;
		return super.parseXmlFile(documentPath);
	}
}

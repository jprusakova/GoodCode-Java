package com.java.parser.test;

import org.w3c.dom.Element;

import com.java.parser.ParseEmployeeXmlException;
import com.java.parser.XmlDocumentParser;

public class XmlDocumentParserTestWrapper extends XmlDocumentParser {

	public int calledGetStringValueByTagName = 0;
	public int calledGetIntValueByTagName = 0;
	
	public String getStringValueByTagName(Element employeeElement, String nodeTagName) 
			throws ParseEmployeeXmlException {
		this.calledGetStringValueByTagName += 1;
		return super.getStringValueByTagName(employeeElement, nodeTagName);
	}

	public int getIntValueByTagName(Element ele, String tagName)
			throws NumberFormatException, ParseEmployeeXmlException {
		this.calledGetIntValueByTagName += 1;
		return super.getIntValueByTagName(ele, tagName);
	}
}

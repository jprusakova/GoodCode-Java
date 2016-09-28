package com.java.parser.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;

import com.java.parser.ParseEmployeeXmlException;


public class XmlDocumentParserTests {
	
	private XmlDocumentParserTestWrapper target;

	@Before
    public void setUp() {
        this.target = new XmlDocumentParserTestWrapper();
    }

	@Test
	public void test_getStringValueByTagName_retrunsExpectedValue() 
			throws ParseEmployeeXmlException {
		Element employeeElement = (Element)TestDataFactory.getTestEmployeeNode();
		String retval = this.target.getStringValueByTagName(employeeElement, "Name");
		assertEquals("Seagull", retval);
	}

	@Test
	public void test_getIntValueByTagName_returnsExpectedValue()
			throws NumberFormatException, ParseEmployeeXmlException {
		Element employeeElement = (Element)TestDataFactory.getTestEmployeeNode();
		int retval = this.target.getIntValueByTagName(employeeElement, "Id");
		assertEquals(3674, retval);
	}

	@Test
	public void test_getIntValueByTagName_handlesUnexpectedFormat()
			throws NumberFormatException, ParseEmployeeXmlException {
		Element employeeElement = (Element)TestDataFactory.getTestEmployeeNode();
		int retval = this.target.getIntValueByTagName(employeeElement, "PayGrade");
		assertEquals(34, retval);
	}
}

package com.java.parser.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import com.java.parser.ParseEmployeeXmlException;


public class XmlDocumentLoaderTests {

	private XmlDocumentLoaderTestWrapper target;

	@Before
    public void setUp() {
        this.target = new XmlDocumentLoaderTestWrapper();
    }
	
	@Test
	public void test_parseXmlFile_returnsAnExpectedDoc() throws ParseEmployeeXmlException {
		Document retval = target.parseXmlFile("employees.xml");
		assertEquals(1, retval.getElementsByTagName("Personnel").getLength());
	}
}

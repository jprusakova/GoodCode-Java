package com.java.parser.test;

import java.util.List;

import com.java.parser.*;

public class DomParserTestWrapper extends DomParserExample {
	
	public int CalledRunExample = 0;
	public int calledPrintEmployeesToConsole = 0;
	
	public DomParserTestWrapper(XmlDocumentLoader xmlDocLoader,
			EmployeeDocumentParser employeeDocParser) {
		super(xmlDocLoader, employeeDocParser);
	}

	public void runExample() throws ParseEmployeeXmlException {
		this.CalledRunExample  += 1;
		super.runDomParserExample();
	}
	
	public void printEmployeesToConsole(List<Employee> employees) {
		this.calledPrintEmployeesToConsole += 1;
		super.printEmployeesToConsole(employees);
	}
}
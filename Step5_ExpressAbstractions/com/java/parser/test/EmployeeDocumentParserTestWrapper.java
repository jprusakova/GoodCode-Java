package com.java.parser.test;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.java.parser.*;

public class EmployeeDocumentParserTestWrapper extends EmployeeDocumentParser {

	public int calledParseDocumentForEmployees = 0;
	public int calledGetEmployeeFromXmlNode = 0;
	
	public List<Employee> parseEmployeesFromXML(Document xmlDocument) 
			throws ParseEmployeeXmlException {
		this.calledParseDocumentForEmployees += 1;
		return super.parseEmployeesFromXML(xmlDocument);
	}

	public Employee buildEmployeeFromXmlNode(Node employeeNode) 
			throws ParseEmployeeXmlException {
		this.calledGetEmployeeFromXmlNode += 1;
		return super.buildEmployeeFromXmlNode(employeeNode);
	}
}

package com.java.parser;

import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Document;

public class DomParserExample {
	
	private final String employeeXmlLocation = "employees.xml";
	private final XmlDocumentLoader documentLoader;
	private final EmployeeDocumentParser documentParser;
	
	public static void main(String[] args) throws ParseEmployeeXmlException {
	
		DomParserExample example = new DomParserExample();
		example.runDomParserExample();
	}
	
	public DomParserExample() {
		documentLoader =  new XmlDocumentLoader();
		documentParser = new EmployeeDocumentParser();
	}
	
	public DomParserExample(XmlDocumentLoader xmlDocLoader,
			EmployeeDocumentParser employeeDocParser) {
		documentLoader = xmlDocLoader;
		documentParser = employeeDocParser;
	}
	
	public void runDomParserExample() throws ParseEmployeeXmlException {
		Document documentFromFile = loadDocument(employeeXmlLocation);	
		List<Employee> employees = retrieveEmployees(documentFromFile);
		printEmployeesToConsole(employees);
	}
	
	public void printEmployeesToConsole(List<Employee> employees) {
		
		System.out.println("No of Employees '" + employees.size() + "'.");
		
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	private List<Employee> retrieveEmployees(Document documentFromFile) throws ParseEmployeeXmlException {
		List<Employee> employees = documentParser.parseEmployeesFromXML(documentFromFile);
		return employees;
	}

	private Document loadDocument(String employeeXmlLocation) throws ParseEmployeeXmlException {
		Document documentFromFile = documentLoader.parseXmlFile(employeeXmlLocation);
		return documentFromFile;
	}
}

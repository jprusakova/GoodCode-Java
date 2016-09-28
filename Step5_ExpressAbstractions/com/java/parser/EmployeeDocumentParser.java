package com.java.parser;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeDocumentParser extends XmlDocumentParser {
	
	private static final String EMPLOYEE_ID_ELEMENT = "Id";
	private static final String EMPLOYEE_TYPE_ATTRIBUTE = "type";
	private static final String EMPLOYEE_NAME_ELEMENT = "Name";
	private static final String EMPLOYEE_AGE_ELEMENT = "PayGrade";
	private static final String EMPLOYEE_ELEMENT_NAME = "Employee";

	public List<Employee> parseEmployeesFromXML(Document xmlDocument) 
			throws ParseEmployeeXmlException {
		
		NodeList employeeNodes = retrieveEmployeeNodes(xmlDocument.getDocumentElement());
		
		List<Employee> employeeList = new ArrayList<>();
		for (int i = 0; i < employeeNodes.getLength(); i++) { 
			employeeList.add(buildEmployeeFromXmlNode(employeeNodes.item(i)));
		}
		
		return employeeList;
	}

	protected NodeList retrieveEmployeeNodes(Element rootElement)
			throws ParseEmployeeXmlException {
		
		NodeList nodesInRoot = rootElement.getElementsByTagName(EMPLOYEE_ELEMENT_NAME);
		
		if (null == nodesInRoot) {
			throw new ParseEmployeeXmlException("Error retrieving employee records from XML.");
		}
		return nodesInRoot;
	}

	protected Employee buildEmployeeFromXmlNode(Node employeeNode) 
			throws ParseEmployeeXmlException {
		
		Element employeeElement = (Element)employeeNode;
		
		String name = getStringValueByTagName(employeeElement, EMPLOYEE_NAME_ELEMENT);
		int id = getIntValueByTagName(employeeElement, EMPLOYEE_ID_ELEMENT);
		int age = getIntValueByTagName(employeeElement, EMPLOYEE_AGE_ELEMENT);
		String type = employeeElement.getAttribute(EMPLOYEE_TYPE_ATTRIBUTE);

		return new Employee(id,type,name,age);
	}
}

package com.java.parser.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.java.parser.Employee;

public class TestDataFactory {

	protected static Document getTestDoc() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document doc = null;
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse("employeesTestData.xml");
		}
		catch (ParserConfigurationException | SAXException | IOException exception) {
			// Do nothing.
		}
		return doc;
	}
	
	protected static Node getTestEmployeeNode() {
		return TestDataFactory.getTestDoc().getDocumentElement().getElementsByTagName("Employee").item(0);
	}
	
	protected static List<Employee> getTestEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(3674, "permanent", "Seagul", 34));
		employeeList.add(new Employee(3675, "contract", "Robin", 25));
		employeeList.add(new Employee(3676, "permanent", "Crow", 28));
		return employeeList;
	}
}

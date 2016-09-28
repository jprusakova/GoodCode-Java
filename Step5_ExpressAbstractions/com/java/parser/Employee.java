package com.java.parser;

public class Employee {

	private final int id;
	private final String type;
	private final String name;
	private final int payGrade;
	
	public Employee(int id, String type, String name,int payGrade) {
		this.id  = id;
		this.type = type;
		this.name = name;
		this.payGrade = payGrade;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPayGrade() {
		return payGrade;
	}

	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Details - ");
		sb.append("Id:" + getId());
		sb.append(", ");
		sb.append("Type:" + getType());
		sb.append(", ");
		sb.append("Name:" + getName());
		sb.append(", ");
		sb.append("PayGrade:" + getPayGrade());
		sb.append(".");
		
		return sb.toString();
	}
}


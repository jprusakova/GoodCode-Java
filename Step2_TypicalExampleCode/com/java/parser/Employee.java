package com.java.parser;

public class Employee {

	private String name;
	private int payGrade;
	private int id;
	private String type;
	
	public Employee(){
		//Empty constructor for convenience.
	}
	
	public Employee(String name, int id, int payGrade,String type) {
		this.name = name;
		this.payGrade = payGrade;
		this.id  = id;
		this.type = type;
	}

	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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


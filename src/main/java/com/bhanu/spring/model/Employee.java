package com.bhanu.spring.model;

public class Employee {

	private String name, gender;
	private int id;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String gender, int id) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("Employye.name()");
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.gender()");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.id()");
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + "]";
	}
	
	
	
}

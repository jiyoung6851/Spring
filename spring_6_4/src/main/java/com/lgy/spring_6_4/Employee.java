package com.lgy.spring_6_4;

import java.util.ArrayList;

public class Employee {
	private String Name;
	private int Salary;
	private ArrayList<String> License;
	
	public Employee(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public ArrayList<String> getLicense() {
		return License;
	}

	public void setLicense(ArrayList<String> license) {
		License = license;
	}

}

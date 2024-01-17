package com.hib;

public class Employee {
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	private int EmpId;
	private String Name;
	private double Salary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
}

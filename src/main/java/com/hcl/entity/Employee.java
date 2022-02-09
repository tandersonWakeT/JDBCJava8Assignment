package com.hcl.entity;

/*
 * - Employee attributes:
 * 					1. EmpId
 * 					2. EmpName
 * 					3. DOB
 * 					4. Salary
 * 					5. Age
 */
public class Employee {

	private int empId;
	private String empName;
	private String DOB;
	private int salary;
	private int age;

	public int getEmpId() {

		return this.empId;
	}

	public String getEmpName() {

		return this.empName;
	}

	public String getDOB() {

		return this.DOB;
	}

	public int getSalary() {

		return this.salary;
	}

	public int getAge() {

		return this.age;
	}

	public void setEmpId(int empId) {

		this.empId = empId;
	}

	public void setEmpName(String empName) {

		this.empName = empName;
	}

	public void setDOB(String DOB) {

		this.DOB = DOB;
	}

	public void setSalary(int salary) {

		this.salary = salary;
	}

	public void setAge(int age) {

		this.age = age;
	}
	
	public String toString() {
		
		return "EmpId: " + this.empId  + "\nName: " + this.empName + "\nDOB: " + this.DOB + "\nSalary: " 
				+ this.salary + "\nAge: " + this.age + "\n";
	}
}

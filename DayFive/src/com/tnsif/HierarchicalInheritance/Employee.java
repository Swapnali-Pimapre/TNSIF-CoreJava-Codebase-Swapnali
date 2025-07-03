package com.tnsif.HierarchicalInheritance;

public class Employee extends Person{
	
	private int empId;
	private float salary;
	private String Dept;
	public Employee() {
		super();
		System.out.println("Employee class defalut constructor");
		empId=101;
		salary=30000;
		Dept="IT";
	}
	public Employee(int empId, float salary, String dept,String name, String city) {
		super( name, city);
		this.empId = empId;
		this.salary = salary;
		Dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", Dept=" + Dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
	

}

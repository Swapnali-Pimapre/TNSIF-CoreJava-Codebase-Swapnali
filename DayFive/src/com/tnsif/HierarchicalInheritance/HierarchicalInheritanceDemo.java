package com.tnsif.HierarchicalInheritance;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu=new Student();
		stu.setCity("Pune");
		stu.setClassyear("BE");
		stu.setName("Radha");
		stu.setPercent(78.60f);
		System.out.println(stu);
		
		Employee emp=new Employee();
		emp.setCity("chicago");
		emp.setDept("CS");
		emp.setEmpId(101);
		emp.setName("Henry Cavill");
		emp.setSalary(9000000);
		
		Person p;
		p=new Person("Henry","San Fransico");
		System.out.println("Person Details:"+p);
		
		p=new Student("TE",568941,"radha","Latur");
		System.out.println("Student details:"+p);
		
		p=new Employee(101, 789651, "CS", "Radha", "Washington");
		System.out.println("Employee Details:"+p);
		
	}

}

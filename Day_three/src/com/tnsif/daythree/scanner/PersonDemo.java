package com.tnsif.daythree.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter your Income");
		int Income=sc.nextInt();
		
		System.out.println("Enter your gender:");
		String gender=sc.next();
		
		System.out.println("Enter mobile no:");
		long mobileNuber=sc.nextLong();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setMobileNuber(mobileNuber);
		person.setIncome(Income);
		//
		
		
		//by using getter method 
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		//display person details by using tostring method
		System.out.println(person);
		
		TaxCalculation cal=new TaxCalculation();
		 cal.calculateTax(person);
		 System.out.println("After calculation of Tax: ");
		 
		 System.out.println(person.getTax());
		 
		 System.out.println(person);
		
	}

}

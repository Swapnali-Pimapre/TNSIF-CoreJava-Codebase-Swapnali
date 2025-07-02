package com.tnsif.daythree.constuctor;

import java.util.Scanner;

public class ConsstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          
          String name,city;
          
          int id;
          System.out.println("Enter Customer Id");
          
          id=sc.nextInt();
          
          sc.nextLine();
          System.out.println("Enter customer name");
          name=sc.nextLine();
          
          
          System.out.println("Enter city name");
          city=sc.nextLine();
          
          System.out.println(" ");
          
          Customer cus=new Customer();//default constructor is created by creating object of class
          
          cus.setCustomerCity(city);
          cus.setCustomerId(id);
          cus.setCustomerName(name);
          System.out.println(cus);
          
          
          System.out.println("");
          Customer c2=new Customer(name,id,city);
          System.out.println(c2.getCustomerCity());
          System.out.println(c2.getCustomerId());
          System.out.println(c2.getCustomerName());
          
          
          System.out.println("");
          Customer c1=new Customer("Radha",87,"Pune");//parameterized constructor is called or created 
          System.out.println(c1);
          
}

}

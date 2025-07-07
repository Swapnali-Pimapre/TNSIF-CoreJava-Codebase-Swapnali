package com.radha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateTable {

	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/radha" ,"root","@Radha12345");
		    Statement stm=con.createStatement();
		    Scanner sc=new Scanner(System.in);
		    System.out.println("-------Menu------");
		    System.out.println("1.Create table \n2.Insert values\n 3.update values\n4.delete values ");
		    System.out.println("Enter your choice");
		    int choice =sc.nextInt();
		    switch(choice) {
		    case 1:
		    	stm.executeUpdate("create table a1(code int,cname varchar(20),location varchar(20))");
		    	System.out.println("Table created succesfully");
		    	break;
		    case 2:
		    	System.out.println("Enter code:");
		    	int code=sc.nextInt();
		    	System.out.println("Enter contry name:");
		    	String name=sc.nextLine();
		    	System.out.println("Enter your city");
		    	String city=sc.nextLine();
		    	stm.executeUpdate("insert into a1 values('"+code+"','"+name+"','"+city+"')" );
		    	System.out.println("Values enterd succesfully");
		    	break;
		    case 3:
		    	System.out.println("Please enter rollno wich you want to update:");
			    int n = sc.nextInt();
			    System.out.println("Please enter new rollno");
			    int newrn = sc.nextInt();
		    	 stm.executeUpdate("update  student2 set rollno="+newrn+" where rollno="+n);
		    	 System.out.println("Record Updated!");
		    	 break;
		    case 4:
		    	System.out.println("Please enter rollno:");
			    int x = sc.nextInt();
		    	stm.executeUpdate("delete from student2 where rollno="+x);
		    	System.out.println("Record Deleted!");
		    	break;
		    default:
		    	System.out.println("Invalid Choice!");

		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}

}

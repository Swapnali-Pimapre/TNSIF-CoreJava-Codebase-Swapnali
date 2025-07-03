package com.tnsif.association.hasa;

public class Executor {
	
	public static void main(String[] args) {
		Address address=new Address("405 Samarth Nagar","Pune","Maharastra","411027");
		

		Person p=new Person("Radha",address);
		System.out.println(p);
		p.displayInfo();
	}


}

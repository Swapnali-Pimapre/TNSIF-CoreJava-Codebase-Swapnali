package com.tnsif.daythree.constuctor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	//default constructor
	public Customer() {
		System.out.println("This is Default constructor");
	}
	
	//parameteried constructor
	public Customer(String customerName, int customerId, String customerCity) {
		//this();  calling default constructor
		System.out.println("This is para constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	public Customer(String customerName, int customerId) {
		
		this.customerName = customerName;
		this.customerId = customerId;
	}

	//getter setter
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	//tostring
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	

}

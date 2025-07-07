package com.tnsif.dayEight.InterfaceDemo;

public interface Bank {
	
	final static float MINBAL=5000;
	
	float Deposit_Limit=250000;
	
	public void deposit(float amount);
	public void withdrawa(float amount);
	

}

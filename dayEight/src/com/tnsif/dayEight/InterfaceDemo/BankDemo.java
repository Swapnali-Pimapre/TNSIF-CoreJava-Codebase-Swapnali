package com.tnsif.dayEight.InterfaceDemo;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount s1=new SavingAccount("henry","london",12000,3453);

		System.out.println(s1);
		s1.deposit(115000);
		s1.withdrawa(56455);
		System.out.println(s1);
	}

}

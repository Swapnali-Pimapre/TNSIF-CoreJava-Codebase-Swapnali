package com.tnsif.dayEight.InterfaceDemo;

public class SavingAccount extends Customer implements Bank{

	
	private int accNo;
	private float bal;
	
	
	public SavingAccount(String name, String city, int accNo, float bal) {
		super(name, city);
		this.accNo = accNo;
		this.bal = bal;
	}

	//getter and setter
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public float getBal() {
		return bal;
	}


	public void setBal(float bal) {
		this.bal = bal;
	}


	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount < 0 || amount>Deposit_Limit) {
			System.out.println("Please deposit valid amount");
		}
		
		else {
			bal +=amount;
			System.out.println("Rs :"+amount +"is deposited successfully");
		}
	}

	@Override
	public void withdrawa(float amount) {
		// TODO Auto-generated method stub
		
		if(amount <= bal-MINBAL) {
			bal-=amount;
			System.out.println("RS :"+amount+ " withdrawal is successfull");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", bal=" + bal + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	

}

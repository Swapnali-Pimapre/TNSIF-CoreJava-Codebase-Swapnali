package com.tnsif.dayThirteen.synchronization;

public class AccountThread extends Thread {

	
	private Account acc;
	private int amt;
	//para constructor 
	
	
	public AccountThread(Account heti, int amt2) {
		// TODO Auto-generated constructor stub
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}

	@Override
	public void run()
	{
		try
		{
			acc.withdraw(amt);
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	
	
	
	
}
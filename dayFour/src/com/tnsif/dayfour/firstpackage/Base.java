package com.tnsif.dayfour.firstpackage;

public class Base {

	int valueDefault=10;
	public int valPublic=20;
	private int valPrivate=30;
	protected int valProtected=40;
	
	//default ,Protected,Private,Public
	
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("Default variable: "+valueDefault);
		
		System.out.println();
	}
	
	public void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("Public Variable:"+valPublic);
		
		System.out.println();
	}
	
	private void methodPrivate() {
		System.out.println("Private access base class");
		System.out.println("Private variable"+valPrivate);
		
		System.out.println();
	}
	
	protected void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected variable:"+valProtected);
		
		System.out.println();
	}
	
	
}

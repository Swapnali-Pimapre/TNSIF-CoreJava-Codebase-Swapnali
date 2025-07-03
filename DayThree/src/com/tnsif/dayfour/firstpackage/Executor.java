package com.tnsif.dayfour.firstpackage;

public class Executor {
	public static void main(String[] args) {
		Base b=new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.valueDefault=85;
		b.valProtected=96;
		b.valPublic=24;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
	}

}

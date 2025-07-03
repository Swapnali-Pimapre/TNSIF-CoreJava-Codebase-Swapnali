package com.tnsif.dayfour.secondackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {
	public static void main(String[] args) {
		Base b1=new Base();
		
		
		//private,default,protected,public
		
		b1.methodPublic();
		b1.valPublic=76;
		b1.methodPublic();
		
	}

}

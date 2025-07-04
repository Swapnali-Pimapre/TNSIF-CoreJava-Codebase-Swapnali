package com.tnsif.daysix.finalDemo;

public class FinalVariables {
	
	//final int a;  ///will cause error bcoz initialization is required
	
	final int x=100;
	
	//declaring a  static blank final variable
	
	final static int y;
	
	final static int z=1003;
	
	//instance method
	
	void change() {
		
		//a=40;
//		x=30;   final variable can not be changed or reassign
//		z=34;
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ",y="+y+"]";
	}
	 //declared a static bleck
	static {
		y=45;
		
		//z=85;  can not be assign  once initialization cant be reassigned
		System.out.println("static variables");
	}
	
	
	

}

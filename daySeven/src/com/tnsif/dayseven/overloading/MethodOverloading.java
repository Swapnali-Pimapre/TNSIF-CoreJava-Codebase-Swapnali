package com.tnsif.dayseven.overloading;

public class MethodOverloading {

	
   public static int add(int a,int b) {
	return a+b;
   }
   public static int add(int a,float b) {
	   int add=a+(int)b;
	   return add;
   }
   public static float add(float a,float b) {
	   return a+b;
   }
   public static int add(int a,int b,int c) {
	   return a+b+c;
   }
   
   
}

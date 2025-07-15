package com.tnsif.dayeleven.tryMultiplecatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void Divide() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			
		}
		catch(InputMismatchException e) {
			System.err.println("Input is mismatched"+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.err.println("Can not divide by zero "+e.getMessage());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Finally Block");
		}
	}
}

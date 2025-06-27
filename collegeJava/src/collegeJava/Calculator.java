package collegeJava;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]arg) {
		System.out.println("Welcome to Calci");
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Select Operator");
		int n=sc.nextInt();
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter a second number");
		int num2 =sc.nextInt();
		switch(n) {
		case 1:
			int add=num1+num2;
			System.out.println(num1 +"+" +num2 +"="+add);
			break;
		
		case 2:
			int sub=num1-num2;
			System.out.println(num1 +"-" +num2 +"="+sub);
			break;
		
		case 3:
			System.out.println(num1 +"*" +num2 +"="+num1*num2);
			break;
		
		case 4:
			System.out.println(num1 +"/" +num2 +"="+num1/num2);
			break;
		
		default:
			System.out.println("Wrong operator");
			
		
		}
		}
	}
}

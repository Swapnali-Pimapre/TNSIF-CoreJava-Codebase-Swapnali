package collegeJava;

import java.util.Scanner;

public class facto {
    public static void main(String [] arg) {
    	System.out.println("Hello world");
    	System.out.println("Enter a number");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	System.out.println(factorial(n));
    }

	 static int factorial(int n) {
		// TODO Auto-generated method stub
		
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}

package collegeJava;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int len=String.valueOf(Math.abs(n)).length();
		int reverse=0;
		for(int i=0;i<len;i++) {
		
		int digit=n%10;
		reverse=reverse*10+digit;
		n=n/10;
			
		}
		System.out.println(reverse);

	}

}

package collegeJava;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime(n));
	}
	public static boolean prime(int n) {
		if(n==1 || n==0) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}

package collegeJava;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factor(n));

	}
	public static int factor(int n) {
		int sum=0;
		if(n==0) {
			return 0;
			
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		System.out.println(" ");
		System.out.print("Sum:");
		return sum;
	}

}

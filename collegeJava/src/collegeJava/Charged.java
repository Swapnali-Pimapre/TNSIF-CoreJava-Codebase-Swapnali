package collegeJava;

import java.util.Scanner;

public class Charged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your battery percentage");
		Scanner sc=new Scanner(System.in);
		int charge=sc.nextInt();
		if(charge>20 && charge<=100) {
			System.out.println("Sufficient Charge");
		}
		else if(charge<=20 && charge >=0) {
			System.out.println("Connect to Charger");
		}
		else {
			System.out.println("Invalid ! Please give correct percentage");
		}
	}

}

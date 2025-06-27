package collegeJava;

import java.util.Scanner;

public class CourseEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Have you paid the fees");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.contains("yes")) {
			System.out.println("Enter the total fees amount:");
			int amt=sc.nextInt();
			System.out.println("Enter a paid fees:");
			int paid=sc.nextInt();
			if(paid>=amt/2) {
				System.out.println("Congrats You are eligible for course enrollment.");
			}
			else {
				System.out.println("Not Eligible to enroll into COurse");
			}
		}
		else {
			System.out.println("You are not eligible to Enroll to course");
		}

	}

}

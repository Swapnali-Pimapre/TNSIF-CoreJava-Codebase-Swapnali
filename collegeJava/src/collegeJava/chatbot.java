package collegeJava;

import java.util.Scanner;

public class chatbot {
	public static void main(String[] arg) {
		System.out.println("Welcome to dive");
		Scanner sc=new Scanner(System.in);
		while(true) {
			String in=sc.nextLine();
			if(in.equalsIgnoreCase("hi")) {
				System.out.println("Welcome to dive");	
			}
			else if(in.equalsIgnoreCase("What can i ask you")) {
				System.out.println("You can ask me GK Questions");
			}
			else if(in.equalsIgnoreCase("what is the capital of USA")) {
				System.out.println("Washington DC");
			}
			else if(in.equalsIgnoreCase("What is the capital of India")) {
				System.out.println("New Delhi");
			}
			else if(in.equalsIgnoreCase("Australia is in which contenant")) {
				System.out.println("Australia");
			}
			else if(in.contains("what is the capital of Australia")) {
				System.out.println("Canberra");
			}
			else {
				System.out.println("Sorry i cant process it!");
			}
		}
	}

}

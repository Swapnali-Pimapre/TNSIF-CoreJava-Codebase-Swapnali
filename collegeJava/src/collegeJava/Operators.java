package collegeJava;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a sencond number");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
			
		}
		//Arithmetic operator
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
		//comparison operators
		System.out.println(a+">="+b+"="+(a>=b));
		System.out.println(a+"<="+b+"="+(a<=b));
		System.out.println(a+"!="+b+"="+(a!=b));
		System.out.println(a+">"+b+"="+(a>b));
		System.out.println(a+"<"+b+"="+(a<b));
		System.out.println(a+"=="+b+"="+(a==b));
		
		//assignment operator
		
		System.out.println(a+"+="+b+"="+(a+=b));
		System.out.println(a+"-="+b+"="+(a-=b));
		System.out.println(a+"*="+b+"="+(a*=b));
		System.out.println(a+"/="+b+"="+(a/=b));
		System.out.println(a+"%="+b+"="+(a%=b));
		
		// unary operators
		System.out.println(a+"++"+(a++));
		System.out.println(a+"--"+"="+(a--));
		System.out.println("++"+a+"="+(++a));
		System.out.println("--"+b+"="+(--b));
	}

}

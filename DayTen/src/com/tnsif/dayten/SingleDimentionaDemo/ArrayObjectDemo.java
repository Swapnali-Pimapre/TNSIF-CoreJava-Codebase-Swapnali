package com.tnsif.dayten.SingleDimentionaDemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student []arr=new Student[5];
		
		//decalred memory for 5 object or type student
		
		arr[0]=new Student(101,"Niti");
		arr[1]=new Student(102,"ben");
		arr[2]=new Student(103,"sam");
		arr[3]=new Student(104,"henry");
		arr[4]=new Student(105,"ares");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements of an array :"+arr[i].getRollNo()+" "+arr[i].getName());
		}
	}

}

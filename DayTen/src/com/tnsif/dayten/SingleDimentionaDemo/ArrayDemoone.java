package com.tnsif.dayten.SingleDimentionaDemo;

class ArrayOperation{
	//print int array
	
	static void printArrays(int []arr) {
		System.out.println("Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		
	}
	
	//variable argument function
	
	public static int getSum(int...n) {
		int sum=0;
		for(int no:n) {
			sum=sum+no;
		}
		
		return sum;
	}
	
	//count no of odd elements
	public static int getOddCount(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]%2 !=0) {
				count++;
			}
		}
		
		return count;
	}
}
public class ArrayDemoone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {85,96,41,23,74};
		
		System.out.println("Array Elements: ");
		ArrayOperation.printArrays(arr);
		
		System.out.println("Count of odd elements in array: "+ArrayOperation.getOddCount(arr));
		
		System.out.println("Sum of all elements of array: "+ArrayOperation.getSum(arr));
		
		
		

	}

}

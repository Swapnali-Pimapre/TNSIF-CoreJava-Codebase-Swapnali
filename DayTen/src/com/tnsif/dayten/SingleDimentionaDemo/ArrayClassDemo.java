package com.tnsif.dayten.SingleDimentionaDemo;

import java.util.Arrays;
public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {85,96,41,23,74};
		
		//print the array
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		//sorting of array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 64));
		
		//comparison
		
		System.out.println(Arrays.toString(arr));
		
		//get the second Array
		
		int arr1[]= {85,96,41,23,74};
		
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		if(Arrays.compare(arr,arr1)==0) {
			System.out.println("Both arrays are same");
		}
		else {
			System.out.println("Arrays are not same");
		}
		
		int[] arr3=Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));
		
		int arr4[]=Arrays.copyOfRange(arr, 1, 3);
		System.out.println(Arrays.toString(arr4));
		
		//fill method
		
		Arrays.fill(arr4, 7);
		System.out.println(Arrays.toString(arr4));
		
	}

}

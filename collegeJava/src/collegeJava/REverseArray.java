package collegeJava;

import java.util.Scanner;

public class REverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner c=new Scanner(System.in);
		System.out.println("Enter your array size");
		int size=c.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			arr[i]=c.nextInt();
		}
		System.out.println("Array before reversing");
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int i=0;
		int end=size-1;
		while(i<=end) {
			int temp=arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
			
			i++;
			end--;
		}
		System.out.println("Array after reverse:");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
	}

}

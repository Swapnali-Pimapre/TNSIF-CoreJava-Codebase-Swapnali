package collegeJava;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		int currsum=0;
		int start=0;
		for(int i=0;i<size;i++) {
			currsum=currsum+arr[i];
			while(sum<currsum) {
				currsum=currsum-arr[start];
				start++;
			}
			if(currsum==sum) {
				System.out.println(start +","+i);
			}
		}

	}

}

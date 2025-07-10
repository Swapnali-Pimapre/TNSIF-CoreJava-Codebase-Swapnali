package com.tnsif.dayten.MultiDimentionaDemo;


class MDArray{
	static void printArray(int c[][]) {
		System.out.println("Array of elements are follows");
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MultiDimentionalArrayDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[][]= {{12,52},{54,85},{95,68},{98,75},{8,7}};
		System.out.println("No of row in c array:"+c.length);
		MDArray.printArray(c);
	}

}

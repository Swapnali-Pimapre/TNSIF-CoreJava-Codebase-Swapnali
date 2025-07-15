package com.tnsif.dayeleven.trycatch;

public class UnchekedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];
		try {
			a=new int[] {4,5,8,6,2,4};
			System.out.println(a[41]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist:"+e.getMessage());
		}
	}

}

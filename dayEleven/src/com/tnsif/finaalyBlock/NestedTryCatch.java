package com.tnsif.finaalyBlock;

public class NestedTryCatch {

	public static void check() {
		// TODO Auto-generated method stub

		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotherString=null;
		int y=6;
		try {
			//Inner try block
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("String length"+anotherString.length());
		}
		catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println();
		}
	}

}

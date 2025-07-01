package tnsif_day1;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte takes 1 byte
		//1byte=8bits              2^8=256 -> 256/2=128
		
	
		byte byteMax=127;
		byte byteMin=-128;
		
		//byte bytemax=128;  error because it is out of byte range
		//byte bytemin=-129;  error range exceeded
		
		System.out.println("Min range of byte is :"+byteMin +"Max range of byte is "+byteMax);
		
		//short-----2 bytes
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Min range of short is :"+shortMin +"Max range of short is "+shortMin);

		//int -----4bytes
		int maxInt=2147483647;
		int minInt=-2147483648;
		
		System.out.println("Min range of int is :"+minInt +"Max range of int is "+minInt);
		
		//long -----8bytes
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		
		System.out.println("Min range of long is :"+minlong +"Max range of long is "+minlong);
		 
		//boolean---2bytes
		boolean flag=false;
		boolean flag2=true;
	}

}

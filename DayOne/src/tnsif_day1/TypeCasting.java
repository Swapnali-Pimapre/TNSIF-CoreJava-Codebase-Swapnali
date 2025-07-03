package tnsif_day1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//widening
		
		short num=254;
		int num1=num;
		System.out.println(num1);
		
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//narrowing
		
		double f1=10.52f;
		long ll=(long)f1;
		
	   System.out.println(ll);
	   long no=975879864234L;
	   int a=(int)no;
	   
	  System.out.println(a);
	  
	  short s1=130;
	  
	  byte b1=(byte)a;
	  System.out.println(b1);
	
	}

}

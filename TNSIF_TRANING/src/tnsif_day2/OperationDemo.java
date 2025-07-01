package tnsif_day2;

public class OperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int x=10;
		System.out.println("A and B values before the operator: "+a+a+" "+ ++b);
		
		++a;
		
		int c=++a + b + a--;
		System.out.println("c value sfter the operation: "+c);
		
		int d=c++ + a + b--;
		System.out.println("d value after the operation: "+d);

	}

}

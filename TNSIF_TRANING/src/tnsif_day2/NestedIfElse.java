package tnsif_day2;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20,c=5;
		System.out.println("The largest no is :");
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}

}

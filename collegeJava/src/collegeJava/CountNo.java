package collegeJava;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		int vowel=0;
		int consonent=0;
		int digit=0;
		int specialchar=0;
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch)!=-1) {
					vowel++;
				}
				else {
					consonent++;
				}
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				specialchar++;
			}
			
		}
		System.out.println("vowel:"+vowel);
		System.out.println("Consonent:"+consonent);
		System.out.println("Digit:"+digit);
		System.out.println("Special Character:"+specialchar);

	}

}

package one;

import java.util.Scanner;

public class Luggage {
	public static void read(String s1, String s2)
	{
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)== s2.charAt(i) )
				System.out.println(s1.charAt(i));
				
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string 1");
		String s1 = s.next();
		System.out.println("enter string 2");
		String s2 = s.next();
		read(s1,s2);
		String[] a = s1.split("");
		String[] b = s2.split("");
		String res = "";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (a[i].equals(b[i])) {
					res += a[i];
				}
			}
			System.out.println(res);
		}
		else
		System.out.println("Un matched Lengths of String");
	}
}

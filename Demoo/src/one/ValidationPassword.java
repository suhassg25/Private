package one;

import java.util.Scanner;

public class ValidationPassword {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter password");
		
		String pwd=s.next();
		
		if(pwd.endsWith("#") && pwd.length()>7)
		{
			if(pwd.contentEquals(pwd.toUpperCase()))
			{
				System.out.println("Strong");
			}
			
			else
				System.out.println("weak");
		}
		else
			System.out.println("weak");
	}
}

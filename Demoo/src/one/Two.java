package one;

import java.util.Scanner;

public class Two {

	static int productOfGivenEvenNumber(int i) {
		int prod = 1;
		while (i != 0) {
			int rem = i % 10;
			if (rem % 2 == 0) {
				prod *= rem;
			}
			i /= 10;
		}
		return prod;
	}

	static void neon(int a)
	{
		int square=a*a;
		int sum=0;
		while(square!=0)
		{
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		if(a==sum)
		{
		System.out.println(sum);	
			System.out.println("neon number");
		}
		else
			{
			System.out.println(sum);
			System.out.println("not a neon number");
			}
		
	}
	
	static public void prime(int i)
	{
		boolean f=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				f=false;
			}
		}
		if(f)
		{
			String pal="";
			
			int x=i, rev=0;
			while(x!=0)
			{
				rev=(rev*10)+x%10;
				x/=10;				
			}
			if(rev==i)
			{
				pal="palindrome";
			}
			else {
				pal="not a palindrome";
			}
			System.out.println(i+" prime number "+pal);
		}
		else
		{
			System.out.println(i+" not a prime");
		}
	}

	public static void main(String[] args) {

	//System.out.println(productOfGivenEvenNumber(1234));
		//neon(9);

		prime(13);
	
	}
}

package one;

import java.util.Set;
import java.util.TreeSet;

public class CheckNumber {

	public static boolean checkNumber(int n) {
		int p = 2;
		while (n % p == 0) {
			n /= p;
			if (n == p) {
				break;
			}
		}

		if (n == p)
			return true;
		else
			return false;

	}
	
	public static boolean checkNumber2(int n)
	{
		boolean b=true;
		int rem=0, rem1=0;
		while(n!=0)
		{
			rem=n%10;
			rem1=(n%100-rem)/10;
			if(rem<rem1)
			{
				b=false;
				break;
			}
			n=n/10;
		}
		if(b)
			return true;
		else
			return false;
	}
	
public static void frequency(String n)
{
	Set<Character> set=new TreeSet<Character>();
	for (int i=0;i<n.length();i++)
	{
		set.add(n.charAt(i));
	}
	
	for(Character c: set)
	{
		int count=0;
		for (int i=0;i<n.length();i++)
		{
			if(c==n.charAt(i))
			{
				count++;
			}
		}
		System.out.println(c+" -->"+count);
		
	}
	
}

static void printBinary(int a)
{
	if(a<=1)
	{
		System.out.print(a);
		return;
	}
	int r=a%2;
	printBinary(a >> 1);
	System.out.print(r);
}


	public static void main(String[] args) {
		//frequency("djadjadjadjb");
		printBinary(10);
	}
}

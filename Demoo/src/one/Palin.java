package one;

import java.util.Arrays;
import java.util.Scanner;

public class Palin {

	static public void palin(String n) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(n);
		buffer.reverse();
		String res = buffer.toString();
		int num = Integer.valueOf(res);
		if (res.contains("0")) {
			System.out.println("0" + num);
		} else
			System.out.println(num);
	}

	static void reverseString(String a) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(a);
		buffer.reverse();
		System.out.println(buffer);
	}

	static void p(int n) {
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == 0) {
				System.out.print("0" + rev);
			}
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.print(rev);
	}

	static void palindromeString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println(rev + " is palindrome");
		} else
			System.out.println(str + " is not palindrome");
		System.out.println(str.contains("e"));
	}

	static void fib(int n) {
		int a = 0, b = 1, c = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 3; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			if (i == 20) {
				System.out.println("\n" + c);
			}
		}

	}

	static void prime(int n) {
		boolean a = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				a = false;
				break;
			}

		}
		if (a == true) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime");
		}
	}

	static public void sortint(String s) {
		char[] c1 = s.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
	}

	static public void vowels(String str) {

		String s1 = "";
		s1 = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s1);
	}


	static void paliint(int i) {
		int rev=0;
		while(i!=0)
		{
			rev=(rev*10)+i%10;
			i/=10;
		}
		System.out.println(rev);
	}
	
	
	static void rangeofArm(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			int copy=i;
			int sum=0, count=count(copy);
			while(copy!=0)
			{
				int rem=copy%10;
				int a=power(rem, count);
				sum+=a;
				copy/=10;
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}
		
	}
	
	static int sumofEven(int i) {
		int sum = 0;
		
		while (i != 0) {
			int a = i % 10;
			if (a % 2 == 0) {
				sum += a;
			}
			i /= 10;
			
		}
		return sum;
	}
	static int sumofOdd(int i) {
		int sum = 0;
		
		while (i != 0) {
			int a = i % 10;
			if (a % 2 == 1) {
				sum += a;
			}
			i /= 10;
			
		}
		return sum;
	}
	//arm
		static int count(int i)
		{ int count=0;
			while(i!=0)
			{
				i/=10;
				count++;
			}
			return count;
		}
		
		//arm
		static int power(int num, int count)
		{
			int power=1;
			while(count!=0)
			{
				power=power*num;
				count--;
			}
			return power;
		}
	public static void main(String[] args) {

		// palin("00123");
		// p(0010);
		// reverseString("virat");
		// palindromeString("level");
		// fib(25);
		// prime(12);
		// sortint("zebra");
		//vowels("aAEGGSJAHHEIIHihaiuh");
		//sumofEven(12222);
		//sumofOdd(112233);
		//rangeofArm(1000);
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int copy=scanner.nextInt();
		int num=copy;
		int sum=0;
		int count=count(num);
		while(num!=0)
		{
			int rem=num%10;
			int a=power(rem, count);
			sum+=a;
			num/=10;
		}
		
		if(sum==copy)
		{	
			System.out.println("armstrong");
		int	sum1=sumofEven(copy);
			if(sum1>0)
			System.out.println(sum1);
			else
				System.out.println("enterd number does not have even numbers");
		}
		else
		{
			System.out.println("not armstrong ");
			
			int sum1= sumofOdd(copy);
			
			if(sum1>0)
			System.out.println(sum1);
			else
				System.out.println("entered number does not have odd numbers");
		} 
		
		
		}
	}



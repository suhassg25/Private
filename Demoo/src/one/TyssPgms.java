package one;

import java.util.Scanner;

public class TyssPgms {
	//sum of n numbers
static void sumOfN(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}

//perfect number
static void perfect(int n)
{	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n>0 && n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		System.out.println(n+"  is perfect number");
	}
	else
		System.out.println(n+"  is  not a perfect");
}

//prime number
static void primeNumber(int n)
{
	 boolean flag=true;
	 for(int i=2;i<n;i++)
	 {
		 if(n%i==0)
		 {
			 flag=false;
			 break;
		 }
	 }
	if(flag)
	{
		System.out.println(n + "  is prime");
	}
	else
	{
		System.out.println("not a prime");
	}
}

//range of perfect
static void rangePerfect(int n)
{
	for(int i=1;i<=n;i++)
	{
		int sum=0;
		for(int j=1;j<=i/2;j++)
		{
			if(i%j==0)
			{
				sum+=j;
			}
		}
		if(sum==i)
		{
			System.out.println(i+ " is perfect");
		}
		else
			System.out.println(i+ " is not perfect");
	}
}

//facorial number
static void factorial(long n)
{
	long prod=1;
	for(long i=1;i<=n;i++)
	{
		prod*=i;
	}
	System.out.println("factorial of "+n+" is : "+ prod);
}

//rangeof Factorial
static void rangeOfFact(int n)
{
	for(int i=0;i<=n;i++)
	{	int prod=1;
		for(int j=1;j<=i;j++)
		{
			prod*=j;
		}
		System.out.println("factorial of "+i+" is "+prod);
	}
}
//decimal to binary
static void decimalToBin(int n)
{
int a[] = new int[20];
int c=0;
while(n>0)
{
a[c++]	= n%2;
n/=2; 
}
for(int i=c-1;i>-1;i--)
{
	System.out.print(a[i]);
}
System.out.println();
}

//binary to decimal
static void binToDec(int n)
{
	int d=0, a=0;
	while(true)
	{
		if(n==0)
		{
			break;
		}
		else
		{
			int t=n%10;
			d+=t*Math.pow(2, a);
			a++;
		n/=10;	
		}
	}
	System.out.println(d);
	
}

//decimal to hexa
public static void toHex(int decimal){    
    int rem;  
    String hex="";   
    char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
   while(decimal>0)  
    {  
      rem=decimal%16;   
      hex=hexchars[rem]+hex;   
      decimal=decimal/16;  
    }  
   System.out.println(hex);
}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
			System.out.println("Enter number ");
		
		
	}
}

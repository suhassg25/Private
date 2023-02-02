package one;

import java.util.Scanner;

public class Primerange {
	
	public static void prime(int n)
	{ int sum=0;
		for(int i=1;i<=n;i++ )
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.print(i+" ");
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter range of prime number");
		int i=scanner.nextInt();
		prime(i);
	}

}

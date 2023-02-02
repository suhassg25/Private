package Four;

import java.util.Scanner;

public class Diasuram {
	public static int count(int m) {
		int count = 0;
		while (m != 0) {
			m /= 10;
			count++;
		}
		return count;
	}
	
	public static int result(int a, int b)
	{
		int prod=1;
		while(a!=0)
		{
			prod*=b;
			a--;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENter a number");
		int n=s.nextInt();
		int copy=n;
		int sum=0;
		while(copy!=0)
		{
			int rem=copy%10;
			sum+=result(count(copy), rem);
			copy/=10;
		}
		System.out.println(n);
		if(n==sum)
		{
			System.out.println("Is disarium number");
		}
		else
		{
			System.out.println("Not disarium");
		}
	}
}

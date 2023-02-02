package one;

import java.util.Scanner;

public class Umesh {

	public static int sum(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum+rem;
			a/=10;
		}
		return sum;
	}
	
	public static boolean count(int a)
	{
		boolean b=false;
		for (int i=0;i<3;i++)
		{
			int d=a%10;
			int c=(a%100-d)/10;
			int e=(a%1000-((c*10)+d))/100;
			if(d==c || e==c || d==e)
			{
				b=true;
				break;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scanner.nextInt();
		if(count(a) && a>0 && a<501) {
			
			System.out.println(sum(a));
		}
		else
		{
			System.out.println("No duplicate numbers found");
		}
	}
}



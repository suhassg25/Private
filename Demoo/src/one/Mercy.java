package one;

import java.util.Scanner;

public class Mercy {
	

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		boolean flag=true;
		if(a==1)
		{
			System.out.println("Mercy");
		}
		if( a==2)
		{
			flag=false;
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0 )
			{
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			for(int i=0;i<a;i++)
			{
				if((Math.pow(2,i))-1 == a)
				{
					System.out.println("mercy");
				}
			}
		}
		else
		{
			System.out.println("Not a mercy");
		}
		
	}
}

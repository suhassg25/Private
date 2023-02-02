package Three;

import java.util.Scanner;

public class PrimeR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int x=s.nextInt();
		for(int i=1;i<=x;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
					
				}
			}
			if(flag)
			{
				System.out.println(i+" is prime ");
			}
			else
				System.out.println("Not a prime "+i);
		}
	}
}

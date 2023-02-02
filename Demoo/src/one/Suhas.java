package one;

import java.util.Scanner;

public class Suhas {
	
	public static void main(String[] args) {
		System.out.println("ENter size of array");
		Scanner s=new Scanner(System.in);
int h=s.nextInt();
		int [] a= new int[h];
		System.out.println("enter elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of array are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("ENter the number");
		int b=s.nextInt();
		int sum=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			while(a[i]!=0)
			{
				int x=a[i]%10;
				if(x==b)
				{	c++;
					sum=sum+x;
				}
				a[i]=a[i]/10;
			}
		}
		System.out.println(sum);
		System.out.println(c);
	}

}

package one;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int m=s.nextInt();
		int n=s.nextInt();
	
	System.out.println("enter elements");
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
				j=s.nextInt();
				
			}
			
		}
		System.out.println("matrix output is");
		for(int z=1;z<=m;z++)
		{
			for(int x=1;x<=n;x++)
			{
				System.out.print(x);
				
			}
			
		}
//		for(int i1=1;i1<=m;i1++)
//		{
//			for(int j1=1;j1<=n;j1++)
//			{
//				if(i1==((m/2)+1) && j1==((n/2)+1))
//				{
//					System.out.println(a[i1][j1]);
//				}
//				
//			}
	
	}
}

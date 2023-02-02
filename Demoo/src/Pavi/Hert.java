package Pavi;

import java.util.Scanner;

public class Hert {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter size of 2D arrays");
		
		int a[][] =new int[s.nextInt()][s.nextInt()];
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				a[i][j]=(j-i);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}}

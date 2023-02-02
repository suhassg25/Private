package one;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
	public static int []  read(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int []a=new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i +" element");
			a[i]=s.nextInt();
		}
		int [] b = read(a);
		int [] c =new int[b.length];
		int x =0;
		for(int i=0;i<b.length-1;i++)
		{
			if(b[i] ==b[i+1])
			{
				c[x] =b[i];
				x++;
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
	
}

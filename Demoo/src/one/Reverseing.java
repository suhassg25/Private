package one;

import java.util.Arrays;

public class Reverseing {

	public static void main(String[] args) {
		String s="", a="";
		int n=1010;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==0)
				s ="Zero ";
			else if(rem==1)
			s	="One ";
			else if(rem==2)
				s="Two ";
			else if(rem==3)
				s="Three ";
			else if(rem==4)
				s="Four ";
			else if(rem==5)
				s="Five ";
			else if(rem==6)
			s="Six ";
			else if(rem==7)
				s="Seven ";
			else if(rem==8)
				s="Eight ";
			else if(rem==9)
				s="Nine ";
			n/=10;
			a+=s;
			
		}
		String k="";
		String[] x=a.split(" ");
		for(int i=x.length-1;i>=0;i--)
		{
			k+=x[i]+" ";
		}
		
		System.out.println(k);
	}
}

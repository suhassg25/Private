package Pavi;

import java.util.Scanner;

public class pavan {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	String in=s.next();
	in+=s.next();
	
	String [] input=in.split(" ");
	String res[]=new String[input.length];
	for(String x : input)
	{
		int id=(x.charAt(x.length()-1)-'0');
		res[id-1]=x.substring(0,x.length()-1);
	}
	String st="";
	for(int i=0;i<res.length-1;i++)
	{
		st+=res[i];
		st+="";
	}
	st+=res[res.length-1];
	System.out.println(st);
}
}

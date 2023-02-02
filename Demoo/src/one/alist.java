package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class alist {

	static void interChange(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i==0 || i==s.length()-1) {
				
			}
			else
			{
				rev += s.charAt(i);
			}

		}
		System.out.println(rev);
	}
	
	
	static void anagram(String s1, String s2)
	{
		if(s1.length()==s2.length()) {
		String[] s3=s1.split("");
		String[] s4=s2.split("");
		Arrays.sort(s3);
		Arrays.sort(s4);
		String s5="",s6="";
	for(int i=0;i<s3.length;i++)
	{	
		s5+=s3[i];
		s6+=s4[i];
	}if(s5.equals(s6))
	{
		System.out.println("Anagram");
	}
	else
		System.out.println("not anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
	

	public static void main(String[] args) {

		
		  List list=new ArrayList(); list.add(10.8); list.add("hi"); list.add(82.8);
		  list.add("hello"); list.add(10); list.add("10");
		  
		  List l2=new ArrayList();
		  
		  for(int i=0;i<list.size();i++) { Object obj=list.get(i); if (obj instanceof
		  Double) { System.out.println(obj); } }
//		 
//		interChange("harry");
//	anagram("cat time","time");
	
	}
}

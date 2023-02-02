package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamAPI {
static int [] sort(int []a)
{
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
		int a[] = {1,5,2,8,9,3,2,4,5,1,2,3};
		 int b[]=sort(a);
		Set< Integer> integers=new TreeSet<Integer>();
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		for(int i =0;i<b.length;i++ )
		{
			integers.add(b[i]);
		}
		for(int i =0;i<a.length;i++)
		{	int count=0;
			for(Integer i1 : integers)
			{
				if(i1==a[i])
				{
					count++;
				}
			}
			map.put(a[i], count);
		}
		System.out.println(map);

	}}


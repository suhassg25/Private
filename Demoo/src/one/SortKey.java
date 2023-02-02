package one;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortKey {

	public static void main(String[] args) {
		String s1 = "Hello World";
		Set<Character> characters = new TreeSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			characters.add(s1.charAt(i));
		}
		Map<Character, Integer> set = new TreeMap<Character, Integer>();
		for (Character c : characters) {
			int count = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (c == s1.charAt(j)) {
					count++;
				}
				set.put(c, count);
			
			}
			}
		int a[] = new int[set.size()];
		int x=0;
	for(java.util.Map.Entry<Character, Integer> en : set.entrySet()) {
		a[x]=en.getValue();
		x++;
	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int f=0;
	char s[]=new char[10];
	for(java.util.Map.Entry<Character, Integer> eno : set.entrySet()) {
		if(a[f]==eno.getValue())
		{
			s[f]=eno.getKey();
		}
		f++;
	}
	System.out.println(Arrays.toString(s));
	}
}

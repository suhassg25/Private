package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface And {
	void hi(String s);
}

public class LamdaExp {

	public static void main(String[] args) {
		And a = (hi) -> System.out.println("hi");
		a.hi("hello");
		
		
		List< Integer> numList= Arrays.asList(1,5,3,9,10,992984378,9824989);
		numList.stream().forEach(n -> System.out.print(n+" "));
		System.out.println();
		numList.stream().sorted().forEach(n-> System.out.print(n+" "));
		
		
	}
}

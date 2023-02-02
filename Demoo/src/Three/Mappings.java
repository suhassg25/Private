package Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;

import one.StreamAPI;

public class Mappings {

public static void main(String[] args) {

	for(int i=1;i<4;i++)
	{
		for(int j=4;j>0;j--)
		{
			if(i>=j )
				System.out.print(" *  ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	for(int i=7;i>0;i--)
	{
		for(int j=4;j>0;j--)
		{
			if(i>=j)
				System.out.print(" *  ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}

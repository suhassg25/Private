package one;

public class Substring {

	public static void main(String[] args) {
		String s="Hello";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}

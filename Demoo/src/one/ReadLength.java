package one;

public class ReadLength {
	
	public static void length(String a)
	{
		String [] s=a.split(" ");
		String s1=a.replaceAll(" ", "  ");
		String s2="";
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"  -->  "+s[i].length() );
			
		}
		System.out.println(s1);
		for(int j=s1.length()-1;j>-1;j--)
		{
			s2=s2+s1.charAt(j);
		}
		System.out.println(s2);
	}
	
	static void vowels(String a)
	{
		String [] s=a.split("");
		String j="";
		for(int i=0;i<s.length;i++) {
			if(!s[i].equals("a") && !s[i].equals("i") && !s[i].equals("o") && !s[i].equals("u") && !s[i].equals("e") )
			{
				j+=s[i];
			}
			
		}
		System.out.println(j);
		
	}
	
public static void main(String[] args) {

	
}
}
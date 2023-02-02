package one;

public class Binary {
	static String bin(int a)
	{ int b=0;
		while(a!=0)
		{
			int c=a%2;
			a/=2;
			b=b*10+c;
//		if(c==0)
//		{
//			return c+""+b ;
//		}
		}
		return b+"0 ";
	}
	static void palin(int a)
	{ int rev=0;
		while(a!=0)
		{
			int rem=a%10;
			
				rev=rev*10+rem;
			if(rev==0)
			{
				System.out.print("0"+rev);
			}
			else
			{
				System.out.print(rev);
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println(bin(10));
		
	}

}

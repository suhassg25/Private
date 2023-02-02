package Three;

public class DuckNumber {

	public static void range(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int copy=i;
			while(copy!=0)
			{
				int rem=copy%10;
				if(rem==0)
				{
					System.out.println(i+" is a duck number");
				}
				copy/=10;
			}
		}
	}
	public static int fact(int n)
	{	int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void Strong(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int copy=i,sum=0;
			while(copy!=0)
			{
				int rem=copy%10;
				sum=sum+fact(rem);
				copy/=10;
				
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Strong(155);
	}
}

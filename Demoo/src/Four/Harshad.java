package Four;

public class Harshad {

	public static int result(int n)
	{
		int copy=n, sum=0;
		while(copy!=0)
		{
			int rem=copy%10;
			sum+=rem;
			copy/=10;
			
		}
		if(n%sum==0)
		{
			return n;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		int n=24;
		if(result(n)>0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("not harshad");
		}
	}
}

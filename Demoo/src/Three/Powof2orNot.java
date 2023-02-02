package Three;

public class Powof2orNot {

	public static void Power(int n)
	{
		while(n%2==0)
		{
			n=n/2;
			if(n==2)
			{
				System.out.println("Pow 2");
			}
			else
			{
				System.out.println("Not power");
			}
		}
	}
	public static void main(String[] args) {
		
		int n=7;
for(int i=1;i<=n;i++) {
	
	for(int j=1;j<=n;j++)
	{
		if(i==(n/2)+1 || j==(n/2)+1 || i+j==n-2 || i+j==(n-1)*2-1 ||i+j==n && i<n-1 && i>1 || i+j==n+2 && i>2 && i<n )
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println();
	
}
	}
}

package one;

public class NumberSystems {
	//bin to dec
	static void BintoDec(int n)
	{	int c=0;
		int a[]=new int[40];
		while(n>0)
		{
			a[c++]=n%2;
			n/=2;
		}
		for(int i=c-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}

	//dec to bin
	static void decToBin(int a)
	{	
		
	}
	
	public static void main(String[] args) {
		decToBin(1000);
		
	}
}

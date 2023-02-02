package one;

class B
{
void	view()
	{
		System.out.println("view");
	}
}
class C extends B
{
	
	void text()
	{
		super.view();
		System.out.println("text");
	}
}

public class A {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || i==5|| j==4)
				System.out.print(i+" ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

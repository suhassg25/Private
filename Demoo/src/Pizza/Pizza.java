package Pizza;

import java.util.Scanner;

public class Pizza {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of teams");
		int [] a=new int[s.nextInt()];
		int x=a.length;
		
		System.out.println("Enter the time interval of Game (in minutes)");
		int game=s.nextInt();
		while(x!=0)
		{	int a1=0,a2=0,a3=0,a4=0;
		System.out.println("Enter number of Pizzas available");
		int pizza=s.nextInt();
		System.out.println("Enter team details");
			System.out.println("Enter first person taken time to eat");
			a1=game/s.nextInt();
			pizza-=a1;
			System.out.println("Enter second person taken time to eat");
			a2=game/s.nextInt();
			pizza-=a2;
			System.out.println("Enter third person taken time to eat");
			a3=game/s.nextInt();
			pizza-=a3;
			System.out.println("Enter fourth person taken time to eat");
			a4=game/s.nextInt();
			pizza-=a4;
			int a5=a1+a2+a3+a4;
			x--;
			if(pizza>0)
			a[x]=a5;
			System.out.println(pizza);
			
		}
		for(int i=a.length-1;i>-1;i--)
		{
			for(int j=a.length-1;j>0;j--)
			{
				if(a[j]>a[j-1])
				{
					System.out.println(j +" Team own by eating " +a[j] +" pizzas became PIZZA_KING");
				}
				
			}
			
		}
	}

}


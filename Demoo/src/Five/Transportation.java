package Five;

import java.util.Scanner;

public class Transportation {

	public static void main(String[] args) {
		boolean tr=true;
		Scanner s=new Scanner(System.in);
while(tr)
{
	
	System.out.println("Enter \n1.to Truck \n2.to Bus \n3.to Exit");
	switch(s.nextInt())
	{
	case 1 :
	{	
	
		System.out.println("Enter Registration of Vehicle");
		String reg=s.next();
		System.out.println("Enter vehicle speed");
		long speed=s.nextLong();
		System.out.println("Enter fuel capacity");
		long fuelCap=s.nextLong();
		System.out.println("Enter fuel consumption");
		long fuelCon=s.nextLong();
		System.out.println("Enter Cargo limit");
		long cargo=s.nextLong();
		System.out.println("enter number of Kilo meter to be travelled to check fuel needed in ltrs");
		Truck t =new Truck(reg, speed, fuelCap, fuelCon, cargo);
		t.fuelNeeded(s.nextLong());
		System.out.println("Enter time to check distance Covered");
		t.distanceCovered(s.nextLong());
		t.display();
		
	} break;
	case 2 :
	{
		System.out.println("Enter Registration of Vehicle");
		String reg=s.next();
		System.out.println("Enter vehicle speed");
		long speed=s.nextLong();
		System.out.println("Enter fuel capacity");
		long fuelCap=s.nextLong();
		System.out.println("Enter fuel consumption");
		long fuelCon=s.nextLong();
		System.out.println("Enter No of passengers");
		long cargo=s.nextLong();
		System.out.println("enter number of Kilo meter to be travelled to check fuel needed in ltrs");
		Bus b =new Bus(reg, speed, fuelCap, fuelCon, cargo);
		b.fuelNeeded(s.nextLong());
		System.out.println("Enter time to check distance Covered");
		b.distanceCovered(s.nextLong());
		b.display();
	}break;
	
	case 3 : tr=false;
	}
	
}
	}
}

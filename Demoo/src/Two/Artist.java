package Two;

import java.util.Scanner;

public class Artist {
public static void main(String[] args) {
	
	FactoryProducer factoryProducer=new FactoryProducer();
	Scanner scanner=new Scanner(System.in);
while(true)
{
	System.out.println("enter 1 to start 2 to end");
	switch(scanner.nextInt()) {
	
	case 1 :{

		System.out.println("1.For Blue \n2.For Red \n3.For Green");
		int a=scanner.nextInt();
		System.out.println(" 1.For Square \n2.For Rectangle \n3.For Circle");
		
		factoryProducer.getFactory(a, scanner.nextInt());
	} break;
	case 2 : System.exit(0);
}
}
}
}

package one;

import java.util.Random;

public class OTPgen {

	public static void main(String[] args) {
		Random random=new Random();
		int otp=0, c=0;
		for(int i=1;i<7;i++)
		{
			int a=random.nextInt(1,10);
				otp=(otp*10)+a;
				
		}
		
		System.out.println(otp);
		
		while(otp!=0)
		{
			otp/=10;
			c++;
		}
		System.out.println(c);
	}
}

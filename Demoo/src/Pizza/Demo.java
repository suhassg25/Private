package Pizza;

import java.util.Scanner;

public class Demo {

	public static int fact(int n) {
		int f = 1;
		if (n == 1) {
			return 0;
		}
		return f *= fact(n - 1);

		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int a = s.nextInt();
		System.out.println(fact(a));
	}
}

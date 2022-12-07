package sample;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String args[]) {

		int a, b;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a and b values");
		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Before swapping\n a = " + a + "\nb = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping\n a = " + a + "\nb = " + b);

	}
}

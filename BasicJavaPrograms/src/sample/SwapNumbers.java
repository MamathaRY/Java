package sample;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String args[]) {

		int a, b, temp;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a and b values");
		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Before swapping\n a = " + a + "\nb = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping\n a = " + a + "\nb = " + b);

	}
}

package sample;

import java.util.Scanner;

public class OddEven {

	public static void main(String args[]) {

		int x;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an Inyeger");

		x = in.nextInt();

		if (x % 2 == 0)
			System.out.println("Even");

		else
			System.out.println("odd");

	}
}

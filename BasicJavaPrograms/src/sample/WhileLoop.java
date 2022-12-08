package sample;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String args[]) {
		int n;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a num");
		n = in.nextInt();
		while (n != 11) {
			System.out.println("N = " + n);
			n++;
		}
		System.out.println("Out of loop");

	}

}

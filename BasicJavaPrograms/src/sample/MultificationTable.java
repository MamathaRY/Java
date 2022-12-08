package sample;

import java.util.Scanner;

public class MultificationTable {

	public static void main(String args[]) {
		int m;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer to print it's multiplication\r\n" + "table");
		m = in.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(m + "*" + i + " = " + (m * i));
		}
	}

}

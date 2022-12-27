package MatrixPrograms;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		int m, n, i, j;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of rows and column");
		m = in.nextInt();
		n = in.nextInt();

		int first[][] = new int[m][n];
		int transpose[][] = new int[m][n];

		System.out.print("Enter the elements of first matrix");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++) {
				first[i][j] = in.nextInt();
			}

		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++) {
				transpose[j][i] = first[i][j];
			}

		System.out.println("Sum of entered matrices:-");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(transpose[i][j] + "\t");
			System.out.println();

		}

	}
}
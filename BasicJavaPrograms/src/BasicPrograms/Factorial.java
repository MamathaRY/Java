package BasicPrograms;

public class Factorial {

	static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String args[]) {
		int n = 5;
		System.out.println("Factorial =" + factorial(n));

	}
}

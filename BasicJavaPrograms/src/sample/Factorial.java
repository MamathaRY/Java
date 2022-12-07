package sample;

public class Factorial {

 int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
 
	public static void main(String args[]) {
		int n = 5;
		int m;
		Factorial f = new Factorial();
		m = f.factorial(n);
		System.out.println("Factorial =" + m);

	}
}

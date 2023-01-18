package BasicPrograms;

public class PrimeNumber {

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		else if (n == 2 || n == 3)
			return true;

// It is navie method ... i.e., checking number less than N is multiple of it or not 

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;

		}
		return true;

	}

	public static void main(String args[]) {
		int n = 19;

		if (isPrime(n))

			System.out.println("Number is prime");

		else
			System.out.println("Number is not prime");
	}

}

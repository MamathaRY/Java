package BasicPrograms;

public class PalindromeNum {

	public static void main(String[] args) {
		int n = 454;
		int temp = n;

		int rev = 0; // reversed number
		int rem; // remainder

		while (n > 0) {

			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (temp == rev)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}

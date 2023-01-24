package JavaStrings;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "aba", rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev))
			System.out.print("String is palindrome");
		else

			System.out.print("String is not palindrome");

	}

}

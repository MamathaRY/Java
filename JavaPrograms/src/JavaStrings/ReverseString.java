package JavaStrings;

public class ReverseString {

	// method 1
	/*
	 * public static void main(String[] args) { String str = "sample", rev = "";
	 * char ch; System.out.println(str);
	 * 
	 * for (int i = 0; i < str.length(); i++) {
	 * 
	 * ch = str.charAt(i); // extracts each character rev = ch + rev; // adds each
	 * character in front of the existing string }
	 * System.out.println("Reversed word: " + rev); }
	 */

	// Using built in reverse() method of the StringBuilder class:

	/*
	 * public static void main(String[] args) { String str = "Sample";
	 * 
	 * StringBuilder input= new StringBuilder();
	 * 
	 * // append a string into StringBuilder input
	 *  input.append(str);
	 * 
	 * // reverse StringBuilder input
	 *  input.reverse();
	 * 
	 * // print reversed String
	 *  System.out.println(input); }
	 */

	// Converting String to character array: The user input the string to be
	// reversed.

	public static void main(String[] args) {
		String input = "Sample";

		// convert String to character array
		// by using toCharArray
		char[] str = input.toCharArray();

		for (int i = str.length - 1; i >= 0; i--)
			System.out.print(str[i]);
	}
}

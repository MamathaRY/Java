package JavaStrings;

public class BlankSpace {
	public static void main(String[] args) {
		String str = "   Remove spaces in text     ";

		// Remove leading and trailing spaces (only first space )
		System.out.println(str.trim());

		// Call the replaceAll() method
		str = str.replaceAll("\\s", "");

		System.out.println(str);

	}

}

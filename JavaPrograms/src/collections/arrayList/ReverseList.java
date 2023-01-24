package collections.arrayList;

import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>(
		// adding element
		Arrays.asList(10, 20, 3, 7, 8, 520, 90));

		Collections.reverse(num);
		System.out.println(num);

	}
}

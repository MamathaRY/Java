package collections.list;

import java.util.LinkedList;
import java.util.List;

public class OddNumList {
	public static boolean OddNumber(List<Integer> n) {
		for (int i : n) {
			if (i % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> n = new LinkedList<Integer>();
		n.add(30);
		n.add(5);
		n.add(20);
		
		if (OddNumber(n))
			System.out.println("odd");
		else
			System.out.println("even");

	}
}

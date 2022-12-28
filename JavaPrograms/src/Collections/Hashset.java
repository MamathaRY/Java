package Collections;

import java.util.*;

public class Hashset {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

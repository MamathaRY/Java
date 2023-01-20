package collections;

import java.util.*;

class HashMapExample {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "A");
		map.put(101, "B");
		map.put(102, "C");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
package Collections;

import java.util.*;

class ArrylistExample {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("A1");// Adding object in arraylist
		list.add("B1");
		list.add("C1");
		list.add("D1");

//Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
package arrayPrograms;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 30, 1, 5, 12 };
		System.out.println("Before :" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After :" + Arrays.toString(arr));

	}
}

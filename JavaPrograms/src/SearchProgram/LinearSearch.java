package SearchProgram;

public class LinearSearch {

	static int search(int arr[], int n, int k) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				return i;

		}
		// return -1 if the element is not found

		return -1;
	}

	public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 7, 5 };
		int k = 7;
        int n = arr.length;

		int index = search(arr, n, k);

		if (index == -1)

			System.out.print("Number not found");

		else
			System.out.print("Number found in the position of\n" + index);
	}
}

package SortProgram;

public class BubbleSort {

	static void sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 20, 5, 8, 2, 30, 10 };

		System.out.println("Array before sort\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		sort(arr);

		System.out.println("\nArray after sort\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}

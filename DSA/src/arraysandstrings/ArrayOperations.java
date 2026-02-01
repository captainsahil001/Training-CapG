package arraysandstrings;

import java.util.Arrays;

public class ArrayOperations {

	// position is 0-based (0 means insert at beginning)
	public static int[] insertAt(int[] arr, int element, int position) {
		if (position < 0 || position > arr.length) {
			throw new IllegalArgumentException("Invalid position: " + position);
		}

		int[] result = new int[arr.length + 1];

		// copy before position
		for (int i = 0; i < position; i++) {
			result[i] = arr[i];
		}

		// insert element
		result[position] = element;

		// copy after position
		for (int i = position; i < arr.length; i++) {
			result[i + 1] = arr[i];
		}

		return result;
	}

	// position is 0-based
	public static int[] deleteAt(int[] arr, int position) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Cannot delete from empty array.");
		}
		if (position < 0 || position >= arr.length) {
			throw new IllegalArgumentException("Invalid position: " + position);
		}

		int[] result = new int[arr.length - 1];

		// copy before position
		for (int i = 0; i < position; i++) {
			result[i] = arr[i];
		}

		// copy after position (shift left)
		for (int i = position + 1; i < arr.length; i++) {
			result[i - 1] = arr[i];
		}

		return result;
	}

	// left rotate by d positions
	public static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		if (n == 0)
			return;

		d = d % n; // handle d > n
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		int[] inserted = insertAt(a, 99, 2); // 0-based index 2
		System.out.println("After insert: " + Arrays.toString(inserted));

		int[] deleted = deleteAt(a, 3); // delete element at index 3 (40)
		System.out.println("After delete: " + Arrays.toString(deleted));

		int[] b = { 1, 2, 3, 4, 5 };
		leftRotate(b, 2);
		System.out.println("After left rotate by 2: " + Arrays.toString(b));
	}

}

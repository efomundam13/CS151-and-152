
public class SelectionSort {
	public static void selectionSort(int[] arr) {
		// Check if the array is null or empty.
		if (arr == null || arr.length == 0) {
			return;
		}

		// Iterate over the array from the beginning to the end.
		for (int i = 0; i < arr.length - 1; i++) {

		// Find the minimum element in the array starting from the current index.
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
		    }
		}

		// Swap the current element with the minimum element.
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
		}
	}
}

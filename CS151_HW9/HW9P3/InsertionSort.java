
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		// Check if the array is null or empty.
		if (arr == null || arr.length == 0) {
			return;
		}
		
		// Iterate over the array from the second element to the last element.
		for (int i = 1; i < arr.length; i++) {

		// Store the current element.
		int current = arr[i];

		// Iterate over the elements before the current element, from the beginning to the end.
		for (int j = i - 1; j >= 0; j--) {
			// Check if the current element is less than the element at the current index.
		    if (current < arr[j]) {
		    	// Swap the current element with the element at the current index.
		        arr[j + 1] = arr[j];
		        arr[j] = current;
		    } else {
		        break;
		      }
		    }
		  }
		}

}

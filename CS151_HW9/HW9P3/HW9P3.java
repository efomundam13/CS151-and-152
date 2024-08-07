/*
Use either the selectionSort() or insertionSort() methods we wrote in class
to solve the following two problems
*/
public class HW9P3 {
/*
3a. Given a 2-dimensional array arr, write a static method rowSort(arr) which sorts
each of the rows in the array. 
*/

public static void rowSort(int[][] arr) {
	// Check if the array is null or empty.
	if (arr == null || arr.length == 0) {
		return;
	}

	// Iterate over the rows of the array.
	for (int i = 0; i < arr.length; i++) {
		// Sort the current row.
		insertionSort(arr[i]);
	}
}	

/*
3b. Given a 2-dimensional array arr,write a static method columnSort(arr) which
sorts each of the columns in the array.
*/

public static void columnSort(int[][] arr) {
	  // Check if the array is null or empty.
	  if (arr == null || arr.length == 0) {
	    return;
	  }

	  // Create a new array to store the sorted columns.
	  int[][] sortedColumns = new int[arr[0].length][arr.length];

	  // Iterate over the columns of the array.
	  for (int j = 0; j < arr[0].length; j++) {

	    // Iterate over the rows of the array.
	    for (int i = 0; i < arr.length; i++) {

	      // Store the current value in the sorted columns array.
	      sortedColumns[j][i] = arr[i][j];
	    }

	    // Sort the current column.
	    insertionSort(sortedColumns[j]);
	  }

	  // Copy the sorted columns back to the original array.
	  for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[0].length; j++) {
	      arr[i][j] = sortedColumns[j][i];
	    }
	  }
	}
}

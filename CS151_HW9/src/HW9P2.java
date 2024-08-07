/*
2. Write a method static int max(int[][] a) which returns the maximum value
in the 2-dimensional array a 
*/

public class HW9P2 {
	public static int max(int[][] a) {
		  // Check if the array is null or empty.
		  if (a == null || a.length == 0) {
		    return Integer.MIN_VALUE;
		  }

		  // Initialize the maximum value.
		  int maxValue = Integer.MIN_VALUE;

		  // Iterate over the rows of the array.
		  for (int i = 0; i < a.length; i++) {

		    // Iterate over the columns of the row.
		    for (int j = 0; j < a[i].length; j++) {

		      // Check if the current value is greater than the maximum value.
		      if (a[i][j] > maxValue) {
		        maxValue = a[i][j];
		      }
		    }
		  }

		  return maxValue;
		}
}

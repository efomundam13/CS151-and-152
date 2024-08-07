/*
1.Write a method static boolean isSquare(int[][] a) which returns true is
the array is a “square” array and false otherwise. A square array is defined as follows: if
a has n rows, then each row must contain exactly n elements. Note that a may be a ragged
array.
*/

public class HW9P1 {
	public static boolean isSquare(int[][] a) {
		  // Check if the array is null or empty.
		  if (a == null || a.length == 0) {
		    return false;
		  }

		  // Check if all rows have the same number of elements.
		  int numElements = a[0].length;
		  for (int i = 1; i < a.length; i++) {
		    if (a[i].length != numElements) {
		      return false;
		    }
		  }

		  return true;
		}
}

/*
5. An example of a spiral fill of a 5 by 5 array is shown below.
 0  1  2  3 4
15 16 17 18 5
14 23 24 19 6
13 22 21 20 7
12 11 10  9 8

	a.Write a non-recursive routine void spiralFill(int [][] a, int n) and performs a
spiral fill in the first n rows and columns.
	b.Devise a recursive routine to perform the spiral fill function. Each recursive call should
fill in one hollowed-out square of the grid, starting with the outermost. You will need
to determine 1) what information must be passed to each recursive call and 2) when to
stop the recursion.
*/
public class HW3P5 {
	//a
	public static void spiralFill(int[][] a, int n) {
		  int row = 0;
		  int col = 0;
		  int numElements = n * n;
		  int val = 1;
		  while (numElements > 0) {
		    for (int i = 0; i < n && numElements > 0; i++) {
		      a[row][col] = val;
		      numElements--;
		      col++;
		    }
		    row++;
		    for (int i = 0; i < n && numElements > 0; i++) {
		      a[row][col] = val;
		      numElements--;
		      row++;
		    }
		    col--;
		    for (int i = 0; i < n && numElements > 0; i++) {
		      a[row][col] = val;
		      numElements--;
		      col--;
		    }
		    row--;
		    for (int i = 0; i < n && numElements > 0; i++) {
		      a[row][col] = val;
		      numElements--;
		      row--;
		    }
		    col++;
		  }
		}
	
	//b
	public static void spiralFill(int[][] a, int startRow, int startCol, int endRow, int endCol) {
		  if (startRow > endRow || startCol > endCol) {
		    return;
		  }
		  for (int i = startCol; i <= endCol; i++) {
		    a[startRow][i] = 1;
		  }
		  for (int i = startRow + 1; i <= endRow; i++) {
		    a[i][endCol] = 1;
		  }
		  for (int i = endCol - 1; i >= startCol; i--) {
		    a[endRow][i] = 1;
		  }
		  for (int i = endRow - 1; i >= startRow + 1; i--) {
		    a[i][startCol] = 1;
		  }
		  spiralFill(a, startRow + 1, startCol + 1, endRow - 1, endCol - 1);
		}
	
}

/*
4.  magic square is a n × n grid of numbers where the sum of all the rows, columns
and long diagonals are the same. Below are two examples of magic squares:

1 15 14 4
12 6 7 9
8 10 11 5
13 3 2 16

48 13 62
55 41 27
20 69 34

Write a method static boolean isMagic(int [][] grid) which returns true is the num-
bers in grid form a magic square. Feel free to use any methods you’ve already written for
earlier problems in this homework.
*/

public class HW9P4 {
	public static boolean isMagic(int[][] grid) {

		  // Check if the grid is null or empty.
		  if (grid == null || grid.length == 0) {
		    return false;
		  }

		  // Check if the grid is square.
		  int n = grid.length;
		  for (int i = 0; i < n; i++) {
		    if (grid[i].length != n) {
		      return false;
		    }
		  }

		  // Check if the sum of all the rows, columns, and diagonals are the same.
		  int sum = 0;
		  for (int i = 0; i < n; i++) {
		    sum += grid[i][0];
		  }
		  for (int i = 0; i < n; i++) {
		    int rowSum = 0;
		    for (int j = 0; j < n; j++) {
		      rowSum += grid[i][j];
		    }
		    if (rowSum != sum) {
		      return false;
		    }
		  }
		  for (int i = 0; i < n; i++) {
		    int colSum = 0;
		    for (int j = 0; j < n; j++) {
		      colSum += grid[j][i];
		    }
		    if (colSum != sum) {
		      return false;
		    }
		  }
		  int diag1Sum = 0;
		  for (int i = 0; i < n; i++) {
		    diag1Sum += grid[i][i];
		  }
		  if (diag1Sum != sum) {
		    return false;
		  }
		  int diag2Sum = 0;
		  for (int i = 0; i < n; i++) {
		    diag2Sum += grid[i][n - 1 - i];
		  }
		  if (diag2Sum != sum) {
		    return false;
		  }

		  // All checks passed, so the grid is a magic square.
		  return true;
		}
}

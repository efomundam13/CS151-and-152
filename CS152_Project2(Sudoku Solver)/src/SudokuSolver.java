import java.util.*;
import java.io.*;

public class SudokuSolver {

    private static final int[][] BOARD = new int[9][9];
    private static final int[] POSSIBLE_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the input file name
        System.out.println("Enter the input file name:");
        String filename = scanner.nextLine();

        // Read in the Sudoku grid from the file
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    BOARD[i][j] = fileScanner.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        // Solve the Sudoku puzzle using backtracking
        solve(0, 0);

        // Print the solution
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(BOARD[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void solve(int row, int col) {
        // If we've reached the end of the grid, we're done!
        if (row == 9) {
            return;
        }

        // Iterate through all possible values for the current cell
        for (int value : POSSIBLE_VALUES) {
            // If the value is valid, try it out
            if (isValid(row, col, value)) {
                BOARD[row][col] = value;
                solve(row + 1, 0);

                // If we found a solution, we can stop here
                if (row == 9) {
                    return;
                }
            }
        }

        // If we couldn't find a valid value for the current cell, backtrack
        BOARD[row][col] = 0;
    }

    private static boolean isValid(int row, int col, int value) {
        // Check if the value is already in the current row
        for (int i = 0; i < 9; i++) {
            if (BOARD[row][i] == value) {
                return false;
            }
        }

        // Check if the value is already in the current column
        for (int i = 0; i < 9; i++) {
            if (BOARD[i][col] == value) {
                return false;
            }
        }

        // Check if the value is already in the current 3x3 subgrid
        int subrow = row / 3;
        int subcol = col / 3;
        for (int i = subrow * 3; i < subrow * 3 + 3; i++) {
            for (int j = subcol * 3; j < subcol * 3 + 3; j++) {
                if (BOARD[i][j] == value) {
                    return false;
                }
            }
        }

        // If we made it here, the value is valid
        return true;
    }
}
import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for two numbers that are important to him/her.
        System.out.println("Enter two numbers that are important to you: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Randomly choose a value for c so that a + b + c is a multiple of 3.
        int c = (a + b) % 3;
        while (c != 0) {
            c = (int) (Math.random() * 10000);
        }

        // Create a 3 × 3 integer array and fill it with values using the formulas above.
        int[][] grid = new int[3][3];
        grid[0][0] = a;
        grid[0][1] = b;
        grid[0][2] = c;
        grid[1][0] = b + 4 * c - 2 * a;
        grid[1][1] = a + b + c;
        grid[1][2] = b + 4 * a - 2 * c;
        grid[2][0] = 2 * a + 2 * b - c;
        grid[2][1] = 2 * a + 2 * c - b;
        grid[2][2] = 2 * b + 2 * c - a;

        // Output the magic square to the screen.
        printMagicSquare(grid);
    }

    public static void printMagicSquare(int[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
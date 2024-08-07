import java.util.Scanner;

public class PlayingCards {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Create a Deck object and shuffle it.
        Deck d = new Deck();
        d.shuffle();

        // Create a 5 × 5 grid of cards.
        Card[][] grid = new Card[5][5];

        // Fill the grid with cards from the deck.
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                grid[row][col] = d.getNextCard();
            }
        }

        // Display the grid.
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        // Determine and output the number of spades in each row and column.
        int[] numSpadesInRow = new int[5];
        int[] numSpadesInColumn = new int[5];
        for (int row = 0; row < 5; row++) {
            int numSpades = 0;
            for (int col = 0; col < 5; col++) {
                if (grid[row][col].getSuit() == Card.SPADES) {
                    numSpades++;
                }
            }
            numSpadesInRow[row] = numSpades;
        }
        for (int col = 0; col < 5; col++) {
            int numSpades = 0;
            for (int row = 0; row < 5; row++) {
                if (grid[row][col].getSuit() == Card.SPADES) {
                    numSpades++;
                }
            }
            numSpadesInColumn[col] = numSpades;
        }
        System.out.println("Number of spades in each row: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numSpadesInRow[i] + " ");
        }
        System.out.println();
        System.out.println("Number of spades in each column: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numSpadesInColumn[i] + " ");
        }
    }
}
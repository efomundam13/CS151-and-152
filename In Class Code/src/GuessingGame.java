
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		final int MAX_TARGET = 100;
		
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		char ans;
		int numGames = 0;
		int totalGuesses = 0;
		do {
			int target = rnd.nextInt(MAX_TARGET) + 1;
			int guess;
			int numGuesses = 0;
			numGames++;
			do {
				System.out.print("Enter a number between 1 and " + MAX_TARGET + " ---> ");
				guess = in.nextInt();
				numGuesses++;
				if (guess < target) {
					System.out.println("Too Low");
				}
				else if (guess > target) {
					System.out.println("Too High");
				}
			} while(guess != target);
			System.out.println("Congratulations, the target was " + target);
			System.out.println("You got it in " + numGuesses + " guesses ");
			totalGuesses += numGuesses;
			
			System.out.print("Play again (y/n)? --- ");
			ans = in.next().toLowerCase().charAt(0);
			} while(ans == 'y');
		
			double avgGuesses = (double)totalGuesses/numGames;
			System.out.println("You played " + numGames + " games and averaged " + avgGuesses + " guesses");
			}
	}


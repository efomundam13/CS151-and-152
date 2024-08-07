/*
Programming Project 2, pg. 168, with the following modifications: you should
prompt the user for the number of games to simulate. If (and only if) the number of games
is 1, you should just output what happens in that game. Three different possible outputs for
a single game are shown below:
Player rolls 7 Player rolls 5 Player rolls 3
Player wins! Point set at 5 Player loses
Player rolls 9
Player rolls 12
Player rolls 6
Player rolls 7
Player loses
If the number of games is > 1 output the number of wins and the number of losses in addition
to outputting the probability of winning.
To generate a random dice roll you need to do two things:
(a) Use the Random class in the java.util package to create a Random object:
Random rnd = new Random();
(b) Use this object as follows to generate a random dice roll:
int roll;
...
roll = rnd.nextInt(6) + 1;
The method call rnd.nextInt(6) returns a random number in the range 0, 1, . . . , 5.
Adding one to it gives a random value in the range 1, 2, . . . , 6.
I suggest you use the following approach to solve this problem:
(a) First, write code to simulate a single game of craps, complete with output statements
displaying each roll as well as the number of wins, losses and win probability.
(b) After you have that code working, then add code to prompt the user for the number
of games to simulate and then place your previous code inside another loop (be sure to
indent appropriately). You’ll also want to add if statements to make sure that some of
the output only happens when the number of games to play = 1.
*/

import java.util.Scanner;
import java.util.Random;
public class HW5P5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();

        // Prompt the user for the number of games to simulate.
        System.out.println("How many games do you want to simulate? ");
        int numGames = scanner.nextInt();

        // Initialize the number of wins and losses to 0.
        int wins = 0;
        int losses = 0;

        // Loop through the number of games specified by the user.
        for (int i = 0; i < numGames; i++) {
            // Initialize the point to 0.
            int point = 0;

            // Loop until the player wins or loses.
            while (true) {
                // Roll the dice.
                int roll1 = rnd.nextInt(6) + 1;
                int roll2 = rnd.nextInt(6) + 1;

                // Display the roll.
                System.out.println("Player rolls " + roll1 + " + " + roll2 + " = " + (roll1 + roll2));

                // If the player rolls a 7 or 11 on the first roll, they win.
                if (roll1 + roll2 == 7 || roll1 + roll2 == 11) {
                    System.out.println("Player wins!");
                    wins++;
                    break;
                }

                // If the player rolls a 2, 3, or 12 on the first roll, they lose.
                if (roll1 + roll2 == 2 || roll1 + roll2 == 3 || roll1 + roll2 == 12) {
                    System.out.println("Player loses");
                    losses++;
                    break;
                }

                // Otherwise, the point is set to the first roll and the player continues to roll until they either roll the point or 7.
                point = roll1 + roll2;
                System.out.println("Point set at " + point);

                // Loop until the player rolls the point or 7.
                while (true) {
                    // Roll the dice.
                    int roll3 = rnd.nextInt(6) + 1;
                    int roll4 = rnd.nextInt(6) + 1;

                    // Display the roll.
                    System.out.println("Player rolls " + roll3 + " + " + roll4 + " = " + (roll3 + roll4));

                    // If the player rolls the point, they win.
                    if (roll3 + roll4 == point) {
                        System.out.println("Player wins!");
                        wins++;
                        break;
                    }

                    // If the player rolls 7, they lose.
                    if (roll3 + roll4 == 7) {
                        System.out.println("Player loses");
                        losses++;
                        break;
                    }
                }
            }
        }

        // Display the number of wins and losses.
        System.out.println("Number of wins: " + wins);
        System.out.println("Number of losses: " + losses);
        System.out.println("Win probability: " + (double) wins / (double)(wins + losses));
    }
}
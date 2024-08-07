/*
The object of this problem is to write a small medical diagnostic program. On the
D2L Content page along with this homework is an image taken from The American Medical
Association Family Medical Guide, Third Edition. This image contains a set of questions in
flowchart form used to diagnose shoulder pain. You will need to implement these questions
as a series of nested if-else statements. This project will be graded not only on correctness
but also on more cosmetic details (spelling, how the prompts are displayed, etc), so be sure
to take care when typing in the questions from the the flowchart.
For simplicity, you may assume that the answers typed in by the user always start with either
a ‘y’, ’Y’, ’n’ or ’N’ (so, for example, if their answer is to a question is yes they might type in
“yes”, “YES”, or “y”). We’ll handle the case when they type in words that start with other
letters (like “maybe”) later in the class.
A sample execution of your program might look something like the following (user input
underlined):
Welcome to the Should Pain Diagnostic Program
Please answer yes or no to each of the following statements:
Did you injure your shoulder within the last 24 hours? no
Did the pain begin suddenly? YES!!!
Is your temperature 100 F (38 C) or above AND/OR have you
recently started to feel sick? no
You may have an inflamed shoulder
*/

import java.util.Scanner;
public class H4P6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shoulder Pain Diagnostic Program");
        System.out.println("Please answer yes or no to each of the following statements:");

        System.out.println("Did you injure your shoulder within the last 24 hours?");
        boolean injured = scanner.nextLine().startsWith("y");

        System.out.println("Did the pain begin suddenly?");
        boolean sudden = scanner.nextLine().startsWith("y");

        System.out.println("Is your temperature 100 F (38 C) or above AND/OR have you recently started to feel sick?");
        boolean fever = scanner.nextLine().startsWith("y");

        if (injured && sudden) {
            System.out.println("You may have a rotator cuff tear.");
        } else if (injured && !sudden) {
            System.out.println("You may have a strain or sprain.");
        } else if (sudden && fever) {
            System.out.println("You may have an infection.");
        } else if (sudden && !fever) {
            System.out.println("You may have bursitis or tendonitis.");
        } else if (!injured && sudden) {
            System.out.println("You may have a pinched nerve.");
        } else {
            System.out.println("You may have a muscle strain or a pulled ligament.");
        }
    }
}
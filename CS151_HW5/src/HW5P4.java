/*
A palindrome is a word or phrase that reads the same backwards or forwards.
Some common palindromes are
radar A man, a plan, a canal: Panama!
Madam, I’m Adam Go hang a salami, I’m a lasagna hog
Write a program that reads in a line of text into a String variable line and then does the
following two steps:
(a) creates a new String variable letters with just the letters in line, all in lower case.
You should make use of the static method Character.isLetter(ch) which returns
true if the char value ch is a letter and false otherwise.
(b) uses letters to determine whether the input is a palindrome or not.

For example, if the user typed in the last of the example palindrome above, after step a) the
variable letters would store "gohangasalamiimalasagnahog". After the second step your
code would output something like:
"Go hang a salami, I’m a lasagna hog." is a palindrome
*/

import java.util.Scanner;
public class HW5P4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String line = scanner.nextLine();

        // Create a new String variable letters with just the letters in line, all in lower case.
        String letters = "";
        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters += Character.toLowerCase(ch);
            }
        }

        // Use letters to determine whether the input is a palindrome or not.
        boolean isPalindrome = true;
        for (int i = 0; i < letters.length() / 2; i++) {
            if (letters.charAt(i) != letters.charAt(letters.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(line + " is a palindrome");
        } else {
            System.out.println(line + " is not a palindrome");
        }
    }
}

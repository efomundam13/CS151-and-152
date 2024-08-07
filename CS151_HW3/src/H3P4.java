/*
Write a program that reads in a string and turns it “inside-out” as follows: divide
the string into 4 equal (or nearly equal) sections ABCD and then construct and output a
new string of the form BADC (moving the two outer sections to the interior). For example,
if the string is "generate", the constructed string would be "negetera". You may assume
that the string has at least 4 characters. If its length is not a multiple of 4, the lengths of
the sections will not be equal, but you should make sure that these lengths differ by no more
than 1. HINT: Consider dividing the string in two halves first.
 */
import java.util.Scanner;
public class H3P4 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String word;
		System.out.print("Enter a word --> ");
		word = in.next();
		// divide word into two halves
		int midpoint = word.length()/2;
		String firstHalf = word.substring(0, midpoint);
		String secondHalf = word.substring(midpoint);
		// divide each half in half
		// and recombine
		midpoint = firstHalf.length()/2;
		String a = firstHalf.substring(0, midpoint);
		String b = firstHalf.substring(midpoint);
		midpoint = secondHalf.length()/2;
		String c = secondHalf.substring(0, midpoint);
		String d = secondHalf.substring(midpoint);
		String scrambled = b+a+d+c;
		System.out.println("Scrambled word: " + scrambled);
		}
		}
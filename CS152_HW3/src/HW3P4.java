/*
4. A palindrome is a phrase that reads the same backwards and forwards (ignor-
ing punctuation and spaces). Example palindromes are “radar”, “A man, a plan, a canal:
Panama!” and “Go hang a salami, I’m a lasagna hog”. Write a recursive method to determine
is a given string is a palindrome. You may assume that the string has been preprocessed to
remove all non-alphabetic characters and is all lowercase (for example, “amanaplanacanal-
panama”. 
*/

public class HW3P4 {
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		} 
		else {
		    return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1));
		}
	}
}
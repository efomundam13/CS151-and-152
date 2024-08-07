/*
3. Write a recursive function string reverse(string s) which uses a divide and
conquer approach. 
*/

public class HW3P3 {
	public static String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		} 
		else {
		    return reverse(s.substring(0, s.length() / 2)) + reverse(s.substring(s.length() / 2));
		}
	}
}
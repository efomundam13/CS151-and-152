/*
2. Write a recursive method that returns the number of 1s in the binary representation
of N . Use the fact that this number equals the number of 1s in the representation of N/2,
plus 1 if N is odd 
*/

public class HW3P2 {
	public static int countOnes(int n) {
		if (n == 0) {
			return 0;
		} 
		else {
		    return countOnes(n / 2) + (n % 2 == 1 ? 1 : 0);
		}
	}
}

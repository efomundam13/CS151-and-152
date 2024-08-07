/*
6. A substring B of a sequence A is any consecutive set of values in A. For example,
if A = [1, 7, −2, 4, 9, 0, 6] then possible substrings are [7, −2, 4], [0] and [−2, 4, 9, 0, 6]. The
sequences [1, −2, 7], [1, 7, 4] and [8] are not substrings of A.
Write numSubstring(int [] a, int [] b) which returns the number of times b appears as
a substring of a. For example, if a = [1, 2, 1, 2, 1, 1, 1, 2] then the sequence [1,2]
appears 3 times, the sequence [2,1] appears 2 times and the sequence [1,2,3] appears 0
times. numSubstring should call a recursive method that uses a divide-and-conquer approach
to solve this problem 
*/

public class HW3P6 {
	public static int numSubstring(int[] a, int[] b) {
		if (b.length == 0) {
			return 1;
		}
		if (a.length < b.length) {
		    return 0;
		}
		int count = 0;
		for (int i = 0; i < a.length - b.length + 1; i++) {
			if (a[i] == b[0]) {
				boolean match = true;
				for (int j = 1; j < b.length; j++) {
					if (a[i + j] != b[j]) {
						match = false;
						break;
					}
				}
				if (match) {
					count++;
				}
		    }
		}
		return count;
	}
}
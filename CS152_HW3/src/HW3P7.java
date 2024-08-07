/*
7. Your implementation of binary search in class used up to two comparisons each
recursive call, checking for both x<a[mid] and x>a[mid]. A better approach that uses only
one comparison each recursive call is the following:
(a) first check to see which half of the array x may lie in: either from low to mid or from
mid+1 to high. Then make a recursive call on that half of the array
(b) only when we are down to a base case of an array subsection of length 1 to we finally
perform an equality check on x. If x is equal to the single value in this subsection we
return its index; otherwise we return -1.
What this approach does is whittle down the size of the array section until we get to the only
possible location that x could be and then we check (in the base case) whether or not x is
actually there.
Write a version of binary search that uses this approach
*/

public class HW3P7 {
	public static int binarySearch(int[] a, int x) {
		if (a.length == 0) {
			return -1;
		}
		int low = 0;
		int high = a.length - 1;
		int mid = (low + high) / 2;
		while (low <= high) {
		if (x < a[mid]) {
			high = mid - 1;
		} 
		else if (x > a[mid]) {
			low = mid + 1;
		} 
		else {
		    return mid;
		}
		mid = (low + high) / 2;
	}
	return -1;
	}
}
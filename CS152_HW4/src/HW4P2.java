/*
Suppose we use Quicksort to sort the following array:
30 42 7 71 19 61 86 64 44 38 24 22 82 5 51
(a) If we just use the first value in the array as the pivot, show what the array looks like
after being partitioned.
(b) If we use median-of-three pivoting specify what the pivot is and show what the array
looks like after being partitioned.
(c) If we could pick any value as the pivot which would be the best one to pick?
*/
public class HW4P2 {
/*
(a) If we use the first value in the array as the pivot, the array will be partitioned as follows:
[30] [7 19 22 5 44 24] [42 61 64 71 82 86 51]
The pivot is 30.

(b) If we use median-of-three pivoting, the pivot will be the median of the first, middle, and last elements in the array. In this case, the pivot will be 22. The array will be partitioned as follows:
[7 19 5] [22] [42 61 64 71 82 86 44 24 30 51]

(c) The best value to pick as the pivot is the median of the entire array. This is because it will divide the array into two equal halves, which will make the sorting process more efficient.
*/
}

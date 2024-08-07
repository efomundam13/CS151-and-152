/*
1. Write a version of MergeSort which divides the array into 3 (approximately) even
size sections, sorts each section, then merges them together.
*/

import java.util.*;

public class HW4P1 {
	public static void mergeSort3(int[] arr) {
		  if (arr.length <= 1) {
		    return;
		  }

		  // Divide the array into 3 (approximately) even size sections.
		  int[] left = Arrays.copyOfRange(arr, 0, arr.length / 3);
		  int[] middle = Arrays.copyOfRange(arr, arr.length / 3, 2 * arr.length / 3);
		  int[] right = Arrays.copyOfRange(arr, 2 * arr.length / 3, arr.length);

		  // Sort each section.
		  mergeSort3(left);
		  mergeSort3(middle);
		  mergeSort3(right);

		  // Merge the sections together.
		  int i = 0, j = 0, k = 0;
		  while (i < left.length && j < middle.length && k < right.length) {
		    if (left[i] <= middle[j] && left[i] <= right[k]) {
		      arr[i + j + k] = left[i];
		      i++;
		    } else if (middle[j] <= left[i] && middle[j] <= right[k]) {
		      arr[i + j + k] = middle[j];
		      j++;
		    } else {
		      arr[i + j + k] = right[k];
		      k++;
		    }
		  }

		  // Copy any remaining elements from the left or middle section.
		  while (i < left.length) {
		    arr[i + j + k] = left[i];
		    i++;
		  }

		  while (j < middle.length) {
		    arr[i + j + k] = middle[j];
		    j++;
		  }

		  while (k < right.length) {
		    arr[i + j + k] = right[k];
		    k++;
		  }
	}
}

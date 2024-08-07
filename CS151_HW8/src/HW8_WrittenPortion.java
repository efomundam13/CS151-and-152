
public class HW8_WrittenPortion {
/*
1.Write a method public static int addEvenLocations(int [] arr) which re-
turns the sum of all elements at the even locations in arr, i.e., the values at locations 0, 2, 4, . . ..
For example, if arr stores the values [9, 4, 6, 7, 2, 8, 7], then addEvenLocations
would return 24.

public static int addEvenLocations(int[] arr) {

    // Initialize the sum to 0
    int sum = 0;

    // Iterate over the array, starting at index 0
    for (int i = 0; i < arr.length; i += 2) {

        // Add the element at the current index to the sum
        sum += arr[i];
    }

    // Return the sum
    return sum;
}

2. Write a method public static int numOccurrences(int [] arr, int val)
which returns the number of times val appears in the integer array arr. For example, if arr
stores the values [9, 4, 6, 7, 2, 8, 7] and val = 7, then numOccurrences would return
2; if val = 3, then numOccurrences would return 0.

public static int numOccurrences(int[] arr, int val) {

    // Initialize the count to 0
    int count = 0;

    // Iterate over the array
    for (int i = 0; i < arr.length; i++) {

        // If the current element is equal to val, increment the count
        if (arr[i] == val) {
            count++;
        }
    }

    // Return the count
    return count;
}

3. Write a method public static int diff(int [] arr, int size) which re-
turns the difference between the largest and smallest values in the first size values in the
array arr.

public static int diff(int[] arr, int size) {

    // Check if the size is valid
    if (size > arr.length) {
        return -1;
    }

    // Initialize the largest and smallest values
    int largest = arr[0];
    int smallest = arr[0];

    // Iterate over the first size elements of the array
    for (int i = 1; i < size; i++) {

        // Update the largest and smallest values
        if (arr[i] > largest) {
            largest = arr[i];
        } else if (arr[i] < smallest) {
            smallest = arr[i];
        }
    }

    // Return the difference between the largest and smallest values
    return largest - smallest;
}

4. Write a method public static int[] arrayAdd(int [] arr1, int [] arr2)
which returns a new array whose elements are the sum of the corresponding elements in arr1
and arr2. If the length of arr2 of less than the length of arr1 then its values should be
“repeated”, i.e. whenever you run out of values to add to arr1 you should start from the
beginning of arr2 again. For example, if arr1 stores the values [9, 4, 6, 7, 2, 8, 7] and
arr2 stores the values [1, 2, 3, 4] the arrayAdd should return an array with the values
[10, 6, 9, 11, 3, 10, 10]. Note that the array that is returned will always have the same
length as arr1. Finally, if arr1 is null the method should return null; if arr2 is null the
method should return a new array identical to arr1.

public static int[] arrayAdd(int[] arr1, int[] arr2) {

    if (arr1 == null) {
        return null;
    } else if (arr2 == null) {
        return arr1.clone();
    }

    int[] result = new int[arr1.length];

    for (int i = 0; i < arr1.length; i++) {
        if (i >= arr2.length) {
            result[i] = arr1[i] + arr2[i - arr2.length];
        } else {
            result[i] = arr1[i] + arr2[i];
        }
    }

    return result;
}

5
	a. Write a method public static void shiftLeft(int [] arr) which perform a left
	cyclic shift of the elements in the array arr. A left cyclic shift moves all elements down
	one location in the array and stores the first element in the last location. For example,
	if the array a stores the values [1, 3, 5, 7], after the call shiftLeft(a), the array a
	would store [3, 5, 7, 1].
	
	public static void shiftLeft(int[] arr) {
	
	    // If the array is empty, do nothing.
	    if (arr.length == 0) {
	        return;
	    }
	
	    // Save the first element of the array.
	    int firstElement = arr[0];
	
	    // Shift all elements down one location.
	    for (int i = 0; i < arr.length - 1; i++) {
	        arr[i] = arr[i + 1];
	    }
	
	    // Store the first element at the end of the array.
	    arr[arr.length - 1] = firstElement;
	}

	b. Write a method public static int[] shiftLeft2(int [] arr) which returns an array
	whose elements are those of arr but left cyclic shifted. In this method the values in
	arr should not change.
	
	public static int[] shiftLeft2(int[] arr) {
	
	    // If the array is empty, return an empty array.
	    if (arr.length == 0) {
	        return new int[0];
	    }
	
	    // Create a new array of the same size as the original array.
	    int[] result = new int[arr.length];
	
	    // Copy the elements of the original array to the new array, starting at index 1.
	    for (int i = 1; i < arr.length; i++) {
	        result[i - 1] = arr[i];
	    }
	
	    // Copy the first element of the original array to the last element of the new array.
	    result[arr.length - 1] = arr[0];
	
	    // Return the new array.
	    return result;
	}
*/
}

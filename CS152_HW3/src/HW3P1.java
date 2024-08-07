/*
1. In class we studied a recursive, divide and conquer method to find the sum of the
values in an array of ints
 a. Modify this routine so that it returns the maximum value in an array of Comparables
 b. Modify this routine so that it returns the index of the maximum value.
*/
public class HW3P1 {
	//a
	public static Object findMaxValue(Comparable [] a, int n) {
		Comparable maxVal = a[0];
        for(int i = 0; i < n; i++)	{
            if(maxVal.compareTo(a[i]) < 0)	{
            	maxVal = a[i];
            }
        }
        return maxVal;
    }
	
	//b
	public static Object findIndexOfMaxValue(Comparable [] a, int n) {
		Comparable maxVal = a[0];
		int indexOfMaxValue = 0;
		for(int i = 0; i < n; i++)	{
			if(maxVal.compareTo(a[i]) < 0)	{
                maxVal = a[i];
                indexOfMaxValue = i;
                }
			}
		return indexOfMaxValue;
	}
}
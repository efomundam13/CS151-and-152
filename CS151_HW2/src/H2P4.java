/*
Programming Project 2, pg. 54. In addition to what the problem asks you to
output also output the number of gumballs you could get if you only used your coupons on
gumballs.
Your code should use a variable to store the number of coupons. The start of your code
should look like the following:

public class H2P4
{
public static void main(String [] args)
{
int numberOfCoupons = 150;
...
}
}

The number 150 is arbitrary – you should try other numbers to make sure your code is
working. HINT: this problem shows one of the advantages of having integer division.
 */
public class H2P4 {
	public static void main(String [] args) {
		int numberOfCoupons = 150;
	    int numberOfCandyBars = numberOfCoupons / 5;
	    int numberOfGumballs = numberOfCoupons / 10;
	    System.out.println("You can get " + numberOfCandyBars + " candy bars and " + numberOfGumballs + " gumballs.");
	    System.out.println("If you only use your coupons on gumballs, you can get " + numberOfGumballs + " gumballs.");
	}
}


public class HW6_WrittenPortion {
/*
1. Write a method fahrenheitToCelsius(double temp) which returns the Celsius
temperature equivalent to the Fahrenheit temperature temp. Note that in this and all other
methods you should do no output to the screen unless explicitly asked to.

public static double fahrenheitToCelsius(double temp) {
    // The formula for converting Fahrenheit to Celsius is:
    // Celsius = (Fahrenheit - 32) * 5 / 9
    return (temp - 32) * 5 / 9;
}

2. Write a method countVowels(String s) which returns the number of vowels
in s, where we will only consider ’a’, ’e’, ’i’, ’o’ and ’u’ as vowels, not ’y’ (as in
system) or ’w’ (as in cwm). You should use a switch statement in this method.

public static int countVowels(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                count++;
                break;
        }
    }
    return count;
}

3. Write a method reverse which takes a String argument and returns that string
in reverse.

public static String reverse(String s) {
    // Create a new StringBuilder to store the reversed string
    StringBuilder reversed = new StringBuilder();

    // Iterate over the characters in the original string in reverse order
    for (int i = s.length() - 1; i >= 0; i--) {
        // Add the current character to the reversed string
        reversed.append(s.charAt(i));
    }

    // Return the reversed string
    return reversed.toString();
}

4. Write a method max3 which takes three integers as arguments and returns the
largest of the three. You should not make use of any methods in the Math class.

public static int max3(int a, int b, int c) {
    int max = a;
    if (b > max) {
        max = b;
    }
    if (c > max) {
        max = c;
    }
    return max;
}

5. Write a method isParallel(int xa, int ya, int xb, int yx, int xc, int
yc, int xd, int yx) which returns true if the line between points (xa, ya) and (xb, yb)
is parallel to the line between points (xc, yc) and (xd, yd). Two lines are parallel if they
have the same slope.

public static boolean isParallel(int xa, int ya, int xb, int yb, int xc, int yc, int xd, int yd) {
    // Calculate the slopes of the two lines
    double slope1 = (yb - ya) / (xb - xa);
    double slope2 = (yd - yc) / (xd - xc);

    // Return true if the slopes are equal
    return slope1 == slope2;
}

6. Determine the output of the following code:
public static void main(String [] args)
{
for(int i=1; i<=10; i++)
System.out.println(y(i));
}

public static int y(int a)
{
if (a%2 == 0)
return x(a);
else
return x(3*a+1);
}

public static int x(int b)
{
if (b%5 == 0)
return 2*b;
else
return 3*b;
}

12
6
20
12
48
18
66
24
84
20
*/
}

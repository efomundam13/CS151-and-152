
public class HW7_WrittenPortion {
/*
1. Write a public static method isLeapYear(int y) for the Date class (shown on
pages 227-231) which returns true if y is a leap year and false otherwise. You can find the
rules for when a year is a leap year at https://www.timeanddate.com/date/leapyear.html

public static boolean isLeapYear(int y) {
    if (y % 4 == 0) {
        return y % 100 != 0 || y % 400 == 0;
    } else {
        return false;
    }
}

2.The two dateOK methods on page 231 in the text are not perfectly correct, since
they allow dates like “February 31, 2016”. Rewrite the first version of dateOK (the one which
uses three int parameters) so that it correctly checks for correct dates: HINT: use multiple
return statements, checking for various types of bad input first. For example, the first thing
you might do is check if the year is bad – if it is, return false, otherwise go on and check
some other aspect of the date. SECOND HINT: Use the isLeapYear method your wrote for
Problem 1.

public static boolean dateOK(int m, int d, int y) {

    // Check if the year is between 1 and 9999
    if (y < 1 || y > 9999) {
        return false;
    }

    // Check if the month is between 1 and 12
    if (m < 1 || m > 12) {
        return false;
    }

    // Check if the day is between 1 and the maximum number of days in the month
    if (d < 1) {
        return false;
    }

    // Check for February
    if (m == 2) {
        // If the year is a leap year, the maximum number of days in February is 29
        if (isLeapYear(y)) {
            if (d > 29) {
                return false;
            }
        } else {
            // If the year is not a leap year, the maximum number of days in February is 28
            if (d > 28) {
                return false;
            }
        }
    }

    // Check for April, June, September, and November
    if (m == 4 || m == 6 || m == 9 || m == 11) {
        if (d > 30) {
            return false;
        }
    }

    // Check for January, March, May, July, August, October, and December
    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
        if (d > 31) {
            return false;
        }
    }

    // The date is valid
    return true;
}

3.Rewrite the second version of dateOK (the one whose first argument is a String)
in terms of the first version of dateOK and the getMonth method.


public static boolean dateOK(String s) {
    // Split the string into its components
    String[] parts = s.split(" ");

    // Check if the number of components is not 3
    if (parts.length != 3) {
        return false;
    }

    // Check if the year is between 1 and 9999
    int y = Integer.parseInt(parts[2]);
    if (y < 1 || y > 9999) {
        return false;
    }

    // Check if the month is between 1 and 12
    int m = Integer.parseInt(parts[0]);
    if (m < 1 || m > 12) {
        return false;
    }

    // Check if the day is between 1 and the maximum number of days in the month
    int d = Integer.parseInt(parts[1]);
    if (d < 1) {
        return false;
    }

    // Check for February
    if (m == 2) {
        // If the year is a leap year, the maximum number of days in February is 29
        if (isLeapYear(y)) {
            if (d > 29) {
                return false;
            }
        } else {
            // If the year is not a leap year, the maximum number of days in February is 28
            if (d > 28) {
                return false;
            }
        }
    }

    // Check for April, June, September, and November
    if (m == 4 || m == 6 || m == 9 || m == 11) {
        if (d > 30) {
            return false;
        }
    }

    // Check for January, March, May, July, August, October, and December
    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
        if (d > 31) {
            return false;
        }
    }

    // The date is valid
    return true;
}

4.Add a method dayOfYear() to the Date class which returns the day number for
the date stored in the object, where January 1 is day 1 and December 31 is day 365 (or 366
in a leap year). I suggest you use a switch statement here and make use of its fall-through
behavior (for example, if the date stored in the object is March 4 then you need to add up
all the days in the months January and February; if the date is April 4 then you need to add
up all the days in January, February and March, and so on). You will need a final check to
see if you have to add an extra day for a leap year (again, using the isLeapYear() method).

public int dayOfYear() {
    // Initialize the day number to 1
    int dayNumber = 1;

    // Iterate over the months
    for (int month = 1; month <= 12; month++) {
        // Get the number of days in the current month
        int daysInMonth = getMonthLength(month);

        // Add the number of days in the current month to the day number
        dayNumber += daysInMonth;
    }

    // If the year is a leap year, add an extra day
    if (isLeapYear()) {
        dayNumber++;
    }

    // Return the day number
    return dayNumber;
}
*/
}

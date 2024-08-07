/*
You may not know this but not just any set of 16 digits can be used for a credit
card number. The algorithm that is used to check for the validity of a credit card number is
called the Luhn algorithm and works as follows:
(a) initialize a variable checksum to 0;
(b) for each digit in locations 0, 2, 4, . . . add 2*digit to checksum.
(c) count how many of the digits in locations 0, 2, 4, . . . are ≥ 5 and add this number to
checksum.
(d) add the remaining digits in locations 1, 3, 5 . . . to checksum
(e) if checksum is a multiple of 10, then the card number is valid; otherwise it is invalid.

For this problem, you are to prompt the user for one or more credit card numbers (until -1 is
entered) and after each is entered you should echo what was typed in and indicate whether
the card number was valid or invalid. The possible messages your should output are:

Invalid: illegal character - the card number entered had one or more illegal characters
in it (i.e., a character other than a digit or a space). You should also output the first
such bad character in the input.

Invalid: too few digits – the card number had less than 16 digits.

Invalid: too many digits – the card number had more than 16 digits.

Invalid: bad checksum – the card had a bad checksum value (i.e., it didn’t pass the Luhn
algorithm test).

Valid : the card number successfully passes all of the checks.
If more than one of these apply, you should output the first one that appears on the list
above.

For this project I want you to split the code across the following public static methods:

String removeBlanks(String s) – return a new string which is identical to s except all
blanks are removed. For example, if s = "1234 5678 9012 3456" then removeBlanks
should return "1234567890123456".

int badCharacterCheck(String s) – this method should return the index of the first bad
character in s or -1 if no bad characters are found. For example, if s = "12345s7890"
then badCharacterCheck should return 5. You’ll want to make use of the static isDigit()
method in the Character class.

int calculateCheckSum(String s) – return the checksum calcuated using Luhn’s algo-
rithm. For example, if s = "1234567890123456" then calculateCheckSum should re-
turn 104.

boolean processCard(String s) – this method should output one of the five possible mes-
sages listed above given the input string s as well as returning true if s is a valid credit
card number and false otherwise. This method will be called by main() and will make
use of the other three methods above.

void main(String [] args) – the main driver code which should prompt the user for the
card numbers and make a call to processCard for each. In addition, after -1 is entered
this method should output the total number of card numbers entered, the number that
were valid and the number that were invalid.

Because I want you to get practice using loops I am restricting the methods you can use from
the String class: you can only use the methods length, charAt, indexOf and substring
(note that you may not need all of these).

A sample user session is shown below (user input in bold and underlined):
Credit Card Checker
Please enter one or more credit card numbers to validate (-1 to end)
Next card --> 1234 5678 9012 3456
1234 5678 9012 3456: Invalid - bad checksum
Next card --> 1234 5678 9012 3452
1234 5678 9012 3452: Valid
Next card --> 12345s7890
12345s7890: Invalid - bad character ’s’
Next card --> 1234 5789 0
12345s7890: Invalid - two few digits
Next card --> -1
Total cards processed: 4
1 valid card number
3 invalid card numbers
Notice that in the second to last line the program outputs number and not numbers.
*/

public class HW6P7 {
	public static String removeBlanks(String s) {
	    // Create a new StringBuilder to store the result
	    StringBuilder sb = new StringBuilder();

	    // Iterate over the characters in the original string
	    for (char c : s.toCharArray()) {
	        // If the character is not a space, add it to the result
	        if (c != ' ') {
	            sb.append(c);
	        }
	    }

	    // Return the result
	    return sb.toString();
	}

	public static int badCharacterCheck(String s) {
	    // Iterate over the characters in the string
	    for (int i = 0; i < s.length(); i++) {
	        // If the character is not a digit or a space, return its index
	        if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') {
	            return i;
	        }
	    }

	    // No bad characters found, return -1
	    return -1;
	}

	public static int calculateCheckSum(String s) {
	    // Initialize a variable checksum to 0
	    int checksum = 0;

	    // Iterate over the characters in the string, starting from the end
	    for (int i = s.length() - 1; i >= 0; i--) {
	        // Get the current digit
	        int digit = s.charAt(i) - '0';

	        // If the current digit is in an even position, double it
	        if ((i % 2) == 0) {
	            digit *= 2;

	            // If the doubled digit is greater than 9, add its digits together
	            if (digit > 9) {
	                digit = (digit / 10) + (digit % 10);
	            }
	        }

	        // Add the current digit to the checksum
	        checksum += digit;
	    }

	    // Return the checksum
	    return checksum;
	}

	public static boolean processCard(String s) {
	    // Remove any blanks from the card number
	    s = removeBlanks(s);

	    // If the card number is less than 16 digits, it is invalid
	    if (s.length() < 16) {
	        System.out.println("Invalid: too few digits");
	        return false;
	    }

	    // If the card number has any bad characters, it is invalid
	    int badIndex = badCharacterCheck(s);
	    if (badIndex != -1) {
	        System.out.println("Invalid: illegal character at position " + badIndex);
	        return false;
	    }

	    // Calculate the checksum of the card number
	    int checksum = calculateCheckSum(s);

	    // If the checksum is not a multiple of 10, the card number is invalid
	    if (checksum % 10 != 0) {
	        System.out.println("Invalid: bad checksum");
	        return false;
	    }

	    // The card number is valid
	    System.out.println("Valid");
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int validCount = 0;
	    int invalidCount = 0;

	    // Prompt the user for credit card numbers
	    while (true) {
	        System.out.print("Enter a credit card number (-1 to quit): ");
	        String cardNumber = System.console().readLine();

	        // If the user enters -1, exit the loop
	        if (cardNumber.equals("-1")) {
	            break;
	        }

	        // Process the card number
	        boolean valid = processCard(cardNumber);

	        // Increment the appropriate counter
	        if (valid) {
	            validCount++;
	        } else {
	            invalidCount++;
	        }
	    }

	    // Print the results
	    System.out.println("Number of card numbers entered: " + (validCount + invalidCount));
	    System.out.println("Number of valid card numbers: " + validCount);
	    System.out.println("Number of invalid card numbers: " + invalidCount);
	}
}

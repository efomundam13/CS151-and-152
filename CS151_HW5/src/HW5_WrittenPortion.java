
public class HW5_WrittenPortion {
/*
1.Rewrite the if/else statements on the left using a switch statement. Rewrite
the switch statement on the right using if/else statements.
if (i == 4) 					switch(n) {
j = k; 							case 0:
else if (i >= 5 && i < 8) { 	case 1: i *= 2;
j = 3*k; 						case 2: i += 4;
k=0; 							break;
} 								case 3: i = k;
else 							default: i -= 5;
j = 0; 							}

switch(n) {						if(n == 0 || n == 1){
case 0:							i += 2;
case 1: i += 2;					i += 4;
case 2: i += 4;					}
break;							else if (n == 2)
case 3: i = k;					i += 4;
default: i -= 5;				i -= 5;
}								}
								else
								i -= 5;

2.Determine the output of the following code fragments:
a) sum = 0; 			b) sum = 0; 				c) sum = 0;
i = 12; 				for(int i=1; i<20; i+=3) 	i = 12;
while (i%10 != 0) { 	sum += i; 					do {
sum += i; 				System.out.println(sum); 	sum += i;
i++; 												i++;
} 								70					} while (i%10 != 0);
System.out.println(sum); 							System.out.println(sum);
															124
		124							

3.Write code which reads in a sequence of positive integers until -1 is typed in, and
then outputs the largest and second largest values in the sequence (the sentinel value -1 is
not considered part of the sequence). If the sequence contains only one value, than output
that as the largest and the string "No second largest value"; if the sequence contains no
values, then output "No largest or second largest value"

import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create variables to store the largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Keep reading integers from the user until -1 is entered
        while (true) {
            int number = scanner.nextInt();

            // If the user enters -1, break out of the loop
            if (number == -1) {
                break;
            }

            // If the number is greater than the largest value, update the largest value
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        // If the sequence contains no values, output "No largest or second largest value"
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No largest or second largest value");
        } else {
            // Otherwise, output the largest and second largest values
            System.out.println("Largest value: " + largest);
            System.out.println("Second largest value: " + secondLargest);
        }
    }
}
*/
}

import java.util.*;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter a number greater than 1 --> ");
            int n = in.nextInt();
            if (n <= 1) {
                System.out.println("Invalid entry, please re-enter");
                continue;
            }

            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }

            System.out.println("Do you have another number to check (y/n)? --> ");
            String answer = in.next();
            if (answer.equals("n")) {
                keepGoing = false;
            }
        }
    }
}
import java.util.Scanner;

public class BloodPressure {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the child's age: ");
        int age = in.nextInt();
        System.out.println("Enter the child's gender (M or F): ");
        char gender = in.next().charAt(0);

        if (age < 1 || age > 10) {
            System.out.println("Invalid age!");
            return;
        }

        if (gender == 'M') {
            if (age <= 3) {
                System.out.println("Ideal blood pressure range is 80/34 - 120/75");
            } else if (age <= 6) {
                System.out.println("Ideal blood pressure range is 88/47 - 128/84");
            } else {
                System.out.println("Ideal blood pressure range is 92/53 - 130/90");
            }
        } else if (gender == 'F') {
            if (age <= 3) {
                System.out.println("Ideal blood pressure range is 83/38 - 117/76");
            } else if (age <= 6) {
                System.out.println("Ideal blood pressure range is 88/50 - 122/83");
            } else {
                System.out.println("Ideal blood pressure range is 93/55 - 129/88");
            }
        } else {
            System.out.println("Invalid gender!");
        }
    }
}
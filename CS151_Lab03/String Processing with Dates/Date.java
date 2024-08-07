import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date in the format mm/dd/yyyy: ");
        String date = in.nextLine();

        String[] parts = date.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        if (day.length() == 1) {
            day = "0" + day;
        }

        if (month.length() == 1) {
            month = "0" + month;
        }

        System.out.println("This date in the European format is " + day + "/" + month + "/" + year.substring(2));
    }
}
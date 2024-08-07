/*
4. The file presidents.txt is a text file that contains each president’s name on one
line followed by three integers on the next line indicating the month, day and year of their
birth (you can look at the file using a text editor to get a better idea of its layout). Write a
program that asks the user for a month, then opens this file and outputs all of the presidents
born on that month to both the screen and to another file. This new file should be called
presidents<n>.txt where <n> is the number of the month entered (for example, if 6 was
entered for the month, then you should output the results to a file names presidents6.txt.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW1P4 {

  public static void main(String[] args) {

    // Create a Scanner object to read from the console.
    Scanner scanner = new Scanner(System.in);

    // Ask the user for a month.
    System.out.println("What month would you like to see the presidents born in?");
    int month = scanner.nextInt();

    // Create a File object for the output file.
    File outputFile = new File("presidents" + month + ".txt");

    // Create a PrintWriter object to write to the output file.
    PrintWriter writer = null;
    try {
      writer = new PrintWriter(outputFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // Open the presidents.txt file.
    File inputFile = new File("presidents.txt");
    Scanner inputScanner = null;
    try {
      inputScanner = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // Read the presidents.txt file line by line.
    while (inputScanner.hasNextLine()) {

      // Get the president's name.
      String name = inputScanner.nextLine();

      // Get the president's birth month, day, and year.
      int birthMonth = inputScanner.nextInt();
      int birthDay = inputScanner.nextInt();
      int birthYear = inputScanner.nextInt();

      // Check if the president was born in the specified month.
      if (birthMonth == month) {

        // Output the president's name to the console and to the output file.
        System.out.println(name);
        writer.println(name);
      }
    }

    // Close the input and output files.
    inputScanner.close();
    writer.close();
  }
}
/*
Programming Project 9, pg. 56. Your output should contain both the height and
calculated ideal weight along with some appropriate text to explain the output.
Note: For the programming problems one option is to create a single project called Homework – or
something similar – (using the File/New/Java Project menu item – and don’t forget to unclick
the Create module-info.java file option) and then create individual classes for each problem
in this and future homeworks (using either the File/New/Class menu item or clicking on the
project name and selecting New/Class). Alternatively you could create individual projects for each
homework and just create classes in the project for that homework’s problems.
 */
public class H2P5 {
  public static void main(String[] args) {
    // Get the height of the person in inches
    double height = Double.parseDouble(args[0]);

    // Get the gender of the person
    String gender = args[1];

    // Calculate the ideal weight of the person
    double idealWeight;
    if (gender.equals("Male")) {
      idealWeight = 106 + (6 * height) - 60;
    } 
    else {
      idealWeight = 100 + (5 * height) - 60;
    }

    // Print the output
    System.out.println("Your ideal weight is " + idealWeight + " pounds.");
  }
}
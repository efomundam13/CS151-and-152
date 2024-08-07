import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the user's input
    System.out.println("Enter the series of encryption schemes to use, separated by spaces:");
    String schemes = scanner.nextLine();
    System.out.println("Do you want to encrypt (e) or decrypt (d)?");
    String mode = scanner.nextLine();

    // Create a cipher object for each scheme
    Coder[] ciphers = new Coder[schemes.split(" ").length];
    for (int i = 0; i < ciphers.length; i++) {
      String scheme = schemes.split(" ")[i];
      if (scheme.equals("array")) {
        ciphers[i] = new ArrayCoder();
      } else if (scheme.equals("substitution")) {
        System.out.println("Enter the key:");
        String key = scanner.nextLine();
        ciphers[i] = new SubstitutionCoder(key);
      } else if (scheme.equals("grille")) {
        System.out.println("Enter the grille:");
        String grille = scanner.nextLine();
        ciphers[i] = new GrilleCoder();
      } else {
        System.out.println("Invalid scheme");
        return;
      }
    }

    // Encrypt or decrypt the text
    System.out.println("Enter the text to encrypt or decrypt:");
    String text = scanner.nextLine();
    if (mode.equals("e")) {
      for (Coder cipher : ciphers) {
        text = cipher.encrypt(text);
      }
    } else {
      for (Coder cipher : ciphers) {
        text = cipher.decrypt(text);
      }
    }

    // Print the result
    System.out.println(text);
  }
}
import java.util.Scanner;

public class ContraryProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence of the form \"I love <something>\" or \"I like <something>\" or \"I dislike <something>\" or \"I hate <something>\"");
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        if (words[1].equals("love")) {
            System.out.println("No, you hate " + words[2]);
        } else if (words[1].equals("like")) {
            System.out.println("No, you dislike " + words[2]);
        } else if (words[1].equals("dislike")) {
            System.out.println("No, you like " + words[2]);
        } else if (words[1].equals("hate")) {
            System.out.println("No, you love " + words[2]);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
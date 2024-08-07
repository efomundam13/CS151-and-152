import java.util.*;

public class Opish {

    private String phrase;

    public Opish() {
        phrase = "";
    }

    public void setPhrase(String s) {
        phrase = s;
    }

    public String getOpish() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (isConsonant(ch)) {
                sb.append(ch).append("op");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private boolean isConsonant(char ch) {
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }


	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Opish opObj = new Opish();
	    System.out.println("Enter a phrase to translate (type END to stop)");
	    String s = in.nextLine();
	    while (!s.equals("END")) {
	        opObj.setPhrase(s);
	        System.out.println(opObj.getOpish());
	        System.out.println("\nEnter another phrase (END to stop)");
	        s = in.nextLine();
	    }
	}
}
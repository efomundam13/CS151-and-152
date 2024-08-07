import java.util.Random;

public class Fortune {

    public static void main(String[] args) {
        Random rnd = new Random();
        int fortune = rnd.nextInt(10);

        switch (fortune) {
            case 0:
                System.out.println("Beware the Ides of March");
                break;
            case 1:
                System.out.println("Watch your back");
                break;
            case 2:
                System.out.println("Don't talk to strangers");
                break;
            case 3:
                System.out.println("They're out to get you");
                break;
            default:
                System.out.println("Have a nice day!");
                break;
        }
    }
}

public class Card {

    private int suit;
    private int rank;

    public Card(int s, int r) {
        this.suit = s;
        this.rank = r;
    }

    public Card(int num) {
        this.suit = num / 13;
        this.rank = num % 13;
    }

    public Card(Card c) {
        this.suit = c.suit;
        this.rank = c.rank;
    }

    private void badCard() {
        if (suit < 1 || suit > 4) {
            System.out.println("Invalid suit value.");
            System.exit(1);
        }
        if (rank < 1 || rank > 13) {
            System.out.println("Invalid rank value.");
            System.exit(1);
        }
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        switch (rank) {
            case 1:
                return "A";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return "INVALID";
    }

    public boolean equals(Card c) {
        return this.suit == c.suit && this.rank == c.rank;
    }
}

public class Deck {

    private Card[] cards;
    private int nextCard;

    public Deck() {
        cards = new Card[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = new Card(i);
        }
        nextCard = 0;
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int j = (int) (Math.random() * 52);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        nextCard = 0;
    }

    public Card nextCard() {
        if (nextCard >= 52) {
            return null;
        }
        return cards[nextCard++];
    }

    public int numLeft() {
        return 52 - nextCard;
    }

    public boolean hasCard() {
        return nextCard < 52;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nextCard; i++) {
            sb.append(cards[i]).append(" ");
        }
        return sb.toString();
    }
}
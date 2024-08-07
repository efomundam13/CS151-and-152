import java.util.*;

public class PokerHandEvaluator {

    // The hand that is being evaluated.
    private Hand hand;

    // The type of the hand.
    private String handType;

    // The value of the hand.
    private int handValue;

    // Create a new PokerHandEvaluator object.
    public PokerHandEvaluator() {
        hand = new Hand();
        handType = "Unknown";
        handValue = 0;
    }

    // Accept a hand to be evaluated.
    public void acceptHand(Hand h) {
        hand = h;
        hand.sortHand();
        evaluateHand();
    }

    // Evaluate the hand and set the handType and handValue fields.
    private void evaluateHand() {
        // Check for a straight flush.
        if (isStraightFlush()) {
            handType = "Straight flush";
            handValue = 8;
            return;
        }

        // Check for a four of a kind.
        if (isFourOfAKind()) {
            handType = "Four of a kind";
            handValue = 7;
            return;
        }

        // Check for a full house.
        if (isFullHouse()) {
            handType = "Full house";
            handValue = 6;
            return;
        }

        // Check for a flush.
        if (isFlush()) {
            handType = "Flush";
            handValue = 5;
            return;
        }

        // Check for a straight.
        if (isStraight()) {
            handType = "Straight";
            handValue = 4;
            return;
        }

        // Check for three of a kind.
        if (isThreeOfAKind()) {
            handType = "Three of a kind";
            handValue = 3;
            return;
        }

        // Check for two pair.
        if (isTwoPair()) {
            handType = "Two pair";
            handValue = 2;
            return;
        }

        // Check for a pair.
        if (isPair()) {
            handType = "Pair";
            handValue = 1;
            return;
        }

        // The hand is a bust.
        handType = "Bust";
        handValue = 0;
    }

    // Check if the hand is a straight flush.
    private boolean isStraightFlush() {
        // Check if the hand is a flush.
        if (!isFlush()) {
            return false;
        }

        // Check if the hand is a straight.
        if (!isStraight()) {
            return false;
        }

        return true;
    }

    // Check if the hand is a four of a kind.
    private boolean isFourOfAKind() {
        // Check if there are four cards of the same rank.
        for (int i = 0; i < hand.getCards().length - 3; i++) {
            if (hand.getCards()[i].getRank() == hand.getCards()[i + 1].getRank() &&
                hand.getCards()[i].getRank() == hand.getCards()[i + 2].getRank() &&
                hand.getCards()[i].getRank() == hand.getCards()[i + 3].getRank()) {
                return true;
            }
        }

        return false;
    }

    // Check if the hand is a full house.
    private boolean isFullHouse() {
        // Check if there are three cards of one rank and two cards of another rank.
        for (int i = 0; i < hand.getCards().length - 2; i++) {
            if (hand.getCards()[i].getRank() == hand.getCards()[i + 1].getRank() &&
                hand.getCards()[i].getRank() == hand.getCards()[i + 2].getRank() &&
                hand.getCards()[i + 3].getRank() == hand.getCards()[i + 4].getRank()) {
                return true;
            }
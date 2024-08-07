/*
 * Final Exam Code Fall 21
 * 
 * Rudimentary Bingo Card class
 * 
 * NOTE: You should remove all the println() statements from any method you supply code for other than printCard()
 */
public class BingoCard {

    private static final int XED_OUT = -1;

    private int[][] card = new int[5][5];

    public BingoCard() {
        for (int c = 0; c < 5; c++) {
            for (int r = 0; r < 5; r++) {
                card[r][c] = 15 * c + r + 1;
            }
        }
        card[2][2] = XED_OUT;
    }

    public void calledNumber(int n) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (card[r][c] == n) {
                    card[r][c] = XED_OUT;
                }
            }
        }
    }

    public boolean checkForBingo() {
        for (int r = 0; r < 5; r++) {
            boolean bingo = true;
            for (int c = 0; c < 5; c++) {
                if (card[r][c] != XED_OUT) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                return true;
            }
        }
        for (int c = 0; c < 5; c++) {
            boolean bingo = true;
            for (int r = 0; r < 5; r++) {
                if (card[r][c] != XED_OUT) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                return true;
            }
        }
        boolean bingo = true;
        for (int i = 0; i < 5; i++) {
            if (card[i][i] != XED_OUT) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            return true;
        }
        bingo = true;
        for (int i = 0; i < 5; i++) {
            if (card[i][4 - i] != XED_OUT) {
                bingo = false;
                break;
            }
        }
        return bingo;
    }

    public void printCard() {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(card[r][c] + " ");
            }
            System.out.println();
        }
    }

    public void calledNumber(String s) {
        int n = Integer.parseInt(s);
        calledNumber(n);
    }

    public void generateCard() {
        for (int c = 0; c < 5; c++) {
            for (int r = 0; r < 5; r++) {
                card[r][c] = 1 + (int) (Math.random() * 75);
            }
        }
        card[2][2] = XED_OUT;
    }

    public static void main(String[] args) {
        BingoCard card = new BingoCard();
        card.printCard();
        card.calledNumber(1);
        card.printCard();
        if (card.checkForBingo()) {
            System.out.println("Bingo!");
        } else {
            System.out.println("No bingo yet, keep playing");
        }
        card.calledNumber("I16");
        card.printCard();
        card.generateCard();
        card.printCard();
    }
}


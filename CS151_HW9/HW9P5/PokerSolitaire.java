public class PokerSolitaire {

  // The board of cards.
  public static Card[][] board = new Card[5][5];

  // The poker hand evaluator.
  public static PokerHandEvaluator pEval = new PokerHandEvaluator();

  // Initializes all variables, including a Deck object d.
  public static void main(String[] args) {

    // Initialize the deck.
    Deck d = new Deck();
    d.shuffle();

    // Initialize the board.
    initBoard();

    // Play the game.
    int gamesWon = 0;
    int averageScore = 0;
    int maxScore = 0;
    do {

      // Get the score of the board.
      int score = evaluateBoard();

      // Check if the player won the game.
      if (score >= 200) {
        gamesWon++;
        averageScore += score;
        maxScore = Math.max(maxScore, score);
      }

      // Ask the player if they want to play again.
      System.out.println("Do you want to play again? (Y/N)");
      String answer = System.console().readLine();
      if (answer.equals("N")) {
        break;
      }

      // Shuffle the deck.
      d.shuffle();

      // Initialize the board.
      initBoard();
    } while (true);

    // Output the final stats.
    System.out.println("Games won: " + gamesWon);
    System.out.println("Average score: " + (averageScore / gamesWon));
    System.out.println("Maximum score: " + maxScore);
  }

  // Initializes the board.
  public static void initBoard() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        board[i][j] = null;
      }
    }
  }

  // Prints the board.
  public static void printBoard() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (board[i][j] == null) {
          System.out.print("  ");
        } else {
          System.out.print(board[i][j].rank + " ");
        }
      }
      System.out.println();
    }
  }

  // Gets the next card from the deck and displays it.
  public static Card getNextCard() {
    Card card = d.deal();
    System.out.println("Your next card is: " + card);
    return card;
  }

  // Gets and verifies row and column from user.
  public static int[] getRowAndColumn(String prompt) {
    System.out.println(prompt);
    String[] input = System.console().readLine().split(" ");
    int row = Integer.parseInt(input[0]) - 1;
    int column = Integer.parseInt(input[1]) - 1;
    if (row < 0 || row >= 5 || column < 0 || column >= 5) {
      System.out.println("Invalid row or column!");
      return getRowAndColumn(prompt);
    }
    return new int[]{row, column};
  }

  // Places the next card on the board.
  public static void placeCard(Card card, int row, int column) {
    board[row][column] = card;
  }

  // Evaluates the board and returns the score.
  public static int evaluateBoard() {
    int score = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        Card card = board[i][j];
        if (card != null) {
          // Check for straight flush.
          if (isStraightFlush(card, i, j)) {
            score += 100;
          }
          // Check for four of a kind.
          if (isFourOfAKind(card, i, j)) {
            score += 50;
          }
          if(isFullHouse(card, i, j))	{
        	  score += 25;
          }
          if(isFlush(card, i, j))	{
        	  score += 20;
          }
          if(isStraight(card, i, j)) {
        	  score += 15;
          }
          if(isThreeOfAKind(card, i, j)) {
        	  score += 10;
          }
          if(isTwoPair(card, i, j))	{
        	  score += 5;
          }
          if(isPair(card, i, j)) {
        	  score += 2;
          }
          }
          }
          }
          }
          }
          }
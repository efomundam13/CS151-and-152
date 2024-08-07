
public class GrilleCoder extends Coder {

  private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private boolean[][] grille;

  public GrilleCoder() {
    super();
  }

  public GrilleCoder(boolean[][] grille) {
    super();
    this.grille = grille;
  }

  @Override
  public String encrypt(String text) {
    String encryptedText = "";
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (c == ' ') {
        encryptedText += ' ';
        continue;
      }
      int row = (c - 'A') / 5;
      int col = (c - 'A') % 5;
      while (!grille[row][col]) {
        row = (row + 1) % grille.length;
      }
      encryptedText += (char) ((row * 5 + col) + 'A');
    }
    return encryptedText;
  }

  @Override
  public String decrypt(String text) {
    String decryptedText = "";
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (c == ' ') {
        decryptedText += ' ';
        continue;
      }
      int row = (c - 'A') / 5;
      int col = (c - 'A') % 5;
      for (int j = 0; j < grille.length; j++) {
        for (int k = 0; k < grille[0].length; k++) {
          if (grille[j][k]) {
            decryptedText += (char) ((j * 5 + k) + 'A');
            break;
          }
        }
      }
    }
    return decryptedText;
  }
}
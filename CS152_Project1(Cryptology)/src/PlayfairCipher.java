public class PlayfairCipher extends KeyCoder {

  private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public PlayfairCipher() {
    super();
  }

  public PlayfairCipher(String key) {
    super(key);
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
      if (key.charAt(row * 5 + col) == '\0') {
        row = (row + 1) % 5;
      }
      encryptedText += key.charAt(row * 5 + col);
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
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          if (key.charAt(j * 5 + k) == c) {
            decryptedText += (char) ((j * 5 + k) + 'A');
            break;
          }
        }
      }
    }
    return decryptedText;
  }
}
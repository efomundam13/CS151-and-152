
public class HW1_WrittenPortion {
/*
1. Look up a description of the UTF-8 encoding scheme (I suggest Wikipedia) and
use it to encode the following characters:
(a) The letter J
(b) The Arabic character
(c) The Balinese character
(d) The Tibetan character
(e) The Ottaman Siyaq number
You’ll probably want to use the Unicode tables found at https://unicode.org/charts/.

(a)The Unicode value for the letter J is U+004A, which falls in the first range. Hex 4A
consists of the 7 bits 100 1010 so its encoding is 11001010 or 4A in hex.
(b) The Unicode value for the Arabic character is U+0648, which falls in the second range.
Hex 6A8 consists of the 11 bits 110 1010 1000 so its encoding is 11011010 10101000 or
DA A8 in hex.
(c) The Unicode value for the Balinese character is U+1B34, which falls in the third
range Hex 1B34 consists of the 16 bits 0001 1011 0011 0100 so its encoding is 11100001
10101100 10110100 or E1 AC B4 in hex.
(d) The Unicode value for the Tibetan character is U+0FC7, which falls in the third
range. Hex 0FC7 consists of the 16 bits 0000 1111 1100 0111 so its encoding is 11100000
10111111 10000111 or E0 BF 87 in hex.
(e) The Unicode value for the Ottaman Siyaq number is U+1ED19, which falls in the
fourth range. Hex 1ED19 consists of the 21 bits 0 0001 1110 1101 0001 1001 so its
encoding is 11110000 10011110 10110100 10011001 or F0 9E B4 99 in hex

2. In class we wrote code that output the numbers 1 to 100000 to a text file and to
a binary file. Given that a character is stored using 16 bits and an integer is stored using 32
bits, determine the size (in bytes) of each of these files. Don’t forget the newline character
written after each number in the text file.
 
In addition there is one newline character at the end of each line for a total of 488895 +
100000 = 588895 characters. Each characters takes 2 bytes the file takes a total of 1177790
bytes of 1177.79 Kbytes.
For the binary file, we our outputting 100, 000 ints, each taking up 32 bits (or 4 bytes). Thus
the total size will be 100, 000 × 4 = 400, 000 bytes or 400 KBytes.

3. Programming Project 6, pg. 648. A cute little program. One small modification:
instead of having some initial advice present in the file for the first user, write code that will
just print out the message No advice to give yet.

public class Prob3 {
public static final String FILENAME = "advice.txt";
public static void main(String [] args)
{
Scanner in = new Scanner(System.in);
Scanner fin = null;
try {
fin = new Scanner(new FileInputStream(FILENAME));
System.out.println("Here’s some programming advice:\n");
while (fin.hasNextLine()) {
System.out.println(fin.nextLine());
}
fin.close();
}
catch (FileNotFoundException e) { // handle initial case when there’s no advice file
System.out.println("No advice to give yet.");
}
PrintWriter fout = null;
try {
fout = new PrintWriter(new FileOutputStream(FILENAME));
}
catch (IOException e) {
System.out.println(e);
System.exit(-1);
}
System.out.println("\nPlease enter some advice for the next user. Hit <Enter> twice to end");
while (true) {
String line = in.nextLine();
if (line.length() == 0) // second <Enter> leads to an empty line
break;
fout.println(line);
}
System.out.println("Thanks for the advice!");
fout.close();
}
}
*/
}

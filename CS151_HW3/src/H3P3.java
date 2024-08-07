/*
 Write a program that reads in a line of text and extracts a web site name embedded
in the line. For example, if the user types in
If you go to https://home.unicode.org/ you can find Unicode charts.
your code should output
web site: https://home.unicode.org/
You may assume the following:
(a) A web site will start with https://.
(b) The web site will always be followed by one or more blanks.
This program is a simple form of data scraping
*/
import java.util.Scanner;
public class H3P3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line, url;
		System.out.println("Please enter a line of text");
		line = in.nextLine();
		
		// determine start and end of url
		int start = line.indexOf("https://");
		int end = line.indexOf(" ", start);
		url = line.substring(start, end);
		System.out.println("web site: " + url);
	}
}

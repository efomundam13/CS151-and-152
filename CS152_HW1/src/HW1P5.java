/*
5. The file presidents.dat contains the same info as presidents.txt but now stored
in a binary file. Write the same program as above but now using the binary file. Your output
file should also be a binary file.
*/

import java.io.*;
import java.util.*;

public class HW1P5 {

  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  ObjectInputStream fin = null;
	  ObjectOutputStream fout = null;
	  
	  try {
		  fin = new ObjectInputStream(new FileInputStream("presidents.dat"));
	  }
	  
	  catch (IOException e) {
		  System.out.println(e);
		  System.exit(-1);
	  }
	  
	  System.out.print("Enter the president’s birth month --> ");
	  int month = in.nextInt();
	  try {
	  fout = new ObjectOutputStream(new FileOutputStream("presidents"+month+".dat"));
	  while (true) {
		  String name = fin.readUTF();
		  int m = fin.readInt();
		  int d = fin.readInt();
		  int y = fin.readInt();
		  if (m == month) { // only output those presidents with correct birth month
			  System.out.println(name.trim() + ": " + m + "/" + d + "/" + y);
			  fout.writeUTF(name);
			  }
		  }
	  }
	  catch (EOFException e) { // only way to detect end-of-file with binary files
	  }
	  catch (IOException e) {
		  System.out.println(e);
		  System.exit(-1);
	  }
	  try {
		  fin.close();
		  fout.close();
	  }
	  catch (IOException e) {
		  System.out.println(e);
		  System.exit(-1);
	  		}
	  }
  }
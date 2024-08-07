/*
6. Modify your GrilleCoder class as follows:
	a.Add a new constructor which takes a String file name as an argument. The file with
	that name will contain a grille in the following format: The first line will contain a
	single (even) integer n specifying the size of the grille. After that will be n lines, each
	containing n values. These values will either be a 0 (indicating a hole in the grille) or 1
	(indicating a non-hole). Two example grille files are shown below:
	
	b.Add a method void isValidGrille which throws a RuntimeException if a grille is
	invalid, and simply returns otherwise. Modify you existing code to call isValidGrille
	where appropriate and catch and handle the exception. (NOTE: one of the two grilles
	above is invalid.)
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grille {

	  private boolean[][] grille;

	  // 5a.
	  public Grille(String path) throws FileNotFoundException {
	    File file = new File(path);
	    Scanner sc = new Scanner(file);
	    int num = Integer.parseInt(sc.nextLine());
	    grille = new boolean[num][num];

	    int index = 0;
	    while (sc.hasNextLine()) {
	      String[] values = sc.nextLine().split(" ");
	      boolean[] boolVals = new boolean[num];
	      for (int i = 0; i < num; i++) {
	        boolVals[i] = values[i] == "0" ? true : false;
	      }
	      grille[index++] = boolVals;
	    }

	    sc.close();
	  }

	  // 5b.
	  public boolean isValidGrille() {

	    // Check if the grille is even.
	    if (grille.length % 2 != 0) {
	      return false;
	    }

	    // Check if all of the values in the grille are either 0 or 1.
	    for (int i = 0; i < grille.length; i++) {
	      for (int j = 0; j < grille[i].length; j++) {
	        if (grille[i][j] != 0 && grille[i][j] != 1) {
	          return false;
	        }
	      }
	    }

	    // Check if there are any adjacent holes.
	    for (int i = 0; i < grille.length; i++) {
	      for (int j = 0; j < grille[i].length; j++) {
	        if (grille[i][j] == 0) {
	          if (i > 0 && grille[i - 1][j] == 0) {
	            return false;
	          }
	          if (j > 0 && grille[i][j - 1] == 0) {
	            return false;
	          }
	          if (i < grille.length - 1 && grille[i + 1][j] == 0) {
	            return false;
	          }
	          if (j < grille[i].length - 1 && grille[i][j + 1] == 0) {
	            return false;
	          }
	        }
	      }
	    }

	    // All checks passed, so the grille is valid.
	    return true;
	  }

	  public void printGrille() {
	    for (int i = 0; i < grille.length; i++) {
	      for (int j = 0; j < grille[i].length; j++) {
	        System.out.print(grille[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}
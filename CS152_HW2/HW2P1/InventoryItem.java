/*
Programming Project 2, pg. 758. I just need the InventoryItem class here – you
do not need to write any of the testing code. We’ll also extend this class with the following
methods:
void compareByName() – sets an internal flag in the class so that comparisons are based on
the name field.
void compareByID() – sets an internal flag in the class so that comparisons are based on
the uniqueItemID field.
Your compareTo function will need to make use of this internal flag.
*/

import java.util.*;

public class InventoryItem implements Comparable<InventoryItem> {

	  private String name;
	  private int uniqueItemID;
	  private int quantity;
	  private double price;
	  private boolean compareByName;

	  public InventoryItem(String name, int uniqueItemID, int quantity, double price) {
	    this.name = name;
	    this.uniqueItemID = uniqueItemID;
	    this.quantity = quantity;
	    this.price = price;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public int getUniqueItemID() {
	    return uniqueItemID;
	  }

	  public void setUniqueItemID(int uniqueItemID) {
	    this.uniqueItemID = uniqueItemID;
	  }

	  public int getQuantity() {
	    return quantity;
	  }

	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  @Override
	  public int compareTo(InventoryItem other) {
	    // If the compareByName flag is set, compare the names of the items.
	    if (this.compareByName) {
	      return this.name.compareTo(other.name);
	    } else {
	      // Otherwise, compare the unique item IDs of the items.
	      return Integer.compare(this.uniqueItemID, other.uniqueItemID);
	    }
	  }

	  public void compareByName() {
	    this.compareByName = true;
	  }

	  public void compareByID() {
	    this.compareByName = false;
	  }
	}
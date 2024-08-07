/*
Programming Project 12, pg. 256-257. For this problem you need to create
two classes: the Pizza class (described in Programming Project 11 on pg. 256) and the
PizzaOrder class. Use the code suggested on pg. 257 for the body of the main method
in the PizzaOrder class. One small change: use the method name toString instead of
getDescription for the Pizza class. And one addition: add a toString method to the
PizzaOrder class. You may use any reasonable format for the output of this method. 
*/

public class Pizza {

    // Fields
    private String size;
    private String crust;
    private String toppings;

    // Constructor
    public Pizza(String size, String crust, String toppings) {
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }

    // Accessors
    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getToppings() {
        return toppings;
    }

    // Mutators

    // toString method
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", toppings=" + toppings + "]";
    }
}
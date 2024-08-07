import java.util.*;

public class PizzaOrder {

    // Fields
    private String customerName;
    private String customerAddress;
    private List<Pizza> pizzas;

    // Constructor
    public PizzaOrder(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        pizzas = new ArrayList<>();
    }

    // Accessors
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    // Mutators
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    // toString method
    @Override
    public String toString() {
        String pizzasString = "";
        for (Pizza pizza : pizzas) {
            pizzasString += pizza.toString() + "\n";
        }
        return "PizzaOrder [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pizzas=" + pizzasString + "]";
    }
}
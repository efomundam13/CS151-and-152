
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new pizza order
        PizzaOrder order = new PizzaOrder("John Smith", "123 Main Street");

        // Add two pizzas to the order
        order.addPizza(new Pizza("Large", "Thin Crust", "Pepperoni, Mushrooms, Onion"));
        order.addPizza(new Pizza("Medium", "Deep Dish", "Sausage, Peppers, and Eggs"));

        // Print the order details
        System.out.println(order);
    }
}
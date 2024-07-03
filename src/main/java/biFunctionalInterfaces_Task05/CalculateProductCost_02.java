package biFunctionalInterfaces_Task05;

import java.util.Map;
import java.util.function.BiFunction;

public class CalculateProductCost_02 {

	public static void main(String[] args) {
		// BiFunction to calculate the cost of products given a Product and quantity
		BiFunction<Product, Integer, Double> calculateCost = (product, quantity) -> product.getPrice() * quantity;

		// Creating some Product instances
		Product product1 = new Product("Laptop", 1000.0, "Electronics", 2);
		Product product2 = new Product("Phone", 500.0, "Electronics", 4);
		Product product3 = new Product("Tablet", 300.0, "Electronics", 6);

		// Creating a cart (Map of Product and quantity)
		Map<Product, Integer> cart = Map.of(product1, 2, product2, 3, product3, 1);

		// Calculate the total cost of the cart
		double totalCost = calculateCartCost(cart, calculateCost);
		
		// Print the total cost of the cart
        System.out.println("Total cost of the cart: " + totalCost);

	}

// Method to calculate the total cost of the cart
	public static double calculateCartCost(Map<Product, Integer> cart,
			BiFunction<Product, Integer, Double> calculateCost) {
		return cart.entrySet().stream().mapToDouble(entry -> calculateCost.apply(entry.getKey(), entry.getValue()))
				.sum();

	}
}

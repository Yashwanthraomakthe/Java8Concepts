package biFunctionalInterfaces_Task05;

import java.util.function.BiFunction;

public class CreateProduct_01 {

	public static void main(String[] args) {
		// BiFunction to create a Product given the name and price
		BiFunction<String, Double, Product> productCreator = (name, price) -> new Product(name, price,
				"Electornic", 3);

		// Test the BiFunction
		Product product = productCreator.apply("Laptop", 1000.0);

		// Print the details of the Product
		System.out.println(product);

	}

}

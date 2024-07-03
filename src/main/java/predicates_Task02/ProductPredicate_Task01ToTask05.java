package predicates_Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductPredicate_Task01ToTask05 {

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Phone", 500, "electronics", 1));
		productList.add(new Product("Shoes", 1500, "Category 2", 2));
		productList.add(new Product("Charger", 2000, "electronics", 3));
		productList.add(new Product("Umbrella", 800, "Category 4", 4));
		productList.add(new Product("key", 1200, "Category 5", 5));
		productList.add(new Product("PowerBank", 50, "electronics", 1));
		productList.add(new Product("Washing Machine", 50, "electronics", 1));

		// Define the predicate to check if the price is greater than 1000/-
		Predicate<Product> pricePredicate = product -> product.getPrice() > 1000;

		System.out.println("Print all the products with price greater than 1000/-");
		// Print all the products with price greater than 1000/-
		for (Product product : productList) {
			if (pricePredicate.test(product)) {
				System.out.println(product.getName() + " - " + product.getPrice());
			}
		}

		// Define the predicate to check if the product is of electronics category
		Predicate<Product> electronicsPredicate = product -> product.getCategory().equalsIgnoreCase("Electronics");

		// Print all the products with electronics category
		System.out.println();
		System.out.println("Print all the products with electronics category");
		for (Product product : productList) {
			if (electronicsPredicate.test(product)) {
				System.out.println(product.getName() + " - " + product.getCategory());
			}
		}

		// Define the predicate to filter products with price greater than 100/- and in
		// electronics category
		Predicate<Product> filterPredicate = product -> product.getPrice() > 100
				&& product.getCategory().equalsIgnoreCase("Electronics");

		// products with price greater than 100/- and in electronics category
		System.out.println();
		System.out.println("products with price greater than 100/- and in electronics category");
		for (Product product : productList) {
			if (filterPredicate.test(product)) {
				System.out.println(product.getName() + " - " + product.getCategory());
			}
		}

		// products from the given list of product if the product price is greaterthan
		// 100/- or product is in electronics category.
		Predicate<Product> filterPredicate1 = product -> product.getPrice() > 100
				|| product.getCategory().equalsIgnoreCase("Electronics");

		// product price is greaterthan 100/- or product is in electronics category.
		System.out.println();
		System.out.println("product price is greaterthan 100/- or product is in electronics category.");
		for (Product product : productList) {
			if (filterPredicate1.test(product)) {
				System.out.println(product.getName() + " - " + product.getCategory() + " - " + product.getPrice());
			}
		}

		// product price is lessthan 100/- and product is in electronics category
		Predicate<Product> filterPredicate2 = product -> product.getPrice() < 100
				&& product.getCategory().equalsIgnoreCase("Electronics");

		// product price is lessthan 100/- and product is in electronics category
		System.out.println();
		System.out.println("product price is lessthan 100/- and product is in electronics category");
		for (Product product : productList) {
			if (filterPredicate2.test(product)) {
				System.out.println(product.getName() + " - " + product.getCategory() + " - " + product.getPrice());
			}
		}

	}

}

package functionalInterface_Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FIHomeTasks {

	// Task 01 : Calculate the total cost of all products using the cost function
	public static double calculateTotalCost(List<Product> productList, Function<Product, Double> costFunction) {
		double totalCost = 0;
		for (Product product : productList) {
			totalCost = totalCost + costFunction.apply(product);
		}
		return totalCost;
	}

	// Task 02: Function Interface to calculate the cost of all products whose
	// prices is > 1000/- in the given list of products.
	public static double calculateCost(List<Product> products, Predicate<Product> predicateprice) {
		double totalCost = 0;
		for (Product product : products) {
			if (predicateprice.test(product)) {
				totalCost += product.getPrice();
			}
		}
		return totalCost;
	}

	// Task 03: calculate the cost of all electronic products in the given list of
	// products.
	public static double calculateElectronicsCategoryCost(List<Product> products,
			Predicate<Product> predicateElectronics) {
		double totalCost = 0;
		for (Product product : products) {
			if (predicateElectronics.test(product)) {
				totalCost += product.getPrice();
			}
		}
		return totalCost;
	}

	// Task 04: get all the products whose price is is > 1000/- and belongs to
	// electronic category.
	public static double getProductsWithPriceCatergoryFilter(List<Product> products,
			Predicate<Product> predicateAllProducts) {
		double totalCost = 0;
		for (Product product : products) {
			if (predicateAllProducts.test(product)) {
				totalCost += product.getPrice();
			}
		}
		return totalCost;
	}

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Product 1", 500, "Category 1", 1));
		productList.add(new Product("Product 2", 1500, "Electronics", 2));
		productList.add(new Product("Product 3", 2000, "Category 3", 3));
		productList.add(new Product("Product 4", 800, "Electronics", 4));
		productList.add(new Product("Product 5", 1200, "Category 5", 5));
		productList.add(new Product("Product 6", 1500, "Electronics", 2));

		// Define a function to calculate the cost of a product
		Function<Product, Double> costFunction = Product::getPrice;

		// Calculate the total cost of all products using the cost function
		double totalCost01 = calculateTotalCost(productList, costFunction);
		System.out.println("Total Cost of Products: " + totalCost01);

		// Task 02: Function Interface to calculate the cost of all products whose
		// prices is > 1000/- in the given list of products.
		Predicate<Product> predicateprice = product -> product.getPrice() > 1000;
		// double totalCost02 = calculateCost(productList, product -> product.getPrice()
		// > 1000);
		double totalCost02 = calculateCost(productList, predicateprice);
		System.out.println("Total cost of products with price > 1000/-: " + totalCost02);

		// Task 03: calculate the cost of all electronic products in the given list of
		// products.
		Predicate<Product> predicateElectronics = product -> product.getCategory().equalsIgnoreCase("Electronics");
		double totalCost03 = calculateElectronicsCategoryCost(productList, predicateElectronics);
		System.out.println("cost of all electronic products in the given list of-: " + totalCost03);

		// Task 04: get all the products whose price is is > 1000/- and belongs to
		// electronic category.
		Predicate<Product> predicateAllProducts = product -> product.getCategory().equalsIgnoreCase("Electronics")
				&& product.getPrice() > 1000;
		double totalCost04 = getProductsWithPriceCatergoryFilter(productList, predicateAllProducts);
		System.out.println(
				"all the products whose price is is > 1000/- and belongs to electronic category.-: " + totalCost04);

	}
}

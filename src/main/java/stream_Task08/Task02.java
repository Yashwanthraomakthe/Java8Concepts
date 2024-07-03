package stream_Task08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1500, "Electronics", 1));
		products.add(new Product("Smartphone", 800, "Electronics", 2));
		products.add(new Product("Desk", 1200, "Furniture", 1));
		products.add(new Product("Chair", 700, "Furniture", 3));
		products.add(new Product("Refrigerator", 2000, "Appliances", 1));
		products.add(new Product("Oven", 900, "Appliances", 2));

		List<Product> electronicsProducts = products.stream()
				.filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).collect(Collectors.toList());

		electronicsProducts.forEach(System.out::println);
	}

}

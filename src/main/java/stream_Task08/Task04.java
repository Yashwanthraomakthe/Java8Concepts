package stream_Task08;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1500, "Electronics", 1));
		products.add(new Product("Smartphone", 800, "Electronics", 2));
		products.add(new Product("Desk", 1200, "Furniture", 1));
		products.add(new Product("Chair", 700, "Furniture", 3));
		products.add(new Product("Refrigerator", 2000, "Appliances", 1));
		products.add(new Product("Oven", 900, "Appliances", 2));

		long countOfElectronics = products.stream()
				.filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).count();

		System.out.println("Count of electronic products: " + countOfElectronics);
	}
}

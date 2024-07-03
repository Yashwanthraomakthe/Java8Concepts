package consumerSupplier_Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask04 {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Product 1", 2500, "Category 1", "Grade A"));
		productList.add(new Product("Product 2", 3500, "Category 2", "Premium"));
		productList.add(new Product("Product 3", 4000, "Category 3", "Premium"));

		Consumer<Product> printPremiumProducts = product -> {
			if (product.getGrade().equals("Premium")) {
				System.out.println(product.toString().replace(product.getName(), product.getName() + "*"));
			}
		};

		productList.forEach(printPremiumProducts);
	}
}

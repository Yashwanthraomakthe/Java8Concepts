package consumerSupplier_Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask03 {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Product 1", 2500, "Category 1", "Grade A"));
		productList.add(new Product("Product 2", 3500, "Category 2", "Grade B"));
		productList.add(new Product("Product 3", 4000, "Category 3", "Grade C"));

		Consumer<Product> updateName = product -> {
			if (product.getPrice() > 3000) {
				product.setName(product.getName() + "*");
			}
		};

		productList.forEach(updateName);
		productList.forEach(System.out::println);
	}
}

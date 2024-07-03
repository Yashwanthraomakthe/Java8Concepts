package consumerSupplier_Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask02 {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("iPhone", 999.99, "Electronics", "A+"));
		productList.add(new Product("Laptop", 1500.0, "Electronics", "A"));
		productList.add(new Product("Shirt", 25.99, "Clothing", "B"));

		Consumer<Product> updateGradeConsumer = p -> {
			if (p.getPrice() > 1000.0) {
				p.setGrade("Premium");
			}
		};

		Consumer<Product> printConsumer = p -> {
			System.out.println("Name: " + p.getName());
			System.out.println("Price: $" + p.getPrice());
			System.out.println("Category: " + p.getCategory());
			System.out.println("Grade: " + p.getGrade());
			System.out.println();
		};

		productList.forEach(updateGradeConsumer.andThen(printConsumer));
	}
}

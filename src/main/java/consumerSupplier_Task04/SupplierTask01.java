package consumerSupplier_Task04;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTask01 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Product 1", "Product 2", "Product 3");
		List<String> categories = Arrays.asList("Category 1", "Category 2", "Category 3");
		List<String> grades = Arrays.asList("Grade A", "Grade B", "Grade C");

		Supplier<Product> randomProductSupplier = () -> {
			Random random = new Random();
			String name = names.get(random.nextInt(names.size()));
			double price = random.nextDouble() * 100 + 500; 
			String category = categories.get(random.nextInt(categories.size()));
			String grade = grades.get(random.nextInt(grades.size()));
			return new Product(name, price, category, grade);
		};

		Product randomProduct = randomProductSupplier.get();
		System.out.println(randomProduct.toString());
	}
}

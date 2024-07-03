package consumerSupplier_Task04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Consumer;

public class ConsumerTask01 {
	 public static void main(String[] args) {
	        Product product = new Product("iPhone", 999.99, "Electronics", "A+");

	        Consumer<Product> printConsumer = p -> {
	            String printParameter = "file"; 

	            if (printParameter.equals("file")) {
	                try (PrintWriter writer = new PrintWriter(new FileWriter("product.txt"))) {
	                    writer.println("Name: " + p.getName());
	                    writer.println("Price: $" + p.getPrice());
	                    writer.println("Category: " + p.getCategory());
	                    writer.println("Grade: " + p.getGrade());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                System.out.println("Name: " + p.getName());
	                System.out.println("Price: $" + p.getPrice());
	                System.out.println("Category: " + p.getCategory());
	                System.out.println("Grade: " + p.getGrade());
	            }
	        };

	        printConsumer.accept(product);
	    }
}

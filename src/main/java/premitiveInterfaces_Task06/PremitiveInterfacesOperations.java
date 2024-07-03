package premitiveInterfaces_Task06;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PremitiveInterfacesOperations {

	// Task01 : IntPredicate to check if a number is prime
	public static void primeNumberPredicate() {

		IntPredicate isPrime = (number) -> {
			if (number <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		};

		// Test the IntPredicate with some numbers
		int[] testNumbers = { 2, 3, 4, 5, 10, 13, 17, 19, 23, 24 };

		for (int number : testNumbers) {
			System.out.println("Is " + number + " a prime number? " + isPrime.test(number));
		}

	}

	// IntConsumer to print the square of a number
	public static void squareRootConsumer() {

		IntConsumer printSquare = (number) -> {
			System.out.println("The square of " + number + " is " + (number * number));
		};

		// Test the IntConsumer with some numbers
		int[] testNumbers = { 2, 3, 4, 5, 10 };

		for (int number : testNumbers) {
			printSquare.accept(number);
		}
	}

	// IntSupplier to generate a random int below 5000
	public static void printRandomNumberSupplier() {
		// Create an instance of Random
		Random random = new Random();

		IntSupplier randomIntSupplier = () -> random.nextInt(5000);

		// Test the IntSupplier by getting a few random values
		for (int i = 0; i < 5; i++) {
			System.out.println("Random int below 5000: " + randomIntSupplier.getAsInt());
		}
	}

	public static void main(String[] args) {
		primeNumberPredicate();
		squareRootConsumer();
		printRandomNumberSupplier();
	}
}

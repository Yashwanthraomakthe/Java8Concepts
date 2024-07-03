package lambda_Expressions_Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondBiggestNumber_02 {

	/**
	 * Driver program to calculate SecondLargest number
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(25);

		int secondLargest1 = findSecondLargestWTLambda(numbers);
		System.out.println("Second largest number without Lambda: " + secondLargest1);

		int secondLargest2 = findSecondLargestwithLambda(numbers);
		System.out.println("Second largest number without Lambda: " + secondLargest2);

	}

	/**
	 * method to find second Largest Number without using lambda
	 * @param numbers
	 * @return
	 */
	public static int findSecondLargestWTLambda(List<Integer> numbers) {
		Collections.sort(numbers);
		return numbers.get(numbers.size() - 2);
	}

	/**
	 * method to find second Largest Number by using lambda
	 * @param numbers
	 * @return
	 */
	public static Integer findSecondLargestwithLambda(List<Integer> numbers) {
		return numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("List is empty"));

	}

}

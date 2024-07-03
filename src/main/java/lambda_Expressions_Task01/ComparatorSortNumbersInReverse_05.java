package lambda_Expressions_Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSortNumbersInReverse_05 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(25);

		System.out.println("Original List : " + numbers);
		Collections.sort(numbers);
		System.out.println("Default sort Using Collections Sort method : " + numbers);

		/*
		 * Commenting this code to implement lambda expression Collections.sort(numbers,
		 * new myComparator());
		 * System.out.println("Sort Using Comparator in reverse order: " + numbers);
		 */

		Comparator<Integer> c = (n1, n2) -> (n1 < n2) ? -1 : (n1 > n2) ? -1 : 0;
		Collections.sort(numbers, c);

		System.out.println("Sort Using Comparator in reverse order with lambda: " + numbers);

	}

}

class myComparator implements Comparator<Integer> {

	public int compare(Integer n1, Integer n2) {
		if (n1 < n2) {
			return 1;
		}
		if (n1 > n2) {
			return -1;
		}

		return 0;
	}

}

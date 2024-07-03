package lambda_Expressions_Task01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortValuesDescending_09 {

	public static void main(String[] args) {
		// Create a comparator for reverse order sorting
		Comparator<Integer> reverseOrderComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		};

		// Create a TreeMap with the custom comparator
		Map<Integer, String> descendingSortedMap = new TreeMap<>(reverseOrderComparator);
		
		// Create a TreeMap with a custom comparator using a lambda expression
        Map<Integer, String> descendingSortedMap1 = new TreeMap<>((a, b) -> b - a);

		// Add some entries to the TreeMap
		descendingSortedMap.put(1, "One");
		descendingSortedMap.put(5, "Five");
		descendingSortedMap.put(3, "Three");
		descendingSortedMap.put(10, "Ten");
		descendingSortedMap.put(7, "Seven");

		// Print the TreeMap
		System.out.println("TreeMap without Lambda: " + descendingSortedMap);
	}
}

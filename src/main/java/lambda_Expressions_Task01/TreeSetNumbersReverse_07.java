package lambda_Expressions_Task01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNumbersReverse_07 {
	//7. Create a TreeSet that sorts the given set of numbers in reverse order
	public static void main(String[] args) {
        // Create a comparator for reverse order sorting
        Comparator<Integer> reverseOrderComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };

        // Create a TreeSet with the custom comparator
        Set<Integer> set = new TreeSet<>(reverseOrderComparator);
        
        // // Create a TreeSet with a custom comparator using a lambda expression
        Set<Integer> set1 = new TreeSet<>((a, b) -> b - a);

        // Add some numbers to the TreeSet
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(10);
        set.add(7);

        // Print the TreeSet
        System.out.println("TreeSet without Lambda: " + set);
    }

}


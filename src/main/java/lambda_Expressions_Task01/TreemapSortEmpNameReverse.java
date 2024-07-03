package lambda_Expressions_Task01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee10 {
    String name;
    int id;

    Employee10(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}

public class TreemapSortEmpNameReverse {
    public static void main(String[] args) {
        // Create a comparator for reverse order sorting of names
        Comparator<String> reverseOrderComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        };

        // Create a TreeMap with the custom comparator
        Map<String, Employee10> descendingSortedMap = new TreeMap<>(reverseOrderComparator);
        
        // Create a TreeMap with a custom comparator using a lambda expression
        Map<String, Employee10> descendingSortedMap1 = new TreeMap<>((a, b) -> b.compareTo(a));


        // Add some employees to the TreeMap
        descendingSortedMap.put("John", new Employee10("John", 1));
        descendingSortedMap.put("Alice", new Employee10("Alice", 2));
        descendingSortedMap.put("Bob", new Employee10("Bob", 3));
        descendingSortedMap.put("Diana", new Employee10("Diana", 4));
        descendingSortedMap.put("Charlie", new Employee10("Charlie", 5));

        // Print the TreeMap
        for (Map.Entry<String, Employee10> entry : descendingSortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
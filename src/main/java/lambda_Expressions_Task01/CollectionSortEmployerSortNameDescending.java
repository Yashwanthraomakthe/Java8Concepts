package lambda_Expressions_Task01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee11 {
    String name;
    int id;

    Employee11(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + '}';
    }
}

public class CollectionSortEmployerSortNameDescending {
    public static void main(String[] args) {
    	
    	
    	// Create a comparator for reverse order sorting of names
        Comparator<Employee11> reverseOrderComparator = new Comparator<Employee11>() {
            @Override
            public int compare(Employee11 a, Employee11 b) {
                return b.name.compareTo(a.name);
            }
        };
        
        // Create a list of employees
        List<Employee11> employees = new ArrayList<>();
        employees.add(new Employee11("John", 1));
        employees.add(new Employee11("Alice", 2));
        employees.add(new Employee11("Bob", 3));
        employees.add(new Employee11("Diana", 4));
        employees.add(new Employee11("Charlie", 5));

        // Sort the list using Collections.sort with a lambda expression
        Collections.sort(employees, (a, b) -> b.name.compareTo(a.name));
        
     // Sort the list using Collections.sort with the custom comparator
        Collections.sort(employees, reverseOrderComparator);

        // Print the sorted list
        for (Employee11 employee : employees) {
            System.out.println(employee);
        }
    }
}

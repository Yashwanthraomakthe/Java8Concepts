package lambda_Expressions_Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSortEmployeeNames_06 {

	//6. Use Comparator inerface to sort given list of Employees in the alphabetic order of their name
	
	public static void main(String[] args) {
		ArrayList<Employee05> list = new ArrayList<Employee05>();
		list.add(new Employee05("Yash"));
		list.add(new Employee05("Amar"));
		list.add(new Employee05("Rakesh"));
		list.add(new Employee05("Sagar"));
		list.add(new Employee05("Bablu"));

		/*
		 * General implementation Create a custom comparator to sort employees by name
		 */
		Comparator<Employee05> nameComparator = new Comparator<Employee05>() {
			@Override
			public int compare(Employee05 emp1, Employee05 emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
		};

		/*
		 * Implementation using Lambda Sort the list using lambda expression
		 */
		Collections.sort(list, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

		// Sort the list using the custom comparator
		Collections.sort(list, nameComparator);

		// Print the sorted list
		for (Employee05 employee : list) {
			System.out.println(employee.getName());
		}

	}

}

class Employee05 {
	String name;

	Employee05(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}
}

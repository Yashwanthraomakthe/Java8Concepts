package lambda_Expressions_Task01;

import java.util.Comparator;
import java.util.TreeSet;

//8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
// EmployeeTreeSet class
class EmployeeTreeSet {
	String name;
	int id;

	public EmployeeTreeSet(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "EmployeeTreeSet{name='" + name + "', id=" + id + "}";
	}
}

// Comparator class to sort EmployeeTreeSets by name
class EmployeeTreeSetNameComparator implements Comparator<EmployeeTreeSet> {
	@Override
	public int compare(EmployeeTreeSet e1, EmployeeTreeSet e2) {
		// return e1.getName().compareTo(e2.getName());
		return e1.getName().compareTo(e2.getName());
	}
}

public class TreeSetEmployeeTreeSetSortName_08 {
	public static void main(String[] args) {
		// Without lambda
		System.out.println("Sort without Lambda");
		TreeSet<EmployeeTreeSet> emp1 = new TreeSet<>(new EmployeeTreeSetNameComparator());
		emp1.add(new EmployeeTreeSet("Alice", 1));
		emp1.add(new EmployeeTreeSet("Bob", 2));
		emp1.add(new EmployeeTreeSet("Charlie", 3));

		for (EmployeeTreeSet EmployeeTreeSet : emp1) {
			System.out.println(EmployeeTreeSet);
		}

		System.out.println("--------------------------------------------");
		// With Lambda
		System.out.println("Sort with Lambda");
		TreeSet<EmployeeTreeSet> emp2 = new TreeSet<>((e1, e2) -> e1.getName().compareTo(e2.getName()));
		emp2.add(new EmployeeTreeSet("Ram", 2));
		emp2.add(new EmployeeTreeSet("Charan", 3));

		for (EmployeeTreeSet EmployeeTreeSet : emp2) {
			System.out.println(EmployeeTreeSet);
		}

	}
}

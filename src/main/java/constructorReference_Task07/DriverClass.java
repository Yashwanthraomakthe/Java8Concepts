package constructorReference_Task07;

public class DriverClass {
	public static void main(String[] args) {
		// Constructor reference to create an Employee object
		EmployeeFactory employeeFactory = Employee::new;

		// Create an Employee instance using the constructor reference
		Employee employee = employeeFactory.get("Yashwanth", "2366", 5000);

		// Print the details of the Employee
		System.out.println(employee);

	}
}

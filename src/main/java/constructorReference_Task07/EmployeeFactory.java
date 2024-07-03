package constructorReference_Task07;

@FunctionalInterface
interface EmployeeFactory {
	Employee get(String name, String account, double salary);
}
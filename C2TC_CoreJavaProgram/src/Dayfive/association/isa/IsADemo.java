package Dayfive.association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Harshitha", 101, "IT");
		Manager manager = new Manager("Ankita", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}
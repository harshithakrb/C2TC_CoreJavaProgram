package Dayfive.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Person person = new Person("Anirudh", address);
		person.displayInfo();
	}
}
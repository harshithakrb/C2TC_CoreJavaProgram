package Day1.entity;

public class Customer1Demo {
	public static void main(String[] args) {
		Customer1 c1= new Customer1();
		c1.setCid(101);
		c1.setName("Harshii");
		c1.setCity("Pondy");
		System.out.println("Customer id: "+c1.getCid());
		System.out.println("Customer name: "+c1.getName());
		System.out.println("Customer city: "+c1.getCity());
		
		Customer1 c2= new Customer1();
		c2.setCid(101);
		c2.setName("Bannu");
		c2.setCity("Puducherry");
		System.out.println(" ");
		System.out.println("Customer id: "+c2.getCid());
		System.out.println("Customer name: "+c2.getName());
		System.out.println("Customer city: "+c2.getCity());

}
}
package Day2.Constructor;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1= new Customer();
		System.out.println(c1);

		Customer c2=new Customer(102,"Harshii","Pondy");
		System.out.println(c2);
		
		Customer c3=new Customer("Harshii","Pondy");
		System.out.println(c3);
	}
}
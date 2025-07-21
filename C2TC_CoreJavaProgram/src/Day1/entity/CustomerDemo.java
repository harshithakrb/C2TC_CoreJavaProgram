package Day1.entity;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1= new Customer();
		c1.cid=101;
		c1.name="A";
		c1.city="Puducherry";
		System.out.println("Customer id: "+c1.cid);
		System.out.println("Customer name: "+c1.name);
		System.out.println("Customer city: "+c1.city);
		System.out.println(" ");
		
		Customer c2= new Customer();
		c2.cid=101;
		c2.name="B";
		c2.city="Chennai";
		System.out.println("Customer id: "+c2.cid);
		System.out.println("Customer name: "+c2.name);
		System.out.println("Customer city: "+c2.city);
		System.out.println(" ");
				
		Customer c3= new Customer();
		c3.cid=101;
		c3.name="C";
		c3.city="Andhra";
		System.out.println("Customer id: "+c3.cid);
		System.out.println("Customer name: "+c3.name);
		System.out.println("Customer city: "+c3.city);
	}
	
	

}
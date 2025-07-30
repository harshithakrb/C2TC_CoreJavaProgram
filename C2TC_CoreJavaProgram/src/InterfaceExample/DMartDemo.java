package InterfaceExample;

public class DMartDemo {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();

        // Customer chooses Food section
        DMart foodSection = new FoodCourt();
        customer1.chooseSection(foodSection);
        customer1.shopping();

        System.out.println();

        // Customer chooses Trends section
        DMart trendsSection = new Trends();
        customer1.chooseSection(trendsSection);
        customer1.shopping();
    }
}

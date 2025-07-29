package InterfaceExample;

public interface DMart {
	
	void shopping();

}

public class DMart {
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        // Customer chooses Food section
        DMart FoodCourt = new FoodCourt();
        customer1.chooseSection(foodSection);
        customer1.shopping();

        System.out.println();

        // Customer chooses Trends section
        Dmart Trends = new Trends();
        customer1.chooseSection(trendsSection);
        customer1.shopping();
    }
}
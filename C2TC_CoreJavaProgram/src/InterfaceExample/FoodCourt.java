package InterfaceExample;

public class FoodCourt implements DMart{
	
	@Override
	public void shopping()
	{
		System.out.println("Welcome to FoodCourt");
		System.out.println("We provide offer upto 30% o Pizzas");
	}
}

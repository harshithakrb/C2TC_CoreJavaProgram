//Program to define concrete class that implements the Phone interface.
package Dayeight.Interfaces.InstanceOfInterface;

public class Samsung implements Phone{
	
	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");

	}

}

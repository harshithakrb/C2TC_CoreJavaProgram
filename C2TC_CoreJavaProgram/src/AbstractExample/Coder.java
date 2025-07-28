package AbstractExample;

public abstract class Coder {
	protected static final String wakeup="5 AM";
	
	//Abstract method declared
	abstract public void rules();
	
	//Concrete method
	public void show()
	{
		System.out.println("To become a Coder, Practice Coding on Early Morning");
	}

}
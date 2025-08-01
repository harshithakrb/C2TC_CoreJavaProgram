package Dayfourteen.InterThreadCommunication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		//Shared Resource
		Q obj=new Q();
		
		Producer p1=new Producer(obj);
		Consumer c1=new Consumer(obj);
		
		try {
			p1.join();
			c1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

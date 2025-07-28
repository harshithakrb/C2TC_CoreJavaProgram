package Polymorphism_Override;

public class OverrideDemo {

	public static void main(String[] args) {
		
		//Late Binding, Dynamic Binding, Runtime
		//Base Class
		PLTraining p1=new PLTraining();
		p1.session("Full Stack Development");
		
		//JFS Object
		p1=new JFS();
		p1.session("Method overriding");
		
		//Python Object
		p1=new Python();
		p1.session("Method overriding");

	}

}

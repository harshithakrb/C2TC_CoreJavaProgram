package Day1.basics;
import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		int a,b,c;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the values:");
	    a=s.nextInt();
	    b=s.nextInt();
	    c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" is "+c);

	}

}
//Program to demonstrate user defined generic class
package Dayfifteen.generics;

//Generic class
public class GenericClass <T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}
}
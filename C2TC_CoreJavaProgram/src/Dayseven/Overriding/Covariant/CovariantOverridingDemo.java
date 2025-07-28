package Dayseven.Overriding.Covariant;

public class CovariantOverridingDemo {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// new student object created
		Student student1 = new Student(1, "B.Tech", "Harshitha");
		student1.printData();

		// Student object created using clone method
		// assuming type casting is required
	//	Student student2 = (Student) student1.clone();
		//student2.printData();
	
	 //using covariant return type no need to type cast 
	  Student student2 =student1.clone(); 
	  student2.setName("Bannu"); 
	  student2.setRollNo(2);
	  student2.printData();
		

	}

}

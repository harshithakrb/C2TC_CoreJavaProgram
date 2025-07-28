package Polymorphism_Override;

class Student extends College{
	
	@Override
	public Student getobject()
	{
		return new Student();
	}

}

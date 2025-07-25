package Day5;

public class Student extends Person{
	private int sid;
	private String coursename;
	
	//Constructor from Person
	public Student(int pid, String name, String city, int sid, String coursename) {
		super(pid, name, city);
		this.sid = sid;
		this.coursename = coursename;
	}
    //getter and setter
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	@Override
	public String toString() {
		return "Student [Person id:"+super.getPid()
		+" Student Name:"+super.getName()
		+" student id=" +sid 
		+", Course Name=" + coursename +"]";
	}
}

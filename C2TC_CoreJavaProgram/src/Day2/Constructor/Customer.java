package Day2.Constructor;

public class Customer {
	private int cid;
	private String name;
	private String city;
	
	//Default Constructors
	public Customer() {
		this.cid=101;
		this.name="Bannu";
		this.city="Chennai";
	}
	
	//Parametarized Constructor
	public Customer(int cid, String name, String city) {
		this.cid=cid;
		this.name=name;
		this.city=city;
	}
	
    //set() get()
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Customer2 [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
}
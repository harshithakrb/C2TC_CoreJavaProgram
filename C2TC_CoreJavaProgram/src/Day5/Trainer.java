package Day5;

public class Trainer extends Person{
	
	private String session;
	private String designation;
	private String batchNo;
	

	public Trainer(int pid, String name, String city, String session, String designation, String batchNo) {
		super(pid,name,city);
		this.session = session;
		this.designation = designation;
		this.batchNo = batchNo;
	}

	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	
	@Override
	public String toString() {
		return "Trainer [Trainer id:"+super.getPid()
		+" Trainer Name:"+super.getName()
		+" Session=" +session 
		+", designation=" + designation
		+", batchNo=" + batchNo + "]";
	}
	
}

package monpac;

public class Medcin {
	int id;
	String lname;
	String fname;

	public Medcin(int id, String lname, String fname) {
		super();
		this.id = id;
		this.lname = lname;
		this.fname = fname;
	}
	public Medcin() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String Fname) {
		this.fname = Fname;
	}
	
	
	
}


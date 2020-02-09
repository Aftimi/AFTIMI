package monpac;
public class Client {
	int idc;
	String lname;
	String fname;
	public Client(int idc, String lname, String fname) {
		super();
		this.idc = idc;
		this.lname = lname;
		this.fname = fname;
	}
	public Client() {
		
	}
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
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
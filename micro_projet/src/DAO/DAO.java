package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import monpac.rv;
public abstract class DAO<T> {
	  protected Connection connect = null;	   
	  public DAO(Connection conn){
	    this.connect = conn;
	  }
  private static Connection con;
	public static Connection micro_projet(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_db","root","isil");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public abstract T find(int id);
public void add(rv element) {
	// TODO Auto-generated method stub
	
}
public rv getRv(int id) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
public ArrayList<rv> getList() throws Exception {
	// TODO Auto-generated method stub
	return null;
}

}
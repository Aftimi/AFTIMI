package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import monpac.Client;
import monpac.Medcin;
//CTRL + SHIFT + O pour générer les imports
public class MedcinDao  extends DAO<Medcin> {
public MedcinDao (Connection conn) {
  super(conn);
}
public void add(Medcin element) {
	Connection c=DAO.micro_projet();
	Statement s;
	try {
		s = c.createStatement();
		String query= "INSERT INTO medcin VALUES('"+element.getFname()+"','"+element.getLname()+"')";
        s.executeUpdate(query);	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	} 
public Medcin find(int id) {
	Medcin  Medcin = new Medcin();      
    
  try {
    ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM medcin WHERE idmedcin = " + id);
    if(result.first())
    	Medcin= new Medcin(
        id,
        result.getString("name"),
        result.getString("lname"));         
  } catch (SQLException e) {
    e.printStackTrace();
  }
  return Medcin;
}
}
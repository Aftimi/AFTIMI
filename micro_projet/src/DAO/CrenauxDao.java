package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import monpac.Client;
import monpac.Crenaux;
public class CrenauxDao  extends DAO<Crenaux> {
public CrenauxDao (Connection conn) {
  super(conn);
}
public void add(Crenaux element) {
	Connection c=DAO.micro_projet();
	Statement s;
	try {
		s = c.createStatement();
		String query= "INSERT INTO Creanux VALUES('"+element.getDheure()+"','"+element.getFheure()+"')";
        s.executeUpdate(query);	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
public Crenaux find(int id) {
	Crenaux  Crenaux = new Crenaux();      
    
  try {
    ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Crenaux WHERE idcre = " + id);
    if(result.first())
    	Crenaux= new Crenaux(
        id,
        result.getInt("dheure"),
        result.getInt("fheure"),result.getInt("fmin"),result.getInt("dmin"),result.getInt("idmedcin"));         
  } catch (SQLException e) {
    e.printStackTrace();
  }
  return Crenaux;
}
}


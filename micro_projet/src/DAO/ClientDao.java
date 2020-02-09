package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import monpac.Client;
public class ClientDao  extends DAO<Client> {
public ClientDao (Connection conn) {
  super(conn);
}
public boolean create(Client obj) {
  return false;
}
public void add(Client element) {
	Connection c=DAO.micro_projet();
	Statement s;
	try {
		s = c.createStatement();
		String query= "INSERT INTO client VALUES('"+element.getFname()+"','"+element.getLname()+"')";
        s.executeUpdate(query);	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
public  Client find(int id) {
  Client  client = new Client();      
    
  try {
    ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Client WHERE id_c = " + id);
    if(result.first())
      client= new Client(
        id,
        result.getString("name"),
        result.getString("lname"));         
  } catch (SQLException e) {
    e.printStackTrace();
  }
  return client;
}
}
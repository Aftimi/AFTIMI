package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import monpac.Client;
import monpac.rv;
public class RvDao extends DAO<rv>{
	public RvDao (Connection conn) {
		  super(conn);
		}
	@Override
	public ArrayList<rv> getList() throws Exception {
		Connection c=DAO.micro_projet();
		ArrayList<rv> cat = new ArrayList<rv>();
		Statement s= c.createStatement();
		String query= "SELECT * FROM rv";
        ResultSet rs=s.executeQuery(query);	
        while (rs.next())
        {
          int idrv = rs.getInt("idrv");
          String jour = rs.getString("jour");
          int idc = rs.getInt("idc");
          int idcre = rs.getInt("idcre");

          cat.add(new rv(idrv,jour,idc,idcre));
        }
		return cat;
	}
	@Override
	public rv getRv(int id) throws Exception {
		Connection c=DAO.micro_projet();
		rv cat =null;
		Statement s= c.createStatement();
		String query= "SELECT * FROM rv WHERE idc="+id;
        ResultSet rs=s.executeQuery(query);	
        while (rs.next())
        {
          int idc = rs.getInt("idc");
          String jour = rs.getString("jour");
          int idcre = rs.getInt("idcre");
          cat=new rv(idc,jour,idcre,id);
        }
		return cat;
	}
	public void add(rv element) {
		Connection c=DAO.micro_projet();
		Statement s;
		try {
			s = c.createStatement();
			String query= "INSERT INTO rv VALUES('"+element.getJour()+"','"+element.getIdc()+"')";
	        s.executeUpdate(query);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	@Override
	public rv find(int id) {
		return null;
	}
}
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import monpac.Client;

//CTRL + SHIFT + O pour g�n�rer les imports
public class main { 
  public static void main(String[] args) {
	 
	  try {  
		  Connection con;

			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_db","root","isil");
		} catch (Exception e) {
			e.printStackTrace();
		}
    //Testons des �l�ves
	  //DAO<Client> clientDao = new ClientDao(SdzConnection.getInstance());
    // for(int i = 1; i < 5; i++){
	  //// Client client = ClientDao.find(i);
	  // System.out.println("El�ve N�" + client.getIdc() + "  - " + client.getLname() + " " + client.getFname());
	  // }
      
    System.out.println("\n********************************\n");
      
   
      
    System.out.println("\n********************************\n");
        
  }
}
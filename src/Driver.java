/* Creare una cartella lib, importare all'interno la libreria corrispondente al vostro sql
 * (se non l'avete scaricatelo da internet)semplicemente trascinandolo e incollarlo.
 *  Dopo andare in properties  del progetto ,Java Builds path,Libraries,clicca su 
 *  Modules path e dopo a destra Add Jars,andare nel nome del progetto,lib e aggiungere la
 *  libreria.
 * 
 * 
 * 
 * 
 */

import java.sql.*;



public class Driver {

	public static void main(String[] args) {
	
		
		try {
		
			Class.forName("org.postgresql.Driver");
			
			// Connessione al database
			 Connection con = DriverManager.getConnection ("jdbc:postgresql:postgres", "postgres", "diegoAmico");
			 
			 // Permette di costruire le query
			 Statement cmd = con.createStatement ();
			 
			 // Contiene il codice della query
			 String qry = "SELECT * FROM persone";
			 
			 
			 // Consente di avere il risutato della query
			 ResultSet res = cmd.executeQuery(qry);
			 
			 
			 
			 while (res.next()) {
				     System.out.println(res.getString("Cognome")+(" ")+(res.getString("Nome")));
				     
			 }
			 res.close();
			 cmd.close();
			 con.close();
			
		}catch (SQLException e) {
			         e.printStackTrace();
			   } catch (ClassNotFoundException e) {
			         e.printStackTrace();
		}
	}
}

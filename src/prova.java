import java.sql.*;
public class prova {

	public static void main(String[] args) {
		
		
		
		try { Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql:postgres","postgres","diegoAmico");
		
		Statement stmt = con.createStatement();
		
		String que="select*from persone";
		
		String queAuto="select*from auto";
		
		String createAuto ="CREATE TABLE auto(id bigserial not null,modello varchar(30) not null)";
		String inserisci = "insert into auto (modello) values('mercedes')";
		String aggiorna = "UPDATE auto SET modello ='porsche' where id=3";	
		
		stmt.executeUpdate(aggiorna);
		
		
		ResultSet setCar = stmt.executeQuery(queAuto);
		
		while(setCar.next()){
			
			System.out.println(setCar.getString("id")+" " +setCar.getString("modello"));		
		}
		
			
		}catch (SQLException e)
		{e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
				
}
}
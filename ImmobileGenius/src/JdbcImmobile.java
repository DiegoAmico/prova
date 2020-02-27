import java.sql.*;

public class JdbcImmobile {

	public String getString() {

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql:postgres", "postgres", "diegoAmico");

			Statement stmt = con.createStatement();

			//query per creare una tabella
			String create = "CREATE TABLE utenti" + "(id bigserial not null," + "Username varchar(30) not null,"
					+ "Password varchar(30) not null," + "Email varchar(30) not null," + "Ruolo varchar(30) not null)";
			
			//query per inserire dati dentro una tabella
			String insert = "insert into utenti (Username,Password,Email,Ruolo) values('Girolamo','jessica','mommo@hotmail.it','admin')";
			
			//query per aggiornare una tabella
			String upDate = "UPDATE utenti SET id ='2' where id=3";
			
			//query per vedere dentro una tabella
			String show = "select*from utenti";

			// stmt.executeUpdate(create);
			// stmt.executeUpdate(aggiorna);

			ResultSet Show = stmt.executeQuery(show);

			while (Show.next()) {

				System.out.println(Show.getString("Id") + 
						"  " + Show.getString("username") + 
						"  " + Show.getString("password") + 
						"  " + Show.getString("email") + 
						"  " + Show.getString("ruolo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		return null;

	}
}
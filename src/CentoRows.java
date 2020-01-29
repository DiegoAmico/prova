import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class CentoRows {

	public static void main(String[] args) throws IOException {
		
//array che contiene la riga letta da file
		String parti[];
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\cento.txt"));

		String lettura = reader.readLine();

		
		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql:postgres", "postgres", "diegoAmico");
			Statement stmt = con.createStatement();

			String queVedi = "select*from gruppo";

			String queCrea = "CREATE TABLE Gruppo(id BIGSERIAL,Nome VARCHAR(50) NOT NULL,"
					+ "Cognome VARCHAR(50) NOT NULL," + "EMAIL VARCHAR(50) NOT NULL," + "CF VARCHAR NOT NULL)";

			String cancella = "drop table gruppo ";
			
			
// ciclo per scrivere da file di testo in una tabella su db
			
			while (lettura != null) {
				parti = lettura.split(",");
				String insert = "INSERT INTO Gruppo(id,Nome,Cognome,EMAIL,CF) VALUES ('" + parti[0] + "','" + parti[1]
						+ "','" + parti[2] + "','" + parti[3] + "','" + parti[4] + "')";
				stmt.executeUpdate(insert);
				lettura = reader.readLine();
			}

			ResultSet res = stmt.executeQuery(queVedi);

			while (res.next()) {

				System.out.println(res.getString("cf"));
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

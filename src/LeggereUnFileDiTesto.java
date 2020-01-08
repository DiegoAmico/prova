import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeggereUnFileDiTesto {

	public static void main(String[] args) throws IOException   {

		String prova = "C:\\Users\\utente\\Desktop\\prova\\diegoTesto.txt";
		File testoPerGiro = new File(prova);
		testoPerGiro.createNewFile();

		FileWriter scrittore = new FileWriter(testoPerGiro);
		BufferedWriter scrittoreBuffer = new BufferedWriter(scrittore);

		scrittoreBuffer.write(" 1-Diego");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 2-Giro");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 3-U biunnu");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 4-Ludo");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 5-Cassia");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 6-Nova");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 7-Butcher");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 8-Antonio");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write(" 9-Raffaele");
		scrittoreBuffer.newLine();
		scrittoreBuffer.write("10-Rosa");

		scrittoreBuffer.close();

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\prova\\diegoTesto.txt"));

		String lettura = reader.readLine();
		while (lettura != null) {
			System.out.println(lettura);
			lettura = reader.readLine();
		}

	}
}
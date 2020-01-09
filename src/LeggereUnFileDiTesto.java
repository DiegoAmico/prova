import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LeggereUnFileDiTesto {

	public static void main(String[] args) throws IOException {

		String prova = "C:\\Users\\utente\\Desktop\\prova\\diegoTesto.txt";
		File testoPerGiro = new File(prova);
		testoPerGiro.createNewFile();

		FileWriter scrittore = new FileWriter(testoPerGiro);
		BufferedWriter scrittoreBuffer = new BufferedWriter(scrittore);

		String nomi[] = { " 1-Diego ", "2-Lulu ", "3-Giro", " 4-Luca", " 5-Jimmi", " 6-Fra", " 7-Tizio",
				" 8-Nonno", " 9-Nonna", "10-Zia" };

		for (String i : nomi) {
            scrittoreBuffer.newLine();
			scrittoreBuffer.write(i);}

		scrittoreBuffer.close();

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\prova\\diegoTesto.txt"));

		String lettura = reader.readLine();
		while (lettura != null) {
			System.out.println(lettura);
			lettura = reader.readLine();
		}

	}
}
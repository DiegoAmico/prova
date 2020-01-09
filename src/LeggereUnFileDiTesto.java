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

		String nomi[] = { " 1-Diego\n", " 2-Lulu\n", " 3-Giro\n", " 4-Luca\n", " 5-Jimmi\n", " 6-Fra\n", " 7-Tizio\n",
				" 8-Nonno\n", " 9-Nonna\n", "10-Zia\n" };

		for (String i : nomi)

			scrittoreBuffer.write(i);

		scrittoreBuffer.close();

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\prova\\diegoTesto.txt"));

		String lettura = reader.readLine();
		while (lettura != null) {
			System.out.println(lettura);
			lettura = reader.readLine();
		}

	}
}
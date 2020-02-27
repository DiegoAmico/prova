import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetturaDaFile {

	
	public static String[] Leggi() throws IOException {
		
		
	
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\Febbraio.txt"));

	String re = reader.readLine();
	
	
	
String parti[]=re.split(",");
		
				
	reader.close();
	
	
	
	return parti;
}
	

	
		
	
}








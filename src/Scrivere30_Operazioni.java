import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Scrivere30_Operazioni {

	public static void main(String[] args) throws IOException {
		
		
		String listaAzioni="C:\\Users\\utente\\Desktop\\prova\\30azioni.txt";
		
		File azioni= new File(listaAzioni); 
		azioni.createNewFile();
		FileWriter scr = new FileWriter(azioni);
		BufferedWriter scrBuffer= new BufferedWriter(scr);
		
		String lista[]= {" 1-Nike 60.5  120 B "," 2-Polo 55.4  200 B "," 3-Adidas 43.0  112 S"," 4-Ren 70.2  230 B",
				        " 5-Armani 55.5  56 S"," 6-Jo 70.2  234 B"," 7-Puma 34.3   98 S "," 8-Mal 70.0  560 B",
				" 9-Toky 78.0  245 B","10-Malbo 89.2  789 S","11-Luce 12.3  234 B","12-Oro 65.7  345 S","13-Spider 34.5  123 B",
				"14-Razen 45.3  276 S","15-OH 45  123 B","16-Eni 56  432 B","17-Enel 76  321 B","18-London 53.0  612 S",
				"19-Blu 53.2  999 B","20-Silver 87.7  321 B","21-Bronzo 65.5  232 S","22-Peace 72.8  563 S ",
				"23-Leshp 43.2 345 S","24-Asus 54.3 456 B","25-HP 56.4  654 B","26-Acer 65.4  432 S","27-Samsung 35.6 324",
				"28-TLC 34.6  534 S","29-Sony 23.4  432 B","30-Nintendo 43.2  456 B",	};
		
		for(String a:lista) {
			scrBuffer.newLine();
			scrBuffer.write(a);
		}
		
		scrBuffer.close();
		
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\prova\\30azioni.txt"));
          
		String lettura=read.readLine();
          
          while(lettura!=null) {
        	System.out.println(lettura); 
        	lettura=read.readLine();
        	  
          }
        	  
		
	}

}

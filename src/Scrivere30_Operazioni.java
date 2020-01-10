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
		
		String lista[]= {"Nike 60.5  120 B ","Polo 55.4  200 B ","Adidas 43.0  112 S","Ren 70.2  230 B",
				        "Armani 55.5  56 S","Jo 70.2  234 B","Puma 34.3   98 S ","Mal 70.0  560 B",
				"Toky 78.0  245 B","Malbo 89.2  789 S","Luce 12.3  234 B","Oro 65.7  345 S","Spider 34.5  123 B",
				"Razen 45.3  276 S","OH 45  123 B","Eni 56  432 B","Enel 76  321 B","London 53.0  612 S",
				"Blu 53.2  999 B","Silver 87.7  321 B","Bronzo 65.5  232 S","Peace 72.8  563 S ",
				"Leshp 43.2 345 S","Asus 54.3 456 B","HP 56.4  654 B","Acer 65.4  432 S","Samsung 35.6 324 B",
				"TLC 34.6  534 S","Sony 23.4  432 B","Nintendo 43.2  456 B",	};
		
		for(String a:lista) {
			
			scrBuffer.write(a);
			scrBuffer.newLine();
		}
		
		scrBuffer.close();
		
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\prova\\30azioni.txt"));
		String lettura=read.readLine(); 
		while(lettura!=null) {
		
		
		String parti[]=lettura.split(" ");
		
		double secondo=Double.parseDouble(parti[1]);
        double percentuale=secondo+((secondo*20)/100);  
		String converto=Double.toString(percentuale);
		parti[1]=converto;
		
		for(String i:parti) {
			System.out.print(i+" ");
					}
		System.out.println("\n");
        lettura=read.readLine();}
		
		
          
         
        	
        	 
        	
      		} 
          }
        	  
		
	


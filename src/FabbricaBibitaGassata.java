import java.util.Scanner;
public class FabbricaBibitaGassata {

	public static void main(String[] args) {
		
		// quantit� bibita pronta nella cisterna in ml
		int content=10;
		
		// percentuale di gas che evapora in 24 ore
		int evapPerday=3;
		
		// soglia percentuale di gas  oltre la quale la bibita non � pi� apprezzabile
		int threshold=70;
		
		// giorni entro i quali la bibita pu� essere venduta 
				
		int giorni=threshold/evapPerday;
		
		System.out.println("La bibita deve essere consumata entro "+giorni+" giorni");
		
		
		
		
		
	}

}

package eredietarietà;

import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {
		// Lista prodotti nel Data Base
		Alimentari carne = new Alimentari(1, "Laziale", 20, 17, 1, 2020);
		NonAlimentari tastiere = new NonAlimentari(2, " Meccaniche", 40, "plastica");
		NonAlimentari finestre = new NonAlimentari(3, "Murano", 130, "vetro");
		NonAlimentari quaderni = new NonAlimentari(4, "A quadri", 1, "plastica");

		Scanner input = new Scanner(System.in);
		// Array che contiene la posizione di ogni prodotto

		Prodotti prodotti[] = new Prodotti[100];
		prodotti[0] = carne;
		prodotti[1] = tastiere;
		prodotti[2] = quaderni;
		prodotti[3] = quaderni;

		// costo totale della spesa
		double somma = 0;
		int codice = 0;
		int quantità = 0;

		String cartaFedeltà = "";

		System.out.println("Hai la carta fedeltà?");
		cartaFedeltà = input.next();

		// Ciclo che calcola il costo della spesa se il cliente ha o no la tessera
		do {

			System.out.println("Inserire codice prodotto,o inserire 0 se ha finito la spesa");
			codice = input.nextInt();
			if (codice != 0) {
				System.out.println("Quantità?");
				quantità = input.nextInt();

				if (cartaFedeltà.endsWith("si")) {
					somma += quantità * prodotti[codice - 1].applicaSconto();
				} else {
					somma += quantità * prodotti[codice - 1].getPrezzo();
				}
			} else {

			}

		} while (codice != 0);
		input.close();

		System.out.println("Totale spesa= " + somma);

	}
}

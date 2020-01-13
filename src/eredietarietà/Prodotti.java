package eredietarietà;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class Prodotti {

	int codice;
	
	//Stringa che contiene il tipo di materiale usato nel prodotto
	String materiali = "";
	//Stringa che contiene la descrizione del prodotto
	String descrizione;
    //Prezzo del prodotto
	double prezzoUnitario;

	// Scadenza dei prodotti alimentari
	GregorianCalendar scadenza;

	GregorianCalendar dataOggi = new GregorianCalendar();
	

	public Prodotti(int newCodice, String newDescrizione, double newPrezzo) {

		codice = newCodice;
		descrizione = newDescrizione;
		prezzoUnitario = newPrezzo;

	}

// Metodo che ci mostra il codice a barra
	public int getCodice() {

		return codice;
	}

// Metodo che ci mostra la descrizione del cosice
	public String getDescrizione() {

		return descrizione;
	}

// Metodo che ci mostra il prezzo unitario
	public double getPrezzo() {

		return prezzoUnitario;

	}

	// Metodo che ci mostra il prezzo scontato del 5%
	public double applicaSconto() {

		double scontato = prezzoUnitario - ((prezzoUnitario * 5) / 100);

		return scontato;

	}

}

class Alimentari extends Prodotti {

	public Alimentari(int newCodice, String newDescrizione, double newPrezzo, int giorni, int mese, int anno) {

		super(newCodice, newDescrizione, newPrezzo);

		scadenza = new GregorianCalendar(anno, mese - 1, giorni);

	}
// metodo che calcola la differenza tra la data di acquisto e quella di scadenza
	public int getDifference() {
		int diffe = 0;
		long cm = scadenza.getTimeInMillis();
		long dm = dataOggi.getTimeInMillis();
		long diffm = cm - dm;
		diffe = (int) (diffm / (24 * 60 * 60 * 1000));

		return diffe;
	}
// metodo che calcola e applica lo sconto se il prodotto  si avvicina alla data di scadenza 
	public double applicaSconto() {
		double scontato20 = prezzoUnitario;
		if (getDifference() <= 10) {

			scontato20 = prezzoUnitario - ((prezzoUnitario * 20) / 100);
		}

		return scontato20;

	}

}

class NonAlimentari extends Prodotti {

	public NonAlimentari(int newCodice, String newDescrizione, double newPrezzo, String newMateriale) {

		super(newCodice, newDescrizione, newPrezzo);

		materiali = newMateriale;
	}
// metodo che applica lo sconto in base al materiale del prodotto
	public double applicaSconto() {
		double scontato20 = prezzoUnitario;
		if (materiali.contentEquals("vetro") || materiali.contentEquals("carta")
				|| materiali.contentEquals("plastica")) {
			scontato20 = prezzoUnitario - ((prezzoUnitario * 20) / 100);
		}

		return scontato20;
	}

}

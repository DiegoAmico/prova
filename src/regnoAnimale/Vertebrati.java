package regnoAnimale;

public interface Vertebrati {

}

class Pesci implements Vertebrati {

	String pesciSenzaMandibola;
	String pesciOssei;
	String pesciCartilaginei;
}

class Rettili implements Vertebrati {

	public void Cheloni() {

		String tartarughe;
		String testuggini;

	}

	public void Loricati() {
		String coccodrilli;
		String alligatori;
		String caimani;
		String gaviali;
	}

	public void Rincocefali() {
		String tuatara;
	}

	public void Squamati() {
		String lucertole;
		String iguane;
		String varani;
		String anfisbene;
		String gechi;
		String serpenti;
	}
}

class Mammiferi implements Vertebrati {

	public void Prototheria() {
		String zaglosso;

		String echidnaSirDavid;

		String echidnaOrientale;

		String istrice;

		String ornitorinco;

	}

	public void Theria() {

		String elefante;
		String leone;
		String pecora;
		String cane;

	}

}

class Uccelli implements Vertebrati {

	public void UccelliAcquatici() {

	}

	public void UccelliMarini() {
		String cigni;
		String oche;
		String anatre;
	}

	public void UccelliRapaci() {
		String aquila;
		String falco;
		String poiana;

	}

	public void UccelliMigratori() {

		String gru;
		String cicogne;
		String gabbiani;
	}

	public void UccelliCanori() {

		String usignolo;
		String verdone;
		String fanello;
	}
}

class Anfibi implements Vertebrati {

	public void Anura() {

		String rane;
		String rospi;
		String raganelle;
	}

	public void Caudata() {
		String salamandre;
		String tritoni;

	}

	public void Gymnophiona() {
		String ceciliaMessicana;
		String ceciliaAnulata;
	}
}
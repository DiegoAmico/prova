
public class MetodoCalcolatrice {

	String display = "";

	String tot = "";

	boolean sum = false;
	boolean sottr = false;
	boolean div = false;
	boolean molti = false;

	public String addDisplay(String nuovo) {

		this.display = this.display + nuovo;

		return display;
	}

	public void Somma(String para) {
		tot = para;

		sum = true;
		display = "";
	}

	public void Sottrazione(String para) {
		tot = para;

		sottr = true;
		display = "";
	}

	public void Divisione(String para) {
		tot = para;

		div = true;
		display = "";
	}

	public void Moltiplicazione(String para) {
		tot = para;

		molti = true;
		display = "";
	}

	public String Risultato(String num) {
		if (sum == true) {

			tot = String.valueOf((Double.parseDouble(tot)) + Double.parseDouble(num));
			sum = false;
			display = "";
		}
		if (sottr == true) {

			tot = String.valueOf((Double.parseDouble(tot)) - Double.parseDouble(num));
			sottr = false;
			display = "";
		}
		if (div == true) {

			tot = String.valueOf((Double.parseDouble(tot)) / Double.parseDouble(num));
			div = false;
			display = "";
		}
		if (molti == true) {

			tot = String.valueOf((Double.parseDouble(tot)) * Double.parseDouble(num));
			molti = false;
			display = "";
		}
		return tot;
	}

}

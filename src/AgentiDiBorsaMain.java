import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class AgentiDiBorsaMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String elenco[] = new String[5];
		String erroriString[] = new String[5];

		int OP = 0;
		boolean doubl = false;
		String parti[];
		double totB = 0;
		double totS = 0;
		String file = "";
		int errori = 0;
		double importo = 0;
		int quantità = 0;
		String rigaSbagliata = "riga sbagliata ";
		for (int i = 0; i < elenco.length; i++) {

			System.out.println("inserire file");

			file = input.nextLine();

			elenco[i] = file;
		}

		for (int i = 0; i < elenco.length; i++) {

			parti = elenco[i].split(" ");
			if (parti.length == 4) {

				try {
					double check = Double.parseDouble(parti[1]);
					doubl = true;
				} catch (Exception e) {
					doubl = false;
				}
				if (doubl == true) {

					importo = Double.parseDouble(parti[1]);
				} else {
					erroriString[i] = rigaSbagliata;

					errori++;

				}

				if (parti[2].matches("\\d+")) {
					quantità = Integer.parseInt(parti[2]);
				} else {
					erroriString[i] = rigaSbagliata;

					errori++;

				}

				if (parti[3].contentEquals("B")) {
					totB += (importo * quantità);
					OP++;
				}

				else if (parti[3].contentEquals("S")) {
					totS += (importo * quantità);
					OP++;
				} else {
					erroriString[i] = rigaSbagliata;

					errori++;
				}

			} else {
				erroriString[i] = rigaSbagliata;

				errori++;
			}

		}
		input.close();
		System.out.println("Op:(" + OP + ")" + "Buy:(" + totB + ")" + "Sell:(" + totS + ")");

		if (errori > 0) {
			System.out.println("Err:(" + errori + ")");

		}

		for (int k = 0; k < erroriString.length; k++) {

			if (erroriString[k] == rigaSbagliata) {

				System.out.println(rigaSbagliata + (k + 1));
			}
		}
	}
}

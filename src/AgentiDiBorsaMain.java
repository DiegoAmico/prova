import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class AgentiDiBorsaMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String elenco[] = new String[5];
		int OP = 0;
		String parti[];
		double totB = 0;
		double totS = 0;
		String file = "";
		int errori = 0;
		double importo = 0;
		for (int i = 0; i < elenco.length; i++) {

			System.out.println("inserire file");

			file = input.nextLine();

			elenco[i] = file;
			OP++;
		

		parti = file.split(" ");

		importo = Double.parseDouble(parti[1]);

		int quantità = Integer.parseInt(parti[2]);

		if (parti[3].contentEquals("B")) {
			totB += (importo * quantità);}
		if  (parti[3].contentEquals("S")) {
			totS += (importo * quantità);
			}
		}

		System.out.println("Op:(" + OP + ")" + "Buy:(" + totB + ")" + "Sell:(" + totS + ")");
	}

}

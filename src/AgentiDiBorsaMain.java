import java.util.ArrayList;
import java.util.Scanner;

public class AgentiDiBorsaMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList agenti = new ArrayList();
		ArrayList momentaneo = new ArrayList();
		String nomeAgente = "";
		String nomeAzione = "";
		double importoA = 0.0;
		int quant = 0;
		String operation = "a";
		int comprate = 0;
		int vendute = 0;
		int operazioni = 0;
		String cosaFare = "";
		int posizione = 0;

		do {
			System.out.println("Totale operazioni lette = " + operazioni);
			System.out.println("Volte comprate = " + comprate);
			System.out.println("Volte vendute= " + vendute);
			System.out.println("inserire o controllare?");

			cosaFare = input.next();

			if (cosaFare.equals("inserire")) {

				operazioni++;

				System.out.println("Nome Agente ?");
				nomeAgente = input.next();
				momentaneo.add(nomeAgente);
				System.out.println("Nome Azione ?");
				nomeAzione = input.next();
				momentaneo.add(nomeAzione);
				System.out.println("Costo azione ?");
				importoA = input.nextDouble();

				momentaneo.add(importoA);

				System.out.println("Quantità? ");

				quant = input.nextInt();

				momentaneo.add(quant);

				System.out.println("Comprato(B) o Venduto(S)?");

				operation = input.next();

				if (operation.equals("B"))

					comprate++;

				if (operation.equals("S"))

					vendute++;

				momentaneo.add(operation);

				System.out.println("Inserito" + momentaneo);
				String a = momentaneo.toString();
				agenti.add(a);
				momentaneo.clear();
			}

			if (cosaFare.equals("controllare")) {

				System.out.println("Quale posizione?");
				posizione = input.nextInt();
				System.out.println(agenti.get(posizione));
			}

			if (cosaFare.equals("esc")) {

				System.out.println("Arrivederci");
				break;
			}
		}

		while (cosaFare != "");

		input.close();

		;

	}

}

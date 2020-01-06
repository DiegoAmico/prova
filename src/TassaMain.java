import java.util.Scanner;

public class TassaMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int importo = 0;

		System.out.println("inserisca un importo");

		importo = input.nextInt();

		while (importo > 0) {

			TassaTest a = new TassaTest(importo);
			input.close();
			System.out.println("La tassa è di " + a.getTassa() + " euro");
			break;
		}
		if (importo <= 0)
			System.out.println("importo non valido");

	}

}

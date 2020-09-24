package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF6 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int codigo;

		System.out.println("Informe o produto desejado: ");
		System.out.println("001 - arroz");
		System.out.println("002 - feijao");
		System.out.println("003 - farinha");
		codigo = ler.nextInt();

		System.out.println("_____________________________");

		if (codigo == 001) {
			System.out.println("Voce escolheu arroz");
		} else if (codigo == 002) {
			System.out.println("Voce escolheu feijão");
		} else if (codigo == 003) {
			System.out.println("Voce escolheu farinha");
		} else {
			System.out.println("Diversos");
		}

		ler.close();

	}
}

package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, valor3, valor4;
		
		System.out.println("Digite o primeiro valor");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = ler.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3 = ler.nextInt();
		System.out.println("Digite o quarto valor");
		valor4 = ler.nextInt();
		
		if(valor1 < valor2 && valor1 < valor3 && valor1 < valor4) {
			System.out.println("Menor valor é: " + valor1);
		} else if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4) {
			System.out.println("Menor valor é: " + valor2);
		} else if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
			System.out.println("Menor valor é: " + valor3);
		} else if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3) {
			System.out.println("Menor valor é: " + valor4);
		} else {
			System.out.println("São iguais");
		}
		
		ler.close();
		
	}
}

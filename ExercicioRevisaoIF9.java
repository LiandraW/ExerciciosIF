package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF9 {
	public static void main(String[] args) {

		// 7. . As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
		// e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
		// número de maçãs compradas, calcule e escreva o valor total da compra.
		 Scanner ler = new Scanner(System.in);
		int maças;
		int quantidade;
		
		System.out.println("Bem vindo a feira, estamos com uma promoção de maçãs,"
				+ " as maçãs custam R$0,30 centavos, mas se você comprar mais de uma duzia elas custaram R$0,25 centavos"
				+ "Quantas maçãs você deseja comprar?");
			quantidade = ler.nextInt();
			
			if(quantidade >= 12) {
				System.out.println("Custou: " + (quantidade * 0.25) + " reais, pois você comprou mais de uma duzia");
			} else {
				System.out.println("Custou: " + (quantidade * 0.30) + " reais, pois voce comprou menos de uma duzia");
			}
			
			ler.close();	
	}
}

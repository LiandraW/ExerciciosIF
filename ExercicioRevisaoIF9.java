package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF9 {
	public static void main(String[] args) {

		// 7. . As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia,
		// e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
		// n�mero de ma��s compradas, calcule e escreva o valor total da compra.
		 Scanner ler = new Scanner(System.in);
		int ma�as;
		int quantidade;
		
		System.out.println("Bem vindo a feira, estamos com uma promo��o de ma��s,"
				+ " as ma��s custam R$0,30 centavos, mas se voc� comprar mais de uma duzia elas custaram R$0,25 centavos"
				+ "Quantas ma��s voc� deseja comprar?");
			quantidade = ler.nextInt();
			
			if(quantidade >= 12) {
				System.out.println("Custou: " + (quantidade * 0.25) + " reais, pois voc� comprou mais de uma duzia");
			} else {
				System.out.println("Custou: " + (quantidade * 0.30) + " reais, pois voce comprou menos de uma duzia");
			}
			
			ler.close();	
	}
}

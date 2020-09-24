package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioIF7 {
	public static void main(String[] args) {
		// 5. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever
		// uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
		// considerar o mês em que ela nasceu).

		Scanner ler = new Scanner(System.in);
		
		int anoAtual, anoNascimento, idade;
		
		System.out.println("Informe seu ano de nascimento");
		anoNascimento = ler.nextInt();
		
		System.out.println("Informe o ano atual");
		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("Voce tem " + idade + " anos");
		
		if (idade >= 18) {
			System.out.println("Voce ja pode votar");
		} else {
			System.out.println("Voce nao pode votar");
		}
		
		ler.close();
	}
}

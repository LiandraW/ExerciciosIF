package LiandraJavaAngular;

import java.util.Scanner;

public class ExervcicioRevisaoIF8 {
	public static void main(String[] args) {

		// 6. Escreva um programa que verifique a validade de uma senha fornecida pelo
		// usu�rio. A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes
		// mensagens: ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a
		// senha seja inv�lida.
		
		Scanner ler = new Scanner(System.in);
		
		int senha;
		String usuario;
		
		System.out.println("Digite seu numero de usuario");
		usuario = ler.next();
		
		System.out.println("Digite sua senha");
		senha =  ler.nextInt();
		
		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
		System.out.println("ACESSO NEGADO");
		}
		
		ler.close();
	}
}

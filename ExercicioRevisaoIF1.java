package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF1 {
	public static void main(String[] args) {
								
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um valor para que possamos verificar se é negativo ou positivo:");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero informado foi: " + numero + " e ele é positivo");
		} else if (numero == 0) {
			System.out.println("O numero informado foi: " + numero + " e ele é zero");
		} else {
			System.out.println("O numero informado foi: " + numero + " e ele é negativo");
		}
		
		ler.close();
	}
}

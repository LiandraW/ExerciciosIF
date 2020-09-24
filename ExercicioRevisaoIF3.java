package LiandraJavaAngular;
import java.util.Scanner;

public class ExercicioRevisaoIF3 {
	public static void main(String[] args) {
		
		
		// faça um programa que receba dois valores e retorne o maior entre eles
		
		Scanner ler = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextInt();
		System.out.println("Informe o segundo valor");
		valor2 = ler.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O maior valor é: " + valor1);
		} else if (valor1 == valor2) {
			System.out.println("Os valores são iguais");
		} else {
			System.out.println("O maior valor é: " + valor2);
		}
		
		ler.close();
	}
}

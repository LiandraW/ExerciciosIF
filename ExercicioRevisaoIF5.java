package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = ler.nextInt();
		
		if((valor %2) == 0) {
			System.out.println("O valor " + valor + " é par");
		} else {
			System.out.println("O valor " + valor + " é impar");
		}
		
		ler.close();
		
	}
}

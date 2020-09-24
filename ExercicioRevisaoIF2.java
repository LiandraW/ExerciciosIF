package LiandraJavaAngular;
import java.util.Scanner;


public class ExercicioRevisaoIF2 {
	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("INforme o lado 1");
		lado1 = entradaDados.nextInt();
		System.out.println("INforme o lado 2");
		lado2 = entradaDados.nextInt();
		System.out.println("INforme o lado 3");
		lado3 = entradaDados.nextInt();
		
		if((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2
				|| (lado2 + lado3) <= lado1) {
			System.out.println("INválido");
		} else {
			if((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("Equilátero");
			} else if((lado1 == lado2) || (lado2 == lado3) 
					|| (lado1 == lado3)) {
				System.out.println("Isósceles");
			} else {
				System.out.println("Escaleno");
			}
		}
		
		entradaDados.close();
	}
}

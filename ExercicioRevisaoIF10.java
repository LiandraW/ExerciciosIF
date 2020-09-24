package LiandraJavaAngular;

import java.util.Scanner;

public class ExercicioRevisaoIF10 {
	public static void main(String[] args) {
		// 8. Escreva um programa para ler 3 valores inteiros (considere que não serão
		// lidos valores iguais) e escrevê-los em ordem crescente.
		
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, valor3;
				
		System.out.println("Digite o primeiro valor");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = ler.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3 = ler.nextInt();
		
		if(valor1 == valor2 || valor1 == valor2 || valor2 == valor3) {
			System.out.println("valores iguais nao podem ser lidos");
		}else {
			System.out.println("valores nao iguais podem ser lidos");	
			if((valor1 < valor2) && (valor1 < valor3)) {
				
				if (valor2 < valor3) {
					System.out.println("a ordem é " + valor1 + "," + valor2 + "," + valor3);
				}
				else {
					System.out.println("a ordem é " + valor1 + "," + valor3 + "," + valor2);
				}
			} else if (valor2 < valor3) {
				if(valor1 < valor3)
					System.out.println(" a ordem é " + valor2 + "," + valor1 + "," + valor3);
			} else {
				System.out.println("a ordem é: " + valor2 + "," + valor3 + "," + valor1);
			}
		}
		
		ler.close();
			
	}
} 


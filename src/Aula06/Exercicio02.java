package Aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numeroLido = 0;

		System.out.println("Digite um n�mero:");
		numeroLido = teclado.nextDouble();
		
		if (numeroLido > 0) {
			System.out.println("O n�mero � positivo.");
		} else {
			System.out.println("N�mero negativo.");
		}
		
		
		teclado.close();
	}

}

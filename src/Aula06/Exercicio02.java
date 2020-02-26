package Aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numeroLido = 0;

		System.out.println("Digite um número:");
		numeroLido = teclado.nextDouble();
		
		if (numeroLido > 0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("Número negativo.");
		}
		
		
		teclado.close();
	}

}

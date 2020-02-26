package Aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numberOne = 0;
		int numberTwo = 0;
		
		System.out.println("Digite um número:");
		numberOne = teclado.nextInt();
		System.out.println("Digite um número:");
		numberTwo = teclado.nextInt();
		
		if (numberOne > numberTwo) {
			System.out.println("O maior número é: " + numberOne);
		} else {
			System.out.println("O maior número é: " + numberTwo);
		}
		
		teclado.close();
	}

}

package Funçoes;

import java.util.Scanner;

public class Exercicio02 {

	public static double transformaSegundos(int horas, int minutos, int segundos) {

		return (horas * 3600) + (minutos * 60) + segundos;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;

		System.out.println("Digite as horas, minutos e os segundos:");
		horas = teclado.nextInt();
		minutos = teclado.nextInt();
		segundos = teclado.nextInt();

		System.out.println("Esse horario equivale a " + transformaSegundos(horas, minutos, segundos) + " segundos.");
		teclado.close();
	}
}

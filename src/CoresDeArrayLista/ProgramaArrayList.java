package CoresDeArrayLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Escreva um programa em Java que crie um ArrayList adicione algumas cores (string) e as
//imprima na tela.

public class ProgramaArrayList {

	public static void main(String[] args) {

		List<String> cores = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		String cor = "";
		while (!cor.equals("preto")) {
			System.out.println("Digite uma cor:");
			cor = teclado.nextLine();
			cores.add(cor);
		}

		for (String corDigitada : cores) {
			System.out.println(corDigitada);
		}
		
		teclado.close();
	}

}

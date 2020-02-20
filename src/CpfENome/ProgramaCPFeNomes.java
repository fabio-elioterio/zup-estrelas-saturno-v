package CpfENome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaCPFeNomes {

	public static void main(String[] args) {

		Map<String, String> cpfENomes = new HashMap<String, String>();
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		String cpf = "";
		String cpfARemover = "";

		for (int i = 0; i < 3; i++) {

			System.out.println("Digte um nome:");
			nome = teclado.nextLine();
			System.out.println("Digite uma cpf:");
			cpf = teclado.nextLine();

			cpfENomes.put(cpf, nome);
		}

		System.out.println("Os Nomes são:\n");
		for (String nomeCPF : cpfENomes.values()) {
			System.out.println(nomeCPF);
		}

		System.out.println("\nDigite um CPF para ser removido:");
		cpfARemover = teclado.nextLine();

		cpfENomes.remove(cpfARemover);

		System.out.println("\nOs nomes restantes são:");
		for (String nomeCPF : cpfENomes.values()) {
			System.out.println(nomeCPF);
		}

		teclado.close();
	}

}

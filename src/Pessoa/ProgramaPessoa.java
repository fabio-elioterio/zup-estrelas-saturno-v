package Pessoa;

public class ProgramaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Fabio", 19, 1.77);
	
		System.out.println(pessoa.getAltura());
		
		System.out.println("\nSua idade é:");
		System.out.println(pessoa.idade);
	}
}

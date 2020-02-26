package Poo;

public class ProgramaElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(10, 6);
		
		System.out.println(elevador.andarAtual);
		elevador.sobe();
		elevador.sobe();
		System.out.println(elevador.andarAtual);
		
		elevador.entra();
		System.out.println(elevador.qtdPessoas);

	}

}

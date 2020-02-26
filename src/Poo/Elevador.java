package Poo;

public class Elevador {
	// 3. Crie uma classe denominada Elevador para armazenar as informa��es de um
	// elevador dentro de
	// um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de
	// andares no pr�dio
	// (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o
	// presentes nele. A
	// classe deve tamb�m disponibilizar os seguintes m�todos:
	// Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda
	// houver
	// espa�o);
	// Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
	// dentro
	// dele);
	// Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
	// Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);

	int andarAtual;
	int totalAndares;
	int capacidade;
	int qtdPessoas;

	public Elevador(int qtdAndares, int capacidade) {
		this.andarAtual = 0;
		this.totalAndares = qtdAndares;
		this.capacidade = capacidade;
		this.qtdPessoas = 0;
	}

	public boolean entra() {
		if (qtdPessoas + 1 < capacidade) {
			qtdPessoas++;
			return true;
		}

		return false;
	}

	public boolean sai() {
		if (qtdPessoas > 0) {
			qtdPessoas--;
			return true;
		}

		return false;
	}

	public boolean sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			return true;
		}

		return false;
	}

	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}

		return false;
	}

}

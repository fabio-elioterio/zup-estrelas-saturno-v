package Poo;

public class Elevador {
	// 3. Crie uma classe denominada Elevador para armazenar as informações de um
	// elevador dentro de
	// um prédio. A classe deve armazenar o andar atual (térreo = 0), total de
	// andares no prédio
	// (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
	// presentes nele. A
	// classe deve também disponibilizar os seguintes métodos:
	// Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
	// houver
	// espaço);
	// Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
	// dentro
	// dele);
	// Sobe : para subir um andar (não deve subir se já estiver no último andar);
	// Desce : para descer um andar (não deve descer se já estiver no térreo);

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

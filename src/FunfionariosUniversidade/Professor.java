package FunfionariosUniversidade;

public class Professor extends Funcionario {
	
	private String nivelGraduacao;
	private String disciplinaMinistrada;
	private int qtdAlunos;
	private int qtdTurmas;
	
	
	public String getNivelGraduacao() {
		return nivelGraduacao;
	}
	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}
	public String getDisciplinaMinistrada() {
		return disciplinaMinistrada;
	}
	public void setDisciplinaMinistrada(String disciplinaMinistrada) {
		this.disciplinaMinistrada = disciplinaMinistrada;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public int getQtdTurmas() {
		return qtdTurmas;
	}
	public void setQtdTurmas(int qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
	}

}

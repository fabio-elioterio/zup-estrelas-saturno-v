package FunfionariosUniversidade;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double numeroRegistro;
	private String orgaoDeLotacao;   
	private double salario;
	
	public void aumentaSalario() {
		this.salario += (salario * 0.10);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(double numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getOrgaoDeLotacao() {
		return orgaoDeLotacao;
	}
	public void setOrgaoDeLotacao(String orgaoDeLotacao) {
		this.orgaoDeLotacao = orgaoDeLotacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}

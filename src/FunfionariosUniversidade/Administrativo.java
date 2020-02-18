package FunfionariosUniversidade;

public class Administrativo extends Funcionario {
	private String funcaoAdministrativa;
	public String getFuncaoAdministrativa() {
		return funcaoAdministrativa;
	}
	public void setFuncaoAdministrativa(String funcaoAdministrativa) {
		this.funcaoAdministrativa = funcaoAdministrativa;
	}
	public String getSenioridade() {
		return senioridade;
	}
	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	private String senioridade;

}

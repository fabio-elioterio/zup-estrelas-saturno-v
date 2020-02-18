package FunfionariosUniversidade;

public class Cordenador extends Funcionario {
		
	private Professor[] professoresSupervisionados;
	Professor professor[] = new Professor[10];
	
	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}

}

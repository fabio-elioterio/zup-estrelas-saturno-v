package NovaPessoa;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calculaSalario() {
		return super.setSalarioBase(getSalarioBase() - ajudaDeCusto);
		
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}

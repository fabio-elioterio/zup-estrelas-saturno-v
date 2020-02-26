package NovaPessoa;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = (imposto / 100);
	}
	
	public double calculaSalario() {
		return this.salarioBase - (salarioBase * imposto);
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double setSalarioBase(double salarioBase) {
		return this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
}

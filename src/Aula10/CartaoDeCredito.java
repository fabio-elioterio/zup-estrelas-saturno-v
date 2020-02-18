package Aula10;

public class CartaoDeCredito {

	private double limite;
	private double saldoDaFatura;
	private String nomeCliente;

	public CartaoDeCredito(double limite, double saldoDaFatura, String nomeCliente) {
		this.limite = limite;
		this.saldoDaFatura = saldoDaFatura;
		this.nomeCliente = nomeCliente;
	}

	public void aumentaLimite(double valorASerAumentado) {

		this.limite += valorASerAumentado;

	}

	public void diminuiLimite(double valorASerDiminuido) {

		this.limite -= valorASerDiminuido;

	}

	public void realizaCompra(double valorDaCompra) {

		if (valorDaCompra < this.limite) {
			System.out.println("\nCompra Realizada com sucesso!");
			this.limite -= valorDaCompra;
			this.saldoDaFatura += valorDaCompra;
		} else {
			System.out.println("\nLimite excedido. Por favor aumentar o limite.");
		}

	}

	public void imprimeFatura() {
		System.out.printf("\nA sua fatura é de %.2f", this.saldoDaFatura);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldoDaFatura() {
		return saldoDaFatura;
	}

	public void setSaldoDaFatura(double saldoDaFatura) {
		this.saldoDaFatura = saldoDaFatura;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}

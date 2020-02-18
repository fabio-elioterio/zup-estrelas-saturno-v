package Aula10;

public class ProgramaCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito cartao = new CartaoDeCredito(500, 0, "Fabio Junior");

		cartao.getNomeCliente();
		System.out.println(cartao.getNomeCliente());

		cartao.realizaCompra(120);
		System.out.println(cartao.getSaldoDaFatura());
		cartao.realizaCompra(200);
		System.out.println("O limite do cartão é R$" + cartao.getLimite());

		cartao.realizaCompra(500);
		cartao.imprimeFatura();

		cartao.realizaCompra(100);
		cartao.imprimeFatura();

		cartao.aumentaLimite(500);
		System.out.println(cartao.getLimite());

	}

}

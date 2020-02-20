package br.com.zup.estrelas.saturnov.calculo.figura.geometrica;

public class Retangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double claculoArea() {

		return this.base * this.altura;
	}

}

package br.com.zup.estrelas.saturnov.calculo.figura.geometrica;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double claculoArea() {
		return (this.base * this.altura) / 2;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

}

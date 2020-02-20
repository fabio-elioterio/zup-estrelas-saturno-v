package br.com.zup.estrelas.saturnov.calculo.figura.geometrica;

public class Circulo extends FiguraGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double claculoArea() {
		return Math.pow(raio, 2) * Math.PI;
	}

}

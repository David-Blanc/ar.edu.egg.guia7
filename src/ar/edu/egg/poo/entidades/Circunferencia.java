package ar.edu.egg.poo.entidades;

public class Circunferencia {
	private double radio;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public Circunferencia() {
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public double area() {
		return Math.pow(radio, 2) * Math.PI;
	}

	public double perimetro() {
		return 2 * Math.PI * radio;
	}
}

package ar.edu.egg.poo;

import java.util.Scanner;

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

	public void crearCircunferencia() {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("Ingrese el radio: ");
			this.radio = leer.nextInt();
		}
	}

	public double area() {
		return Math.pow(radio, 2) * Math.PI;
	}

	public double perimetro() {
		return 2 * Math.PI * radio;
	}
}

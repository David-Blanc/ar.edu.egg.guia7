package ar.edu.egg.poo.entidades;

public class Rectangulo2 {
	private int lado1;
	private int lado2;
	
	public Rectangulo2(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int calcular_area() {
		return lado1*lado2;
	}
}

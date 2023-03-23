package ar.edu.egg.poo;

import java.util.Scanner;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo() {
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public void crearRectangulo() {
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("Base: ");
			base = leer.nextInt();
			System.out.print("Altura: ");
			altura = leer.nextInt();
		}
	}

	public int superficie() {
		return base * altura;
	}

	public int perimetro() {
		return 2 * (base + altura);
	}

	public void dibujo() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

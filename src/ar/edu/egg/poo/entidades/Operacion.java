package ar.edu.egg.poo.entidades;

public class Operacion {
	private int numero1;
	private int numero2;

	public Operacion(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Operacion() {
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public int sumar() {
		return numero1 + numero2;
	}

	public int restar() {
		return numero1 - numero2;
	}

	public int multiplicar() {
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("uno de los número es 0... la multiplicación tmb será 0");
			return 0;
		}
		return numero1 * numero2;
	}

	public double dividir() {
		if (numero2 != 0) {
			return numero1 / numero2;
		}
		System.out.println("el denominador es 0, la operacion no se puede realizar");
		return 0;
	}
}

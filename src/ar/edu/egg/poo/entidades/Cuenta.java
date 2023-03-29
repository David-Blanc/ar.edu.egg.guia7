package ar.edu.egg.poo.entidades;

public class Cuenta {
	private String titular;
	private int saldo;

	public Cuenta(int saldo, String titular) {
		if (saldo >= 0) {
			this.saldo = saldo;
			this.titular = titular;
		} else {
			throw new IllegalArgumentException("No es posible crear una cuenta con saldo negativo.");
		}
	}

	public void retirar_dinero(int retiro) {
		if (retiro <= saldo) {
			saldo -= retiro;
			System.out.println("Retiro exitoso, su saldo es : $" + saldo);
		} else {
			System.out.println("No contiene fondos suficientes.");
		}
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

}

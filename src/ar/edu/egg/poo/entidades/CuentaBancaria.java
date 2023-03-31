package ar.edu.egg.poo.entidades;

public class CuentaBancaria {
	private int numeroCuenta;
	private long dniCliente;
	private double saldoActual;

	public CuentaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.dniCliente = dniCliente;
		this.saldoActual = saldoActual;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual="
				+ saldoActual + "]";
	}

}

package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.CuentaBancaria;

public class CuentaBancariaServicio {

	public CuentaBancaria crearCuenta(int numeroCuenta, long dniCliente, double saldoActual) {
		return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
	}

	public void ingresarDinero(CuentaBancaria cuenta, double ingreso) {
		cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
	}

	public double retirarDinero(CuentaBancaria cuenta, double retiro) {
		if (cuenta.getSaldoActual() >= retiro) {
			cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
			return retiro;
		}
		double retirado = cuenta.getSaldoActual();
		cuenta.setSaldoActual(0);
		return retirado;
	}

	public double extraccionRapida(CuentaBancaria cuenta, double retiro) {
		if (retiro <= cuenta.getSaldoActual() * 0.2) {
			cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
			return retiro;
		}
		double retirado = cuenta.getSaldoActual() * 0.2;
		cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
		return retirado;
	}

	public double consultarSaldo(CuentaBancaria cuenta) {
		return cuenta.getSaldoActual();

	}
	
	public void consultarDatos(CuentaBancaria cuenta) {
		System.out.println(cuenta);
	}
}

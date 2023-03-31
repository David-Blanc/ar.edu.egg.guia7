package ar.edu.egg.poo.entidades;

public class Cafetera {
	private int capacidadMáxima;
	private double cantidadActual;
		
	public Cafetera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cafetera(int capacidadMáxima, double cantidadActual) {
		super();
		this.capacidadMáxima = capacidadMáxima;
		this.cantidadActual = cantidadActual;
	}

	public int getCapacidadMáxima() {
		return capacidadMáxima;
	}

	public void setCapacidadMáxima(int capacidadMáxima) {
		this.capacidadMáxima = capacidadMáxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(double cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
}

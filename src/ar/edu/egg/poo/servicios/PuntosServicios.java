package ar.edu.egg.poo.servicios;

import java.util.Scanner;

import ar.edu.egg.poo.entidades.Puntos;

public class PuntosServicios {
	static Scanner leer = new Scanner(System.in);

	public static Puntos crearPuntos() {
		System.out.println("ingrese x1, y1, x2, y2:");
		double x1 = leer.nextDouble();
		double y1 = leer.nextDouble();
		double x2 = leer.nextDouble();
		double y2 = leer.nextDouble();
		Puntos ps = new Puntos(x1, y1, x2, y2);
		return ps;
	}

	public static double distancia(Puntos p) {
		return Math.sqrt(Math.pow(p.getX2() - p.getX1(), 2) + Math.pow(p.getY2() - p.getY1(), 2));
	}
}

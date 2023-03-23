package ar.edu.egg.poo.servicios;

import java.util.Scanner;

import ar.edu.egg.poo.entidades.Circunferencia;

public class CircunferenciaServicios {

	static Scanner leer = new Scanner(System.in);

	public static Circunferencia crearCircunferencia() {

		System.out.print("Ingrese el radio: ");
		return new Circunferencia(leer.nextInt());

	}
}

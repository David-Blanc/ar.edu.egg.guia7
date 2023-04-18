package ar.edu.egg.poo.servicios;

import java.util.Date;
import java.util.Scanner;

import ar.edu.egg.poo.entidades.Persona2;

public class Persona2Service {

	private static final Scanner leer = new Scanner(System.in);

	@SuppressWarnings("deprecation")
	public static Persona2 crearPersona() {
		System.out.print("Ingrese nombre: ");
		String nombre = leer.nextLine();
		Date fechaNacimiento = FechaService.fechaNacimiento();
		return new Persona2(nombre, fechaNacimiento);

	}

	public static int calcularEdad(Persona2 persona) {
		return FechaService.diferencia(persona.getFechaNacimiento(), new Date());
	}

	public static boolean menorQue(Persona2 persona, int edad) {
		return Persona2Service.calcularEdad(persona) < edad;
	}

	public static void mostrarPersona(Persona2 persona) {
		System.out.println(persona.toString());
	}
}

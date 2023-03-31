package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Persona;

public class PersonaServicio {

	public static boolean esMayorDeEdad(Persona persona) {
		return persona.getEdad() >= 18;
	}

	public static Persona crearPersona(String nombre, int edad, char sexo, double peso, double altura) {
		if (sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm' && sexo != 'O' && sexo != 'o') {
			System.out.println("El sexo ingresado no es válido. Por favor, ingrese H (hombre), M (mujer) u O (otro).");
			return null;
		}
		return new Persona(nombre, edad, sexo, peso, altura);
	}

	public static short calcularIMC(Persona persona) {
		double indice = persona.getPeso() / Math.pow(persona.getAltura(), 2);
		if (indice < 20) {
			return -1;
		} else if (indice <= 25) {
			return 0;
		}
		return 1;
	}

	public static double porcentajeDebajoPeso(Persona[] personas) {
		int contador = 0;
		for (int i = 0; i < personas.length; i++) {
			if (calcularIMC(personas[i]) == -1) {
				contador++;
			}
		}
		return ((double) contador / personas.length) * 100;
	}

	public static double porcentajePesoIdeal(Persona[] personas) {
		int contador = 0;
		for (int i = 0; i < personas.length; i++) {
			if (calcularIMC(personas[i]) == 0) {
				contador++;
			}
		}
		return ((double) contador / personas.length) * 100;
	}

	public static double porcentajeSobrepeso(Persona[] personas) {
		int contador = 0;
		for (int i = 0; i < personas.length; i++) {
			if (calcularIMC(personas[i]) == 1) {
				contador++;
			}
		}
		return ((double) contador / personas.length) * 100;
	}
	
	public static double porcentajeMayoresEdad(Persona[] personas) {
	    int contador = 0;
	    for (int i = 0; i < personas.length; i++) {
	        if (esMayorDeEdad(personas[i])) {
	            contador++;
	        }
	    }
	    return ((double) contador / personas.length) * 100;
	}

	public static double porcentajeMenoresEdad(Persona[] personas) {
	    int contador = 0;
	    for (int i = 0; i < personas.length; i++) {
	        if (!esMayorDeEdad(personas[i])) {
	            contador++;
	        }
	    }
	    return ((double) contador / personas.length) * 100;
	}
}

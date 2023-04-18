package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Cadena;

public class CadenaServicio {

	public static int contarVocales(Cadena cadena) {
		String vocales = "aeiouAEIOU";
		int cantidadVocales = 0;
		for (int i = 0; i < cadena.getLongitud(); i++) {
			char caracter = cadena.getFrase().charAt(i);
			if (vocales.indexOf(caracter) != -1) {
				cantidadVocales++;
			}
		}
		return cantidadVocales;
	}

	public static String invertirFrase(Cadena cadena) {
		StringBuilder sb = new StringBuilder(cadena.getFrase());
		return sb.reverse().toString();

	}

	public static int vecesRepetido(Cadena cadena, String letra) {
		if (letra.length() != 1) {
			throw new IllegalArgumentException("La letra debe ser un solo carácter");
		}
		char caracterBuscado = letra.toLowerCase().charAt(0);
		int contador = 0;
		for (int i = 0; i < cadena.getLongitud(); i++) {
			char caracterActual = cadena.getFrase().toLowerCase().charAt(i);
			if (caracterActual == caracterBuscado) {
				contador++;
			}
		}
		return contador;
	}

	public static boolean compararLongitud(Cadena cadena, String frase) {
		if (frase == null) {
			throw new IllegalArgumentException("La cadena de comparación no puede ser nula");
		}
		return cadena.getLongitud() == frase.length();
	}

	public static String unirFrase(Cadena cadena, String frase) {
		if (frase == null) {
			throw new IllegalArgumentException("La cadena a unir no puede ser nula");
		}
		System.out.println(cadena.getFrase() + " " + frase);
		return cadena.getFrase() + " " + frase;
	}

	public static void reemplazar(Cadena cadena, String letra) {
		if (letra == null) {
			throw new IllegalArgumentException("La letra de reemplazo no puede ser nula");
		}
		System.out.println(cadena.getFrase().replace("a", letra));
	}

	public static boolean contiene(Cadena cadena, String letra) {
		if (letra == null) {
			throw new IllegalArgumentException("La letra de búsqueda no puede ser nula");
		}
		return cadena.getFrase().toLowerCase().contains(letra.toLowerCase());
	}

}

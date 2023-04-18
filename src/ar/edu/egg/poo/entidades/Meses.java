package ar.edu.egg.poo.entidades;

import java.util.Scanner;

public class Meses {
	private static final String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
			"septiembro", "octubre", "noviembre", "diciembre", };
	private static final String mesSecreto = meses[9];

	public static void adivinarMes() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
		String intento;
		do {
			intento = leer.next();
			if (!intento.equals(Meses.mesSecreto)) {
				System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
			}
		} while (!intento.equals(Meses.mesSecreto));
		System.out.println("¡Ha acertado!");
	}
}

package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.NIF;

public class NIFService {

	public static NIF crearNif(long numeroDeDNI) {
		String letraIndice[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E" };
		NIF nif = new NIF(numeroDeDNI);
		nif.setLetra(letraIndice[(int) numeroDeDNI % 23]);
		return nif;

	}

	public static void mostrar(NIF nif) {
		System.out.println(nif.getNumeroDeDNI() + "-" + nif.getLetra());
	}
}

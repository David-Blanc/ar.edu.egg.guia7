package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.ParDeNumeros;

public class ParDeNumerosService {
	public static void mostrarValores(ParDeNumeros par) {
        System.out.println("Número 1: " + par.getNumero1() + ". Número 2: " + par.getNumero2());
    }

	public static double devolverMayor(ParDeNumeros par) {
        return Math.max(par.getNumero1(), par.getNumero2());
    }

	public static double calcularPotencia(ParDeNumeros par) {
        int mayor = (int) Math.round(devolverMayor(par));
        int menor = (int) Math.round(Math.min(par.getNumero1(), par.getNumero2()));
        return Math.pow(mayor, menor);
    }

	public static double calculaRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        return Math.sqrt(Math.abs(menor));
    }
}

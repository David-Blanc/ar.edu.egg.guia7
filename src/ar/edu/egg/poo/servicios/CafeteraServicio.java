package ar.edu.egg.poo.servicios;

import ar.edu.egg.poo.entidades.Cafetera;

public class CafeteraServicio {
	public void llenarCafetera(Cafetera cafetera) {
		cafetera.setCantidadActual(cafetera.getCapacidadMáxima());
	}
	
	public void servirTaza(Cafetera cafetera, double tamañoTaza) {
		if (tamañoTaza > cafetera.getCantidadActual()) {
			System.out.println((cafetera.getCantidadActual()/tamañoTaza)*100+"% de la taza llena");
			cafetera.setCantidadActual(0);
		} else {
			System.out.println("Taza llena");
			cafetera.setCantidadActual(cafetera.getCantidadActual()-tamañoTaza);
		}
	}
	
	public void vaciarCafetera(Cafetera cafetera) {
		cafetera.setCantidadActual(0);
	}
	
	public void agregarCafe(Cafetera cafetera, int agregar) {
		if (cafetera.getCapacidadMáxima()-cafetera.getCantidadActual() <= agregar) {
			cafetera.setCantidadActual(cafetera.getCapacidadMáxima());
		} else {
			cafetera.setCantidadActual(cafetera.getCantidadActual()+agregar);
		}
	}
}

package ar.edu.egg.poo.servicios;

import java.util.Scanner;

import ar.edu.egg.poo.entidades.Libro;

public class LibroServicios {
	static Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public void crearLibro() {
	    System.out.println("Ingrese ISBN, título, autor y número de páginas:");
	    String isbn = leer.nextLine();
	    String titulo = leer.nextLine();
	    String autor = leer.nextLine();
	    int numPaginas = Integer.parseInt(leer.nextLine());
	    Libro var = new Libro(isbn, titulo, autor, numPaginas);
	    System.out.println(var.toString());
	}


}

package ar.edu.egg.poo.entidades;

public class Libro {
	private String ISBM;
	private String titulo;
	private String autor;
	private int numeroDePaginas;

	public Libro() {
		super();
	}

	public Libro(String iSBM, String titulo, String autor, int numeroDePaginas) {
		super();
		ISBM = iSBM;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBM=" + ISBM + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas="
				+ numeroDePaginas + "]";
	}
	


}

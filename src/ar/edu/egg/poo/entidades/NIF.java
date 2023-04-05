package ar.edu.egg.poo.entidades;

public class NIF {
	private long numeroDeDNI;
	private String letra;

	public NIF(long numeroDeDNI) {
		this.numeroDeDNI = numeroDeDNI;
	}

	public long getNumeroDeDNI() {
		return numeroDeDNI;
	}

	public void setNumeroDeDNI(long numeroDeDNI) {
		this.numeroDeDNI = numeroDeDNI;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

}

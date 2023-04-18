package ar.edu.egg.poo.entidades;

import java.util.Date;

public class Persona2 {
	private String nombre;
	private Date fechaNacimiento;

	public Persona2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona2(String nombre, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona2 [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}

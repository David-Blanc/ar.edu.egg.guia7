package ar.edu.egg.poo.entidades;

public class Empleado {
	private String nombre;
	private int edad;
	private int salario;

	public Empleado(String nombre, int edad, int salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public int calcular_aumento() {
		int aumento;
		if (edad > 30) {
			aumento = (int) (0.1 * salario);
		} else {
			aumento = (int) (0.05 * salario);
		}
		return aumento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario= $" + salario + "]";
	}

}

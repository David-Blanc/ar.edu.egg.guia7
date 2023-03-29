package ar.edu.egg.poo.entidades;

import java.util.List;

public class Receta {
	private String nombre;
    private List<String> ingredientes;
    
    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<String> getIngredientes() {
        return ingredientes;
    }

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", ingredientes=" + ingredientes + "]";
	}
}

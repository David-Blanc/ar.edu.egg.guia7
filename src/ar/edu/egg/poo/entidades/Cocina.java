package ar.edu.egg.poo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
	private List<Receta> recetas;
	
    public Cocina() {
        recetas = new ArrayList<>();
    }
	
	public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }
	
	public Receta buscarRecetaPorNombre(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }
	
	public List<Receta> buscarRecetaPorIngredientes(List<String> ingredientes) {
	    List<Receta> recetasEncontradas = new ArrayList<>();
	    for (Receta receta : recetas) {
	        if (receta.getIngredientes().containsAll(ingredientes)) {
	            recetasEncontradas.add(receta);
	        }
	    }
	    return recetasEncontradas;
	}
	
	
}

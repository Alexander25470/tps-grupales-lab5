package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Libro;

public interface InegLibro {
	public List<Libro> obtenerTodos();
	public Libro obtenerUno(String ISBN);
}

package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Biblioteca;

public interface InegBiblioteca {
	public List<Biblioteca> obtenerTodas();
	public boolean guardar(Biblioteca biblioteca);
	Biblioteca obtenerUno(int id);
}

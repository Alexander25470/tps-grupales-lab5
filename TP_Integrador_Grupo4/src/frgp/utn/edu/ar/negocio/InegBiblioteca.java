package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Libro;

public interface InegBiblioteca {
	public List<Biblioteca> obtenerTodas(int estado);
	public boolean guardar(Biblioteca biblioteca);
	public boolean actualizar(Biblioteca biblioteca);
	public boolean eliminar(Biblioteca biblioteca);
	Biblioteca obtenerUno(int id);
	Biblioteca cargarUno(int id);
	public boolean marcarEnBiblioteco(Biblioteca b);
	public boolean marcarPrestado(Biblioteca b);
}

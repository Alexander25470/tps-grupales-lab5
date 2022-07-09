package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Nacionalidad;

public interface InegNacionalidad {
	public List<Nacionalidad> obtenerTodas();
	public Nacionalidad obtenerUna(int id);
}

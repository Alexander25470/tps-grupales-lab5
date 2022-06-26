package dao;

import java.util.List;

import entidad.Persona;

public interface IdaoPersona {

	public List<Persona> listarPersonas();
	public boolean agregarPersona(Persona p);
}

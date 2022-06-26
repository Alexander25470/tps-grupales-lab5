package negocio;

import java.util.List;

import entidad.Persona;

public interface InegPersona {

	public List<Persona> listarPersonas();
	public boolean agregarPersona(Persona p);
}

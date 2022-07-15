package frgp.utn.edu.ar.negocio;

import frgp.utn.edu.ar.entidad.Usuario;

public interface InegUsuario {
	public Usuario iniciarSesion(String user, String pass);
}

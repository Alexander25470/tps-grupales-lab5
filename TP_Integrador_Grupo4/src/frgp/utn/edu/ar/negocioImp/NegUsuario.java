package frgp.utn.edu.ar.negocioImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoUsuario;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.InegUsuario;

@Service("servicioUsuario")
public class NegUsuario implements InegUsuario {
	@Autowired
	private IdaoUsuario daoUsuario;
	@Override
	public Usuario iniciarSesion(String user, String pass) {
		return daoUsuario.findOne("WHERE user = '" + user + "' AND pass = '" + pass + "'");
	}

}

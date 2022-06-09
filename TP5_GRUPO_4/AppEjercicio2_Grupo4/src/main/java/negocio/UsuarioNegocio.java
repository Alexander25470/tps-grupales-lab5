package negocio;

import dao.UsuarioDao;
import entidad.Usuario;

public class UsuarioNegocio {

	private UsuarioDao usuarioDao;
	
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}



	public boolean agregarUsuario(Usuario usuario)
	{
		boolean existe = usuarioDao.Exist(usuario.getUsuario());
		if(existe ==false)
		{
			usuarioDao.Add(usuario);
			return true;
		}
		return false;
	}
}
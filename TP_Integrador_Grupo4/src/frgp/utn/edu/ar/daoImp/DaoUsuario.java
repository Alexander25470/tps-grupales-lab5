package frgp.utn.edu.ar.daoImp;

import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoUsuario;
import frgp.utn.edu.ar.entidad.Usuario;

@Repository("daoUsuario")
public class DaoUsuario  extends DaoGenerico<Usuario> implements IdaoUsuario {

}

package frgp.utn.edu.ar.daoImp;

import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoNacionalidad;
import frgp.utn.edu.ar.entidad.Nacionalidad;

@Repository("daoNacionalidad")
public class DaoNacionalidad extends DaoGenerico<Nacionalidad> implements IdaoNacionalidad {

}

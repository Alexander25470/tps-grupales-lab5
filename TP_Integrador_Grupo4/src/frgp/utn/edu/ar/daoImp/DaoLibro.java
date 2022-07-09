package frgp.utn.edu.ar.daoImp;

import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoLibro;
import frgp.utn.edu.ar.entidad.Libro;

@Repository("daoLibro")
public class DaoLibro extends DaoGenerico<Libro> implements IdaoLibro {

}

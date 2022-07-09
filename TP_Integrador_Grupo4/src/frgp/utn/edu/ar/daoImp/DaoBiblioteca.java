package frgp.utn.edu.ar.daoImp;

import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoBiblioteca;
import frgp.utn.edu.ar.entidad.Biblioteca;

@Repository("daoBiblioteca")
public class DaoBiblioteca extends DaoGenerico<Biblioteca> implements IdaoBiblioteca {

}

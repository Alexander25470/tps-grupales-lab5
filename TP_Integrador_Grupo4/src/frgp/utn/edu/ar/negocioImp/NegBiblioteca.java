package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoBiblioteca;
import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.negocio.InegBiblioteca;

@Service("servicioBiblioteca")
public class NegBiblioteca implements InegBiblioteca{

	@Autowired
	private IdaoBiblioteca daoBiblioteca;
	
	@Override
	public List<Biblioteca> obtenerTodas() {
		// TODO Auto-generated method stub
		return daoBiblioteca.getAll();
	}

	@Override
	public boolean guardar(Biblioteca biblioteca){
		// TODO Auto-generated method stub
		return daoBiblioteca.create(biblioteca);
	}
	
	@Override
	public Biblioteca obtenerUno(int id) {
		return daoBiblioteca.getOne(id);
	}
	
	@Override
	public Biblioteca cargarUno(int id) {
		return daoBiblioteca.loadOne(id);
	}

	@Override
	public boolean eliminar(Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		return daoBiblioteca.delete(biblioteca);
	}

}

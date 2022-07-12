package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoLibro;
import frgp.utn.edu.ar.entidad.Libro;
import frgp.utn.edu.ar.negocio.InegLibro;

@Service("servicioLibro")
public class NegLibro implements InegLibro {

	@Autowired
	private IdaoLibro daoLibro;
	
	@Override
	public List<Libro> obtenerTodos() {
		return daoLibro.getAll();
	}

	@Override
	public Libro obtenerUno(String ISBN) {
		// TODO Auto-generated method stub
		return daoLibro.getOne(ISBN);
	}

}

//Prueba de pusheo 

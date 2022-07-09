package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoNacionalidad;
import frgp.utn.edu.ar.entidad.Nacionalidad;
import frgp.utn.edu.ar.negocio.InegNacionalidad;

@Service("servicioNacionalidad")
public class NegNacionalidad implements InegNacionalidad {

	@Autowired
	private IdaoNacionalidad daoNacionalidad;
	
	@Override
	public List<Nacionalidad> obtenerTodas() {
		// TODO Auto-generated method stub
		return daoNacionalidad.getAll();
	}

	@Override
	public Nacionalidad obtenerUna(int id) {
		// TODO Auto-generated method stub
		return daoNacionalidad.getOne(id);
	}

}

package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoCliente;
import frgp.utn.edu.ar.dao.IdaoPrestamo;
import frgp.utn.edu.ar.daoImp.DaoPrestamo;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Prestamo;
import frgp.utn.edu.ar.negocio.InegCliente;
import frgp.utn.edu.ar.negocio.InegPrestamo;

@Service("servicioPrestamo")
public class NegPrestamo implements InegPrestamo {

	@Autowired
	private IdaoPrestamo daoPrestamo;

	@Override
	public boolean agregarPrestamo(Prestamo c) {
		return daoPrestamo.create(c);
	}

	@Override
	public boolean eliminar(Prestamo c) {
		// TODO Auto-generated method stub
		return daoPrestamo.delete(c);
	}

	@Override
	public List<Prestamo> obtenerTodos() {
		// TODO Auto-generated method stub
		return daoPrestamo.getAll();
	}

	@Override
	public Prestamo obtenerPrestamo(int id) {
		// TODO Auto-generated method stub
		return daoPrestamo.getOne(id);
	}

}

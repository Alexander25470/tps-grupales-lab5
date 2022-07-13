package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoCliente;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.negocio.InegCliente;

@Service("servicioCliente")
public class NegCliente implements InegCliente {

	@Autowired
	private IdaoCliente daoCliente;
	
	@Override
	public List<Cliente> listarClientes(String nombreODni) {
		if(nombreODni == null || nombreODni ==  "")
		{			
			return daoCliente.getAll();
		} else {
			String where = "where DNI like '%"+nombreODni+"%' or nombre like '%"+nombreODni+"%'";
			return daoCliente.getAll(where);
		}
	}

	@Override
	public boolean agregarCliente(Cliente c) {
		return daoCliente.create(c);
	}

	@Override
	public Cliente obtenerUno(int id) {
		return daoCliente.getOne(id);
	}
	
	@Override
	public Cliente cargarUno(int id) {
		return daoCliente.loadOne(id);
	}

	@Override
	public boolean eliminar(Cliente c) {
		// TODO Auto-generated method stub
		return daoCliente.delete(c);
	}

}

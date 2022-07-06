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
	public List<Cliente> listarClientes() {
		return daoCliente.getAll();
	}

	@Override
	public boolean agregarCliente(Cliente c) {
		return daoCliente.create(c);
	}

}

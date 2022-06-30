package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Cliente;

public interface InegCliente {

	public List<Cliente> listarClientes();
	public boolean agregarCliente(Cliente c);
}

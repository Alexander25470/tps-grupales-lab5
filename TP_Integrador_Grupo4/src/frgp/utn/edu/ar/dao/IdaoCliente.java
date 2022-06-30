package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Cliente;
public interface IdaoCliente {

	public List<Cliente> listarClientes();
	public boolean agregarCliente(Cliente c);
}

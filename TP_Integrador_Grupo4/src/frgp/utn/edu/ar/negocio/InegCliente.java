package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Cliente;

public interface InegCliente {

	public List<Cliente> listarClientes(String nombreODni);
	public boolean agregarCliente(Cliente c);
	public Cliente obtenerUno(int id);
	public Cliente cargarUno(int id);
	public boolean eliminar(Cliente c);
	public boolean actualizar(Cliente c);
}

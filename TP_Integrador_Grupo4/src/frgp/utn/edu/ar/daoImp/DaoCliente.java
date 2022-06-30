package frgp.utn.edu.ar.daoImp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoCliente;
import frgp.utn.edu.ar.entidad.Cliente;

@Repository("daoCliente")
public class DaoCliente implements IdaoCliente {
	
	@Autowired
	private Conexion conexion;
	
	@Override
	public List<Cliente> listarClientes() {
		Session session = conexion.abrirConexion();
		
		session.close();
		return null;
	}

	@Override
	public boolean agregarCliente(Cliente c) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.save(c); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		return aux;
	}
}

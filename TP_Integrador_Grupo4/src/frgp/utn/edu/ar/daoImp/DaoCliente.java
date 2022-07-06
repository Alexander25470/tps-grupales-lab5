package frgp.utn.edu.ar.daoImp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoCliente;
import frgp.utn.edu.ar.entidad.Cliente;

@Repository("daoCliente")
public class DaoCliente extends DaoGenerico<Cliente> implements IdaoCliente {
	

}

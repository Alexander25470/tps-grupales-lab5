package ejercicio2;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import ejercicio2.entidad.Cliente;
import ejercicio2.entidad.Compra;



public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	SessionFactory sessionFactory;
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	
    	Compra compra = new Compra(0, "articulo 1");
    	Compra compra1 = new Compra(1, "articulo 2");
    	
    	List<Compra> compras = Arrays.asList(compra, compra1);
    	
    	Cliente cliente = new Cliente(0, "Cliente 1", compras);

    	
     	session.save(cliente);
    	
    	session.getTransaction().commit();
    	
    	
    	Cliente lecturaCliente = (Cliente) session.createQuery("FROM Cliente where id = 0").uniqueResult();
    	
    	System.out.println(lecturaCliente);
    	
    	session.close();
    	
    	
    	sessionFactory.close();
    	 	
    	
    	
    }
}

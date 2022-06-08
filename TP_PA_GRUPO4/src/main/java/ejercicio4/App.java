package ejercicio4;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import ejercicio4.entidad.Mercado;
import ejercicio4.entidad.Producto;

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
    	
    	Producto producto1 = new Producto(0, "producto 1");
    	Producto producto2 = new Producto(1, "producto 2");
    	Producto producto3 = new Producto(2, "producto 3");
    	Producto producto4 = new Producto(3, "producto 4");
    	
    	
    	List<Producto> listaProductos1 = Arrays.asList(producto1, producto2, producto3);
    	List<Producto> listaProductos2 = Arrays.asList(producto2, producto3, producto4);
    	    	
    	Mercado mercado1 = new Mercado(0, "mercado 1", listaProductos1);
    	Mercado mercado2 = new Mercado(1, "mercado 2", listaProductos2);
    	
     	session.save(mercado1);
     	session.save(mercado2);
    	
    	session.getTransaction().commit();
    	
    	
    	Mercado lecturaMercado1 = (Mercado) session.createQuery("FROM Mercado where id = 0").uniqueResult();
    	System.out.println(lecturaMercado1);
    	
    	Mercado lecturaMercado2 = (Mercado) session.createQuery("FROM Mercado where id = 1").uniqueResult();
    	System.out.println(lecturaMercado2);
    	
    	session.close();
    	
    	
    	sessionFactory.close();
    	 	
    	
    	
    }
}

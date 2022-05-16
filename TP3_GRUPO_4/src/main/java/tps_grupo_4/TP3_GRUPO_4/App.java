package tps_grupo_4.TP3_GRUPO_4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import tps_grupo4.TP3_GRUPO_4.entidad.Genero;
import tps_grupo4.TP3_GRUPO_4.entidad.Nacionalidad;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory;
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	
    	
    	Genero genero = new Genero();
    	genero.setId(0);
    	genero.setDescripcion("test");
    	
    	Nacionalidad nacionalidad = new Nacionalidad();
    	nacionalidad.setId(0);
    	nacionalidad.setDescripcion("pais1");
    	
    	
     	session.save(genero);
    	session.save(nacionalidad);
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	sessionFactory.close();
    }
}

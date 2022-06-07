package ejercicio1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import ejercicio1.entidad.Persona;
import ejercicio1.entidad.TarjetaSube;

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
    	
    	TarjetaSube tjs = new TarjetaSube(0, "0000 0000 0000 0000");
    	
    	Persona persona = new Persona(0, "Persona 1", tjs);

    	
     	session.save(persona);
    	
    	session.getTransaction().commit();
    	
    	
    	Persona lecturaPersona = (Persona) session.createQuery("FROM Persona where id = 0").uniqueResult();
    	
    	System.out.println(lecturaPersona);
    	
    	session.close();
    	
    	
    	sessionFactory.close();
    	 	
    	
    	
    }
}

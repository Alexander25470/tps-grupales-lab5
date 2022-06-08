package ejercicio3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


import ejercicio3.entidad.Artista;
import ejercicio3.entidad.Evento;

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
    	
    	Artista artista = new Artista(0, "artista 1");
    	
    	    	
    	Evento evento = new Evento(0, "evento 1", artista);

    	
     	session.save(evento);
    	
    	session.getTransaction().commit();
    	
    	
    	Evento lecturaEvento = (Evento) session.createQuery("FROM Evento where id = 0").uniqueResult();
    	
    	System.out.println(lecturaEvento);
    	
    	session.close();
    	
    	
    	sessionFactory.close();
    	 	
    	
    	
    }
}
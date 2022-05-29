package tps_grupo_4.TP4_GRUPO_4;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dao.DaoHibernate;
import tps_grupo_4.TP4_GRUPO_4.entidad.Autor;
import tps_grupo_4.TP4_GRUPO_4.entidad.Biblioteca;
import tps_grupo_4.TP4_GRUPO_4.entidad.Genero;
import tps_grupo_4.TP4_GRUPO_4.entidad.Libro;
import tps_grupo_4.TP4_GRUPO_4.entidad.Nacionalidad;

public class App2 {
    @SuppressWarnings("unchecked")
	public static void main( String[] args ) throws Exception
    {
    	
    	SessionFactory sessionFactory;
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	
		List<Libro> listaLibros= (List<Libro>) session.createQuery("FROM Libro l ORDER BY l.ISBN").list();
    	
    	for (Libro libro : listaLibros) {
      	  System.out.println(" Usuarios: "+ libro.toString()+" ");	
		}
    	
    	sessionFactory.close();
    	 	

    	
    }
}

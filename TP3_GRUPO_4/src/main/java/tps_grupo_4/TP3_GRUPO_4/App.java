package tps_grupo_4.TP3_GRUPO_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import tps_grupo4.TP3_GRUPO_4.entidad.Autor;
import tps_grupo4.TP3_GRUPO_4.entidad.Genero;
import tps_grupo4.TP3_GRUPO_4.entidad.Libro;
import tps_grupo4.TP3_GRUPO_4.entidad.Nacionalidad;


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
    	
    	
    	Genero genero = new Genero();
    	genero.setId(0);
    	genero.setDescripcion("test");
    	
    	Genero genero1 = new Genero();
    	genero1.setId(1);
    	genero1.setDescripcion("genero 1");
    	
    	Nacionalidad nacionalidad = new Nacionalidad();
    	nacionalidad.setId(0);
    	nacionalidad.setDescripcion("pais1");
    	
    	Autor autor = new Autor();
    	
    	autor.setId(0);
    	autor.setNombre("nombre 1");
    	autor.setApellido("Apellido 1");
    	autor.setEmail("nombre@nombre.com");
    	autor.setNacionalidad(nacionalidad);
    	
    	List<Genero> generosLibro1 = new ArrayList<Genero>();
    	generosLibro1.add(genero);
    	generosLibro1.add(genero1);
    	Date test = new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2022");
    	Libro libro1 = new Libro("ISBN1", "Titulo 1", test, "Idioma 1", 50, autor, "descripcion", generosLibro1);
    	
    	
     	session.save(genero);
     	session.save(genero1);
    	session.save(nacionalidad);
    	session.save(autor);
    	session.save(libro1);
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	sessionFactory.close();
    }
}

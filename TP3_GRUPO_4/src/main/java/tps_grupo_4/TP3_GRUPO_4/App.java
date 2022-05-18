package tps_grupo_4.TP3_GRUPO_4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dao.DaoHibernate;
import tps_grupo4.TP3_GRUPO_4.entidad.Autor;
import tps_grupo4.TP3_GRUPO_4.entidad.Genero;
import tps_grupo4.TP3_GRUPO_4.entidad.Libro;
import tps_grupo4.TP3_GRUPO_4.entidad.Nacionalidad;
import tps_grupo4.TP3_GRUPO_4.entidad.Biblioteca;

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
    	
    	
    	Genero genero = new Genero(0, "genero 0");
    	Genero genero1 = new Genero(1, "genero 1");
    	Genero genero2 = new Genero(2, "genero 2");
    	Genero genero3 = new Genero(3, "genero 3");
    	Genero genero4 = new Genero(4, "genero 4");
    	
    	Nacionalidad nacionalidad = new Nacionalidad(0, "pais");
    	Nacionalidad nacionalidad1 = new Nacionalidad(1, "pais 1");
    	Nacionalidad nacionalidad2 = new Nacionalidad(2, "pais 2");
    	Nacionalidad nacionalidad3 = new Nacionalidad(3, "pais 3");
    	Nacionalidad nacionalidad4 = new Nacionalidad(4, "pais 4");


    	
    	Autor autor = new Autor(0, "nombre", "Apellido 1", nacionalidad, "nombre@nombre.com");
    	Autor autor1 = new Autor(1, "nombre 1", "Apellido 1", nacionalidad, "nombre1@nombre1.com");
    	Autor autor2 = new Autor(2, "nombre 2", "Apellido 2", nacionalidad, "nombre2@nombre2.com");
    	Autor autor3 = new Autor(3, "nombre 3", "Apellido 3", nacionalidad, "nombre3@nombre3.com");
    	Autor autor4 = new Autor(4, "nombre 4", "Apellido 4", nacionalidad, "nombre4@nombre4.com");

    	
    	Date fechaLibro = new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2022");
    	Libro libro = new Libro("ISBN0", "Titulo 1", fechaLibro, "Idioma 1", 50, autor, "descripcion", Arrays.asList(genero, genero1));
    	
    	Date fechaLibro1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2020");
    	Libro libro1 = new Libro("ISBN1", "Titulo 1", fechaLibro1, "Idioma 1", 50, autor1, "descripcion", Arrays.asList(genero, genero1));
    	
    	Date fechaLibro2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2015");
    	Libro libro2 = new Libro("ISBN2", "Titulo 1", fechaLibro2, "Idioma 1", 50, autor2, "descripcion", Arrays.asList(genero, genero1));
    	
    	Date fechaLibro3 = new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2010");
    	Libro libro3 = new Libro("ISBN3", "Titulo 1", fechaLibro3, "Idioma 1", 50, autor3, "descripcion", Arrays.asList(genero, genero1));
    	
    	Date fechaLibro4 = new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2005");
    	Libro libro4 = new Libro("ISBN4", "Titulo 1", fechaLibro4, "Idioma 1", 50, autor4, "descripcion", Arrays.asList(genero, genero1));
    	
    	
    	Date fechaAltaLibro = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
    	Biblioteca biblioteca = new Biblioteca(0, libro, fechaAltaLibro, 1);
    	
    	Date fechaAltaLibro1 = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
    	Biblioteca biblioteca1 = new Biblioteca(1, libro1, fechaAltaLibro1, 1);
    	
    	Date fechaAltaLibro2 = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
    	Biblioteca biblioteca2 = new Biblioteca(2, libro2, fechaAltaLibro2, 1);
    	
    	Date fechaAltaLibro3 = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
    	Biblioteca biblioteca3 = new Biblioteca(3, libro3, fechaAltaLibro3, 1);
    	
    	Date fechaAltaLibro4 = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2021");
    	Biblioteca biblioteca4 = new Biblioteca(4, libro4, fechaAltaLibro4, 1);
    	
     	session.save(genero);
     	session.save(genero1);
     	session.save(genero2);
     	session.save(genero3);
     	session.save(genero4);
    	session.save(nacionalidad);
    	session.save(nacionalidad1);
    	session.save(nacionalidad2);
    	session.save(nacionalidad3);
    	session.save(nacionalidad4);
    	session.save(autor);
    	session.save(autor1);
    	session.save(autor2);
    	session.save(autor3);
    	session.save(autor4);
    	session.save(biblioteca);
    	session.save(biblioteca1);
    	session.save(biblioteca2);
    	session.save(biblioteca3);
    	session.save(biblioteca4);
    	session.save(libro);
    	session.save(libro1);
    	session.save(libro2);
    	session.save(libro3);
    	session.save(libro4);
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	sessionFactory.close();
    	 	
    	// Crear una biblioteca
    	Biblioteca bibli = new Biblioteca();
    	bibli.setId(5);
    	bibli.setLibro(libro);
    	Date fechaAltaLibro11 = new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2020");
    	bibli.setFechaDeAlta(fechaAltaLibro11);
    	bibli.setEstado(1); 	
    	DaoHibernate.add(bibli);
    	
    	// Modificar la biblioteca
    	bibli.setEstado(2);
    	DaoHibernate.update(bibli);
    	
    	//Leer una biblioteca
    	Biblioteca bibli1 = DaoHibernate.leerUno(1);
    	System.out.println("La biblioteca tiene los siguientes datos: "+bibli.toString());   	
    	
    	//Eliminar una biblioteca
    	Biblioteca bibli3 = new Biblioteca();
    	bibli3.setId(3);
    	DaoHibernate.delete(bibli3);
    	
    	
    }
}

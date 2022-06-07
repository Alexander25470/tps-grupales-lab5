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
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 1");
		System.out.println("--------------------------------------------------------");
    	
		List<Libro> listaLibros= (List<Libro>) session.createQuery("FROM Libro l ORDER BY l.ISBN").list();
		
		
		System.out.println("Libros ordenados por ISBN:");
    	for (Libro libro : listaLibros) {
      	  System.out.println(libro.toString()+" ");	
		}
    	
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 2");
		System.out.println("--------------------------------------------------------");
    	List<Object[]> listaLibrosPrestados = (List<Object[]>) session.createQuery("SELECT bi.id, bi.fechaDeAlta, bi.libro.titulo FROM Biblioteca as bi INNER JOIN bi.libro WHERE bi.Estado = 2").list();
    	System.out.println("Libros prestados");
    	for (Object[] obj : listaLibrosPrestados) {

        	System.out.println("ID Biblioteca: "+ obj[0].toString()+", Fecha de alta: "+ obj[1]+ ", titulo: "+ obj[2]);		
  		}
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 3");
		System.out.println("--------------------------------------------------------");
    	
    	List<Autor> listaAutores= (List<Autor>) session.createQuery("FROM Autor a where a.nacionalidad.descripcion = 'Argentina'").list();
    	
    	System.out.println("Autores Argentinos:");
    	for (Autor aut : listaAutores) {
      	  System.out.println(aut.toString()+" ");	
		}
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 4");
		System.out.println("--------------------------------------------------------");
    	
    	Libro libroISBN123456= (Libro) session.createQuery("FROM Libro l where l.ISBN=12345").uniqueResult();
    	
    	System.out.println("Libro con ISBN 12345");	
    	if(libroISBN123456 != null)
    	{
    		System.out.println(libroISBN123456.toString()+" ");	
    		
    	}
    	
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 5");
		System.out.println("--------------------------------------------------------");
    	
		int libroMayorISBN= (int)(Integer)session.createQuery("SELECT l.ISBN FROM Libro l ORDER BY l.ISBN DESC").setMaxResults(1).uniqueResult();
    	
    	System.out.println("Libro con mayor ISBN: " + libroMayorISBN);
    	
    	
    	System.out.println("--------------------------------------------------------");
		System.out.println("EJERCICIO 6");
		System.out.println("--------------------------------------------------------");
    	
    	List<Genero> listaLibrosPorGenero = (List<Genero>) session.createQuery("FROM Genero").list();
    	System.out.println("Libros prestados");
    	for (Genero genero : listaLibrosPorGenero) {

        	System.out.println("Id genero:" + genero.getId()+ " Descripcion: " + genero.getDescripcion() + " Cantidad de libros: " + genero.getLibros().size());		
  		}
    	
    	sessionFactory.close();
    	
    }
}

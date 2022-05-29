package dao;

import org.hibernate.Session;

import tps_grupo_4.TP4_GRUPO_4.entidad.Biblioteca;

public class DaoHibernate {

	public static void add(Biblioteca bibli) 
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
	
     	session.beginTransaction();
	    session.save(bibli);
	    
	    session.getTransaction().commit();
	    ch.cerrarSession();
	}
	
	public static Biblioteca leerUno(int id) 
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session = config.abrirConexion();
		
		session.beginTransaction();
		Biblioteca nacion = (Biblioteca)session.get(Biblioteca.class,id);
		
		config.cerrarSession();
		
		return nacion;
	}
	
	public static void update(Biblioteca bibli)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session = config.abrirConexion();
		
		session.beginTransaction();
		session.update(bibli);
		session.getTransaction().commit();
		
		config.cerrarSession();
		
	}
	
	public static void delete(Biblioteca bibli)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session = config.abrirConexion();
		
		session.beginTransaction();
		session.delete(bibli);
		session.getTransaction().commit();
		
		config.cerrarSession();
	}
	
	
}

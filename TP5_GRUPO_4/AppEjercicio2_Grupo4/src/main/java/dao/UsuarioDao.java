package dao;

import org.hibernate.Session;

import entidad.Usuario;

public class UsuarioDao {

	private ConfigHibernate config;
	
	
	public UsuarioDao(ConfigHibernate config) {
		this.config = config;
	}

	public void Add(Usuario user)
	{
		Session session= config.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();    
		config.cerrarSession();
	}
	
	public Usuario ReadOne(String nombreUsuario)
	{
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        Usuario usuario=(Usuario)session.get(Usuario.class,nombreUsuario);
        
        config.cerrarSession();
        
        return usuario;
	}

	public boolean Exist(String nombreUsuario)
	{
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        Usuario usuario=(Usuario)session.get(Usuario.class,nombreUsuario);
        
        config.cerrarSession();
        if(usuario!=null)
        	return true;
        
        return false;
	}

	
	public void Update(Usuario usuario)
	{
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(Usuario usuario) 
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(usuario);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}


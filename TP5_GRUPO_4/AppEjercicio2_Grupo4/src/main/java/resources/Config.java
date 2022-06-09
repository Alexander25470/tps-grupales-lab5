package resources;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import dao.ConfigHibernate;
import dao.UsuarioDao;
import entidad.Usuario;
import negocio.UsuarioNegocio;

@Configuration
public class Config {
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Usuario usuarioPepe()
	{
		Usuario pepe = new Usuario();
		
		pepe.setUsuario("Pepe");
		pepe.setContrasenia("123");
		
		return pepe;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public ConfigHibernate configHibernate()
	{
		ConfigHibernate cHibernate = new ConfigHibernate();
		
		return cHibernate;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public UsuarioDao usuarioDao()
	{
		ConfigHibernate cHibernate = configHibernate();
		
		UsuarioDao usuarioDao = new UsuarioDao(cHibernate);
		
		return usuarioDao;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public UsuarioNegocio usuarioNegocio()
	{
		UsuarioDao uDao = usuarioDao();
		
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
		usuarioNegocio.setUsuarioDao(uDao);
		
		return usuarioNegocio;
	}
	
}

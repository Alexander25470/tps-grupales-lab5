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
		pepe.setUsuario("123");
		
		return pepe;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public ConfigHibernate configHibernate()
	{
		ConfigHibernate configHibernate = new ConfigHibernate();
		
		return configHibernate;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public UsuarioDao usuarioDao()
	{
		ConfigHibernate configHibernate = configHibernate();
		
		UsuarioDao usuarioDao = new UsuarioDao(configHibernate);
		
		return usuarioDao;
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public UsuarioNegocio usuarioNegocio()
	{
		UsuarioDao usuarioDao = usuarioDao();
		
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
		usuarioNegocio.setUsuarioDao(usuarioDao);
		
		return usuarioNegocio;
	}
	
}

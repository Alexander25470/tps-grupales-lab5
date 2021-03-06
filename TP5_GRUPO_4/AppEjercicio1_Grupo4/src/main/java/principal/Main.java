package principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Usuario;
import negocio.UsuarioNegocio;

public class Main {

	static ApplicationContext appContext;
	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext("resources/Beans.xml");
		
		Usuario usuario = (Usuario)appContext.getBean("usuarioPepe");

	    System.out.println(usuario);
	    UsuarioNegocio usuarioNegocio = (UsuarioNegocio)appContext.getBean("usuarioNegocio");
	    boolean estado= usuarioNegocio.agregarUsuario(usuario);
	    if(estado)
	    	System.out.println("Se agrego correctamente");
	    else
	    	System.out.println("No se pudo agregar, el usuario ya existe en la BD");
	    
	    
	    ((ConfigurableApplicationContext)(appContext)).close();
		    	
	}	
}

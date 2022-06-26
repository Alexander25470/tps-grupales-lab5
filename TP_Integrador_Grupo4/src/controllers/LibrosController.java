package controllers;

import javax.servlet.ServletConfig;

import org.hibernate.service.config.spi.ConfigurationService.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import entidad.Persona;
import negocioImp.NegPersona;

@Controller
public class LibrosController {

	/*@Autowired
	@Qualifier("servicioPersona")
	private NegPersona negocioPersona;
	@Autowired
	private Persona persona;*/
	
	
	@RequestMapping("Libros.html")
	public ModelAndView eventoRedireccionarPag1()//Integer txtDni,String txtNombre, String txtApellido
	{
		System.out.println("HOLA");
		ModelAndView MV = new ModelAndView();
		/*persona.setApellido(txtApellido);
		persona.setDni(txtDni);
		persona.setNombre(txtNombre);
		
		boolean estado= negocioPersona.agregarPersona(persona);
		String cartel="No se pudo agregar la persona";
		if(estado)
		{
			cartel="La persona ha sido agregada exitosamente";
		}
		MV.addObject("estadoAgregarPersona",cartel);*/
		MV.setViewName("Libros");
		return MV;
	}
}

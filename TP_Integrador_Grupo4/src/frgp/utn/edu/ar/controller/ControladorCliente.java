package frgp.utn.edu.ar.controller;

import javax.servlet.ServletConfig;

import org.hibernate.service.config.spi.ConfigurationService.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.negocioImp.NegCliente;

@Controller
public class ControladorCliente {

	@Autowired
	@Qualifier("servicioCliente")
	private NegCliente servicioCliente;
	@Autowired
	private Cliente cliente;
	
	
	@RequestMapping("agregarPersona.html")
	public ModelAndView eventoRedireccionarPag1(Integer txtDni,String txtNombre, String txtApellido)
	{
		ModelAndView MV = new ModelAndView();
		cliente.setApellido(txtApellido);
		cliente.setDni(txtDni.toString());
		cliente.setNombre(txtNombre);
		
		boolean estado= servicioCliente.agregarCliente(cliente);
		String cartel="No se pudo agregar la persona";
		if(estado)
		{
			cartel="La persona ha sido agregada exitosamente";
		}
		MV.addObject("estadoAgregarPersona",cartel);
		MV.setViewName("Inicio");
		return MV;
	}
}

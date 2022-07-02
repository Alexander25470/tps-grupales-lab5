package frgp.utn.edu.ar.controller;

import javax.servlet.ServletConfig;

import org.hibernate.service.config.spi.ConfigurationService.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value= "/clientes.html", method=RequestMethod.GET)
	public ModelAndView Clientes()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("Clientes");
		return MV;
	}
	
	@RequestMapping(value= "/altaCliente.html", method=RequestMethod.GET)
	public ModelAndView altaCliente()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("AltaCliente");
		return MV;
	}
	
	@RequestMapping(value= "/altaCliente.html", method=RequestMethod.POST)
	public ModelAndView altaClientePost(Integer txtDni,String txtNombre, String txtApellido)
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
		MV.setViewName("AltaCliente");
		return MV;
	}
	
	@RequestMapping(value= "/modificarCliente.html", method=RequestMethod.GET)
	public ModelAndView ModificarBiblioteca(int idCliente)
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("ModificarCliente");
		return MV;
	}
}

package frgp.utn.edu.ar.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import frgp.utn.edu.ar.entidad.Nacionalidad;
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
	
	@RequestMapping(value= "/altaClientePost.html", method=RequestMethod.GET)
	public ModelAndView altaClientePost(Integer dni,String nombre, String apellido, Integer idNacionalidad, String email, String localidad, String fechaNacimiento)
	{
		ModelAndView MV = new ModelAndView();
		cliente.setDni(dni.toString());
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		//Nacionalidad nac = new Nacionalidad();
		//nac.setId(idNacionalidad);
		//cliente.setNacionalidad(nac);
		cliente.setEmail(email);
		cliente.setLocalidad(localidad);
		/*Date fechaNac= new Date();
		try {
			fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
			System.out.println(fechaNac);
		} catch (Exception e){
			System.out.println(fechaNacimiento);
		}
		cliente.setFechaNacimiento(fechaNac);*/
		
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

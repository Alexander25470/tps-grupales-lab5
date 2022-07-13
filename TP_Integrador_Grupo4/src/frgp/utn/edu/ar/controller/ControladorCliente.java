package frgp.utn.edu.ar.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import frgp.utn.edu.ar.negocioImp.NegNacionalidad;

@Controller
public class ControladorCliente {

	@Autowired
	@Qualifier("servicioCliente")
	private NegCliente servicioCliente;
	@Autowired
	@Qualifier("servicioNacionalidad")
	private NegNacionalidad servicioNacionalidad;
	@Autowired
	private Cliente cliente;
	
	@RequestMapping(value= "/clientes.html", method=RequestMethod.GET)
	public ModelAndView Clientes(String nombreCliente)
	{
		ModelAndView MV = new ModelAndView();
		List<Cliente> clientes = servicioCliente.listarClientes(nombreCliente);
		MV.setViewName("Clientes");
		MV.addObject("clientes",clientes);
		return MV;
	}
	
	@RequestMapping(value= "/altaCliente.html", method=RequestMethod.GET)
	public ModelAndView altaCliente()
	{
		ModelAndView MV = new ModelAndView();
		List<Nacionalidad> nacionalidades = servicioNacionalidad.obtenerTodas();

		MV.setViewName("AltaCliente");
		MV.addObject("nacionalidades",nacionalidades);
		return MV;
	}
	
	@RequestMapping(value= "/altaClientePost.html", method=RequestMethod.GET)
	public ModelAndView altaClientePost(Integer dni,String nombre, String apellido, Integer idNacionalidad,
	String email, String localidad, String fechaNacimiento,
	String direccion, String telefono
	)
	{
		ModelAndView MV = new ModelAndView();
		List<Nacionalidad> nacionalidades = servicioNacionalidad.obtenerTodas();
		cliente.setDni(dni.toString());
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		Nacionalidad nac = servicioNacionalidad.obtenerUna(idNacionalidad);
		cliente.setNacionalidad(nac);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		cliente.setEmail(email);
		cliente.setLocalidad(localidad);
		Date fechaNac= new Date();
		try {
			fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
			System.out.println(fechaNac);
		} catch (Exception e){
			System.out.println(fechaNacimiento);
		}
		cliente.setFechaNacimiento(fechaNac);
		
		boolean estado= servicioCliente.agregarCliente(cliente);
		String cartel="No se pudo agregar la persona";
		if(estado)
		{
			cartel="La persona ha sido agregada exitosamente";
		}
		MV.addObject("estadoAgregarPersona",cartel);
		MV.addObject("nacionalidades",nacionalidades);
		MV.setViewName("AltaCliente");
		return MV;
	}
	
	@RequestMapping(value= "/modificarCliente.html", method=RequestMethod.GET)
	public ModelAndView ModificarBiblioteca(int idCliente)
	{
		ModelAndView MV = new ModelAndView();
		List<Nacionalidad> nacionalidades = servicioNacionalidad.obtenerTodas();
		Cliente cli = servicioCliente.obtenerUno(idCliente);
		MV.setViewName("ModificarCliente");
		MV.addObject("cliente",cli);
		MV.addObject("nacionalidades",nacionalidades);
		return MV;
	}
	
	@RequestMapping(value= "/eliminarCliente.html", method=RequestMethod.GET)
	public ModelAndView EliminarCliente(int idCliente)
	{
		ModelAndView MV = new ModelAndView();
		
		Cliente cliente = servicioCliente.cargarUno(idCliente);
		boolean resultado = servicioCliente.eliminar(cliente);
		String mensaje = "Error al eliminar cliente";
		if(resultado) {
			mensaje = "Cliente eliminado";
		}
		
		List<Cliente> clientes = servicioCliente.listarClientes("");
		MV.setViewName("Clientes");
		MV.addObject("clientes",clientes);
		MV.addObject("mensaje", mensaje);
		return MV;
	}
	
}

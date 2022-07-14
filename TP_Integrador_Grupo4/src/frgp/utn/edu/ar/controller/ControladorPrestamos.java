package frgp.utn.edu.ar.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.daoImp.DaoPrestamo;
import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Nacionalidad;
import frgp.utn.edu.ar.entidad.Prestamo;
import frgp.utn.edu.ar.negocioImp.NegBiblioteca;
import frgp.utn.edu.ar.negocioImp.NegCliente;
import frgp.utn.edu.ar.negocioImp.NegNacionalidad;
import frgp.utn.edu.ar.negocioImp.NegPrestamo;

@Controller
public class ControladorPrestamos {
	
	@Autowired
	@Qualifier("servicioBiblioteca")
	private NegBiblioteca servicioBiblioteca;
	
	@Autowired
	@Qualifier("servicioCliente")
	private NegCliente servicioCliente;
	
	@Autowired
	@Qualifier("servicioPrestamo")
	private NegPrestamo servicioPrestamo;
	
	@Autowired
	private Prestamo prestamo;
	
	@RequestMapping(value= "/prestamos.html", method=RequestMethod.GET)
	public ModelAndView Clientes()
	{
		ModelAndView MV = new ModelAndView();
		List<Prestamo> prestamos = servicioPrestamo.obtenerTodos();
		MV.setViewName("Prestamos");
		MV.addObject("prestamos", prestamos);
		return MV;
	}
	
	@RequestMapping(value= "/altaPrestamo.html", method=RequestMethod.GET)
	public ModelAndView altaPrestamo()
	{
		ModelAndView MV = new ModelAndView();
		List<Biblioteca> bibliotecas = servicioBiblioteca.obtenerTodas(1);
		List<Cliente> clientes = servicioCliente.listarClientes("");
		
		MV.setViewName("AltaPrestamo");
		MV.addObject("bibliotecas", bibliotecas);
		MV.addObject("clientes", clientes);
		
		return MV;
	}
	
	@RequestMapping(value= "/altaPrestamoPost.html", method=RequestMethod.GET)
	public ModelAndView altaPrestamoPost(Integer idBiblioteca, String txtFechaPrestamo, Integer txtCantDias, Integer idCliente)
	{
		ModelAndView MV = new ModelAndView();
		Biblioteca biblioteca = servicioBiblioteca.obtenerUno(idBiblioteca);
		Cliente cliente = servicioCliente.cargarUno(idCliente);
		
		
		prestamo.setBiblioteca(biblioteca);
		prestamo.setCantidadDeDias(txtCantDias);
		prestamo.setCliente(cliente);
		
		Date fechaAlta= new Date();
		try {
			fechaAlta = new SimpleDateFormat("yyyy-MM-dd").parse(txtFechaPrestamo);
			System.out.println(fechaAlta);
		} catch (Exception e){
			System.out.println(txtFechaPrestamo);
		}
		
		prestamo.setFechaDeAlta(fechaAlta);
		servicioBiblioteca.marcarPrestado(biblioteca);
		boolean estado= servicioPrestamo.agregarPrestamo(prestamo);
		
		String cartel="No se pudo agregar el Prestamo";
		String classEstado = "alertDanger";
		
		if(estado)
		{
			cartel="El prestamo ha sido agregado exitosamente";
			classEstado = "alertSuccess";
		}
		
		List<Biblioteca> bibliotecas = servicioBiblioteca.obtenerTodas(1);
		List<Cliente> clientes = servicioCliente.listarClientes("");

		MV.addObject("bibliotecas", bibliotecas);
		MV.addObject("clientes", clientes);
		MV.addObject("estadoAgregarPrestamo",cartel);
		MV.addObject("classEstado",classEstado);
		MV.setViewName("AltaPrestamo");
		
		return MV;
	}
	
	@RequestMapping(value= "/devolverPrestamo.html", method=RequestMethod.GET)
	public ModelAndView devolverPrestamo(int idPrestamo)
	{
		ModelAndView MV = new ModelAndView();
		
		Prestamo prestamo = servicioPrestamo.obtenerPrestamo(idPrestamo);
		Biblioteca biblioteca = prestamo.getBiblioteca();
		boolean estado = servicioBiblioteca.marcarEnBiblioteco(biblioteca);
		String mensaje = "Error al devolver libro";
		if(estado) {
			mensaje = "Libro devuelto";
		}
		List<Prestamo> prestamos = servicioPrestamo.obtenerTodos();
		MV.setViewName("Prestamos");
		MV.addObject("prestamos", prestamos);
		MV.addObject("mensaje", mensaje);
		return MV;
	}
}

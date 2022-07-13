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

import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Libro;
import frgp.utn.edu.ar.entidad.Prestamo;
import frgp.utn.edu.ar.negocioImp.NegBiblioteca;
import frgp.utn.edu.ar.negocioImp.NegCliente;
import frgp.utn.edu.ar.negocioImp.NegLibro;
import frgp.utn.edu.ar.negocioImp.NegPrestamo;

@Controller
public class ControladorBiblioteca {
	
	@Autowired
	@Qualifier("servicioBiblioteca")
	private NegBiblioteca servicioBiblioteca;
	@Autowired
	@Qualifier("servicioLibro")
	private NegLibro servicioLibro;
	@Autowired
	@Qualifier("servicioPrestamo")
	private NegPrestamo servicioPrestamo;
	@Autowired
	private Biblioteca biblioteca;
	
	@RequestMapping(value= "/bibliotecas.html", method=RequestMethod.GET)
	public ModelAndView Clientes()
	{
		ModelAndView MV = new ModelAndView();
		List<Biblioteca> biblioteca = servicioBiblioteca.obtenerTodas();
		
		MV.setViewName("Bibliotecas");
		MV.addObject("biblioteca", biblioteca);
		return MV;
	}
	
	@RequestMapping(value= "/altaBiblioteca.html", method=RequestMethod.GET)
	public ModelAndView AltaBiblioteca()
	{
		ModelAndView MV = new ModelAndView();
		List<Libro> libros = servicioLibro.obtenerTodos();
		MV.setViewName("AltaBiblioteca");
		MV.addObject("libros",libros);
		return MV;
	}
	
	@RequestMapping(value= "/altaBibliotecaPost.html", method=RequestMethod.GET)
	public ModelAndView AltaBiblioteca(String fechaAlta, String ISBN)
	{
		ModelAndView MV = new ModelAndView();
		Libro libro = servicioLibro.obtenerUno(ISBN);
		biblioteca.setLibro(libro);
		Date fechaAlta2= new Date();
		try {
			fechaAlta2 = new SimpleDateFormat("yyyy-MM-dd").parse(fechaAlta);
			System.out.println(fechaAlta2);
		} catch (Exception e){
			System.out.println(fechaAlta);
		}
		biblioteca.setFechaDeAlta(fechaAlta2);
		boolean estado=servicioBiblioteca.guardar(biblioteca);
		String cartel="No se pudo agregar a la base de datos";
		if(estado)
		{
			cartel="Se agrego la biblioteca correctamente";
		}
		MV.addObject("estadoAgregar",cartel);
		List<Libro> libros = servicioLibro.obtenerTodos();
		MV.setViewName("AltaBiblioteca");
		MV.addObject("libros",libros);
		return MV;
	}
	
	@RequestMapping(value= "/modificarBiblioteca.html", method=RequestMethod.GET)
	public ModelAndView ModificarBiblioteca(int idBiblioteca)
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("ModificarBiblioteca");
		return MV;
	}
	@RequestMapping(value= "/eliminarBiblioteca.html", method=RequestMethod.GET)
	public ModelAndView EliminarBiblioteca(int idBiblioteca)
	{
		ModelAndView MV = new ModelAndView();
		Biblioteca biblioteca = servicioBiblioteca.obtenerUno(idBiblioteca);
		for (Prestamo prestamo: biblioteca.getPrestamos()) {
			servicioPrestamo.eliminar(prestamo);
		}
		
		boolean resultado = servicioBiblioteca.eliminar(biblioteca);
		
		String mensaje = "Error al eliminar Biblioteca";
		if(resultado) {
			mensaje = "Biblioteca eliminada";
		}
		
		List<Biblioteca> bibliotecas = servicioBiblioteca.obtenerTodas();
		MV.setViewName("Bibliotecas");
		MV.addObject("biblioteca", bibliotecas);
		MV.addObject("mensaje", mensaje);
		return MV;
	}
}

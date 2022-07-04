package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPrestamos {
	
	
	@RequestMapping(value= "/prestamos.html", method=RequestMethod.GET)
	public ModelAndView Clientes()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("Prestamos");
		return MV;
	}
	
	@RequestMapping(value= "/altaPrestamo.html", method=RequestMethod.GET)
	public ModelAndView altaCliente()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("AltaPrestamo");
		return MV;
	}
}

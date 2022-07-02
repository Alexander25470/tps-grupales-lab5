package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorBiblioteca {
	@RequestMapping(value= "/bibliotecas.html", method=RequestMethod.GET)
	public ModelAndView Clientes()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("Bibliotecas");
		return MV;
	}
	
	@RequestMapping(value= "/altaBiblioteca.html", method=RequestMethod.GET)
	public ModelAndView AltaBiblioteca()
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("AltaBiblioteca");
		return MV;
	}
	
	@RequestMapping(value= "/modificarBiblioteca.html", method=RequestMethod.GET)
	public ModelAndView ModificarBiblioteca(int idBiblioteca)
	{
		ModelAndView MV = new ModelAndView();

		MV.setViewName("ModificarBiblioteca");
		return MV;
	}
}

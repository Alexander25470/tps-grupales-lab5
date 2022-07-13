package frgp.utn.edu.ar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorInicio {

	
	@RequestMapping("inicio.html")
	public ModelAndView eventoRedireccionarPag1(HttpSession session)
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Inicio");
		MV.addObject("usuario", session.getAttribute("user"));
		return MV;
	}
	
	@RequestMapping("iniciarSesion.html")
	public ModelAndView iniciarSesion(String user, String password, HttpSession session)
	{
		ModelAndView MV = new ModelAndView();
		session.setAttribute("usuario", user);
		MV.addObject("usuario", user);
		MV.setViewName("Inicio");
		return MV;
	}
	
	@RequestMapping("cerrarSesion.html")
	public String cerrarSesion(HttpSession session)
	{
		ModelAndView MV = new ModelAndView();
		session.removeAttribute("usuario");
		MV.setViewName("Inicio");
		return "redirect:/inicio.html";
	}
}

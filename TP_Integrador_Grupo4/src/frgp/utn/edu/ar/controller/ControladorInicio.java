package frgp.utn.edu.ar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImp.NegUsuario;

@Controller
public class ControladorInicio {

	@Autowired
	@Qualifier("servicioUsuario")
	private NegUsuario servicioUsuario;
	
	
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
		
		Usuario usuario = servicioUsuario.iniciarSesion(user, password);
		String cartel = "";
		if(usuario != null) {
			session.setAttribute("usuario", user);
			MV.addObject("usuario", user);
		} else {			
			cartel = "Credenciales incorrectas";
			session.removeAttribute("usuario");
		}
		
		MV.addObject("cartel", cartel);
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

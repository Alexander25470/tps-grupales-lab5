package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("inicio.html")
	public ModelAndView eventoRedireccionarPag1()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Index");
		return MV;
	}
}

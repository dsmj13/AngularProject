package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/index.html")
public class SistemaController {
	
	@RequestMapping(value="html", method=RequestMethod.GET)
	public ModelAndView index(){
		
		return new ModelAndView("Index");
	}

}

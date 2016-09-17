package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.repository.PessoaRepository;

@Controller
@RequestMapping("/Pessoa")
public class PessoaController {

	@Autowired PessoaRepository pessoaRepository;

	@RequestMapping(value="cadastro.html", method=RequestMethod.POST)
	public ModelAndView Cadastro(){

		return new ModelAndView("Cadastro");
	}


}

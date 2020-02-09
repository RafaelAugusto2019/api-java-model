package br.com.modelo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.modelo.service.servico;

@RestController
public class recurso {
	
	@Autowired
	private servico servico;
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String teste(){		
		return servico.teste();
	}
}

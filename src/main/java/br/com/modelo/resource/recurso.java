package br.com.modelo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.modelo.entity.tb_cadastro;
import br.com.modelo.service.servico;

@RestController
public class recurso {
	
	@Autowired
	private servico servico;

	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String teste(){		
		return servico.teste();
	}
	
	//diferença entre modelAttribute e @resquestBody
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvarMysql(@ModelAttribute tb_cadastro pessoa){	
		
		return servico.salvarBD(pessoa);
	}
}

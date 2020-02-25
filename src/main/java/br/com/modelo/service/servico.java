package br.com.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.modelo.entity.tb_cadastro;
import br.com.modelo.interfaces.PessoaRepository;

@Service
public class servico{
	
	@Autowired PessoaRepository pessoaRepository;
	
	public String teste(){return "Funcionou!";}
	
	public String salvarBD(tb_cadastro pessoa){
		
		try {
			pessoaRepository.save(pessoa);
		} catch (Exception e) {
			return e.toString();
		}
		
		
		return "Salvo Com Sucesso!";
	}

}

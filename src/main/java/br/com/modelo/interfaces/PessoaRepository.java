package br.com.modelo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.modelo.entity.tb_cadastro;

@Repository
public interface PessoaRepository extends JpaRepository< tb_cadastro, Integer>{
	
}

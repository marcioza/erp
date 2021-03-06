package br.com.festalegal.erp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.festalegal.erp.model.Contato;
import br.com.festalegal.erp.repository.ContatoRepository;

@RestController
class ContatoRestController {
	
	@RequestMapping("/contatos")
	List<Contato> contatos() {
		return (List<Contato>) this.contatoRepository.findAll();
	}
	
	@Autowired ContatoRepository contatoRepository;
}
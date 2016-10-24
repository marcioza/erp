package br.com.festalegal.erp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import br.com.festalegal.erp.domain.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long> {

    List<Contato> findByNome(String nome);
}
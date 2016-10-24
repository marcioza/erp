package br.com.festalegal.erp.repository;

import java.util.Collection;
import org.springframework.data.repository.PagingAndSortingRepository;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
import br.com.festalegal.erp.model.Contato;

public interface ContatoRepository extends PagingAndSortingRepository<Contato, Long> {
	Collection<Contato> findByNome(String nome);
}

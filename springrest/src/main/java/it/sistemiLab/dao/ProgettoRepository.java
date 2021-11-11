package it.sistemiLab.dao;

import it.sistemiLab.model.Progetto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProgettoRepository extends CrudRepository<Progetto, Long> {
	Progetto findByNomeProgetto (String nomeProgetto);
}

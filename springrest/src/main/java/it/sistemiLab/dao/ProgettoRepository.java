package it.sistemiLab.dao;

import it.sistemiLab.model.Progetto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Estende CrudRepository ed eredita tutti i metodi di CRUD. 
 * Definisce il metodo di login.
 * 
 * 
 *
 * @see CrudRepository
 *
 */
@Repository
@Transactional
public interface ProgettoRepository extends CrudRepository<Progetto, Long>{

	Progetto findByNome(String nomeProgetto);
	
}

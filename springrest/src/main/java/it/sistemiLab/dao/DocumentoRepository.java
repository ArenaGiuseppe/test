package it.sistemiLab.dao;

import it.sistemiLab.model.Documento;
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
public interface DocumentoRepository extends CrudRepository<Documento, Long>{

	Documento findByNome(String nomeDocumento);
	
}

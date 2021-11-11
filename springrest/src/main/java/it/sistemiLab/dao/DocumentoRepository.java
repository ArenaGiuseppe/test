package it.sistemiLab.dao;

import it.sistemiLab.model.Documento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DocumentoRepository extends CrudRepository <Documento, Long> {
	 Documento findByNomeDocumento (String nomeDocumento);
}
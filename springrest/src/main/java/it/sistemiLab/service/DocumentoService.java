package it.sistemiLab.service;

import it.sistemiLab.dao.DocumentoRepository;
import it.sistemiLab.dto.DocumentoDTO;
import it.sistemiLab.model.Documento;
import org.springframework.stereotype.Service;


/**
 * Estende AbstractService con parametri Documento e DocumentoDTO.
 * Implementa il metodo di login ed eredita quelli Abstract. 
 * 
 * 
 * 
 * @see AbstractService
 * @see ServiceDTO
 */
@Service
public class DocumentoService extends AbstractService<Documento,DocumentoDTO> {

	//ALL crud methods in AbstractService

	//ricerca by nome
	public DocumentoDTO findByNome(String nomeDocumento) {
		return converter.toDTO(((DocumentoRepository)repository).findByNome(nomeDocumento));
	}

}
